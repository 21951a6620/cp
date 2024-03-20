class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
         ListNode temp = head;
        while(temp!=null){
            s1.push(temp.val);
            temp=temp.next;
        }
        s2.push(s1.pop());
        while(!s1.empty()){
            if(s2.peek()>s1.peek()){
                s1.pop();
            }
            else{
                s2.push(s1.pop());
            }
        }
        ListNode result = new ListNode(s2.pop());
        ListNode newhead = result;
        while(!s2.empty()){
            newhead.next = new ListNode(s2.pop());
            newhead = newhead.next;
        }
        return result;
        
    }
}



