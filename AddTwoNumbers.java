//singly linkedlist
class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) 
        {
            this.val = val; 
        }
        ListNode(int val, ListNode next) 
        {
             this.val = val; this.next = next; 
        }
    }

class Solution {
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        int carry = 0;
        while(l1!=null||l2!=null||carry!=0){
            int sum = carry;
            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2 !=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry = sum/10;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
        }
        return dummy.next;
    }
}    

public class AddTwoNumbers {
    public static void main(String[]args){
       
        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));

        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));

        Solution solution = new Solution();

        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result linked list
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }

        

    }
}
