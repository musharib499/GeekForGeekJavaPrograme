package com.dare.truth.javaprograme;

/**
 * Created by User on 5/2/2017.
 */

public class PairWiseSwapLinkedList {
    Node head;

    public static void main(String[] args) {
        PairWiseSwapLinkedList list=new PairWiseSwapLinkedList();
        for (int i=9; i>0; --i)
        {
            list.pushItem(i);


        }
        list.printList("List  ");
        list.pairWishSwap();
        list.printList("After pairwise swip ");

    }
    private void printList(String s) {
        Node nod=head;
        System.out.print(s);
        while (nod!=null)
        {
            System.out.print(nod.data+", ");
            nod=nod.next;
        }

    }

    public void pushItem(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;

    }

 public void  pairWishSwap()
 {

     /*     List  1, 2, 3, 4, 5, 6, 7, 8, 9, After pairwise swip 2, 1, 4, 3, 6, 5, 8, 7, 9,
*/
     Node temp =head;
     while (temp!=null && temp.next!=null)
     {
         int k=temp.data;
         temp.data=temp.next.data;
         temp.next.data=k;
         temp=temp.next.next;
     }

 }
}
