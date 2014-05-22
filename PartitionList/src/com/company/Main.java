package com.company;


public class Main {

    /*
    * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

    You should preserve the original relative order of the nodes in each of the two partitions.

    For example,
    Given 1->4->3->2->5->2 and x = 3,
    return 1->2->2->4->3->5.
    * */



      public static void main(String[] args) {
	   ListNode head = new ListNode(1);
          head.next = new ListNode(4);
          head.next.next = new ListNode(3);
          head.next.next.next = new ListNode(2);
          head.next.next.next.next = new ListNode(5);
          head.next.next.next.next.next = new ListNode(2);

          ListNode result = partition(head, 3);

          head = new ListNode(2);
          head.next = new ListNode(3);
          head.next.next = new ListNode(1);
          result = partition(head, 2);

          head = new ListNode(2);
          head.next = new ListNode(1);
          result = partition(head, 2);
    }

    public static ListNode partition(ListNode head, int x) {
       if(head==null){
           return  null;
       }
       ListNode runningPointer = head;
       ListNode lastMin = null;
       ListNode firstMax = null;
       ListNode lastMax = null;

       boolean needUpdate = false;
        while (runningPointer != null)
        {
            if(runningPointer.val < x){
                if(firstMax != null){
                    ListNode next = runningPointer.next;
                    if(lastMin != null){
                        lastMin.next = runningPointer;
                    }
                    else
                    {
                        head = runningPointer;
                    }
                    runningPointer.next = firstMax;
                    lastMax.next = next;
                }

                lastMin = runningPointer;
            }
            else {
                if(firstMax == null){
                    firstMax = runningPointer;
                }
                lastMax = runningPointer;
            }

            runningPointer = runningPointer.next;

        }

        return head;
    }
}
