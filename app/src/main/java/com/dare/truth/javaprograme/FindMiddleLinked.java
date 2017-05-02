package com.dare.truth.javaprograme;

/**
 * Created by User on 5/2/2017.
 */

public class FindMiddleLinked {
    Node head;

    public static void main(String[] args) {
        FindMiddleLinked llist = new FindMiddleLinked();
        for (int i=5; i>0; --i)
        {
            llist.pushItem(i);


        }
        llist.printList();
        llist.middleLinled();
    }

    private void printList() {
        Node nod=head;
        System.out.print("Linked List ");
        while (nod!=null)
        {
            System.out.print(nod.data+", ");
            nod=nod.next;
        }

    }


    public void middleLinled()
    {
        Node fast=head;
        Node slow=head;

        if (head!=null)
        {
            while (fast!=null && fast.next!=null)
            {
                fast=fast.next.next;
                slow=slow.next;
            }
            System.out.println("Print middle node = "+slow.data);
        }
    }



    public void pushItem(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;

    }





}
