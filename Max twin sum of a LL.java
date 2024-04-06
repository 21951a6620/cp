class Solution {
    public int pairSum(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode Node = head;
        while(Node != null){
            st.push(Node);
            Node = Node.next;
        }
        int max = 0;
        while(st.size() > st.size()/2){
            max = Math.max(max,head.val+st.pop().val);
            head = head.next;
        }
        return max;        
    }
}
