//Question - Leetcode(763 Medium)
//Here Make use of two pointers start and end and use LastIndexOf() Method to update end limit of the current partition at each character, length of the current partition is end-start+1
class Solution {
    public List<Integer> partitionLabels(String s) {
       int start = 0;
       int end = 0;
       ArrayList<Integer> list = new ArrayList<>();
       for(int i=0; i<s.length(); i++){
        end = Math.max(end,s.lastIndexOf(s.charAt(i)));
        if(i == end){
            list.add(end-start+1);
            start = i+1;
        }
       }
    return list;   
    }
}
