public class Q1_2InsertionSortForListNode{

    private static ListNode listNodeInstionSort(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = null;
        ListNode temp = head;
        while(temp != null){
            ListNode curr = dummy;
            ListNode next= temp.next;
            while(curr != null && curr.next.val <= temp.val){
                curr = curr.next;
            }
            temp.next = curr.next;
            curr.next = temp;
            temp = next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        
    }
}

class ListNode{ //singlyLinkList
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}