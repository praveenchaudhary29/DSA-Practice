//Question - Leetcode(445 Medium)
//Here we make use of two ArrayList to store the Numbers and then iteratively add up the digits from least significant digit to most significant digit while also propogating the carry forward and then store the result in a new ArrayList.
//Here Instead of ArrayList, we can also use Stack.
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        while(l1 != null){
            list1.add(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            list2.add(l2.val);
            l2 = l2.next;
        }
        ArrayList<Integer> result = new ArrayList<>();
        int carry = 0;
        while( !list1.isEmpty() || !list2.isEmpty() ){
            int sum = 0;
            if(list1.isEmpty()){
               sum = list2.get(list2.size()-1) + carry;
               list2.remove(list2.size()-1);
            }else if(list2.isEmpty()){
              sum = list1.get(list1.size()-1) + carry;
              list1.remove(list1.size()-1);

            }else{
             sum = list1.get(list1.size()-1) + list2.get(list2.size()-1) + carry;
             list1.remove(list1.size()-1);
             list2.remove(list2.size()-1);
            }
            if(sum >= 10){
                sum = sum-10;
                carry = 1;
            }else{
                carry = 0;
            }
            result.add(sum);

        }
        if(carry == 1)result.add(1);
        ListNode ans = new ListNode(result.get(result.size()-1));
        ListNode ans2 = ans;
        for(int i = result.size()-2; i>=0; i--){
            ListNode temp = new ListNode(result.get(i));
            ans.next = temp;
            ans = ans.next;
        }
    return ans2;
    }
}
