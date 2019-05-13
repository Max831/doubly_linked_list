import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class DLList {

        private Node head;
        private Node tail;
        private int size=0;


    public DLList(){
        }


        public void addFirst(Object object) {
            Node node=new Node(object);
             if(head==null) {
                node.setValue(object);
                head=node;
                tail=node;
                size++;
            }
            else {
                head.setPrev(node);
               node.setNext(head);
               node.setPrev(null);
                node.setValue(object);
                head=node;
                size++;
             }
        }

        public void addLast(Object object)
        {
            Node node=new Node(object);
            if(tail==null)
            {
                node.setValue(object);
                head=node;
                tail=node;
                size++;
            }
            else {
                node.setValue(object);
                tail.setNext(node);
                node.setPrev(tail);
                tail=node;
                node.setNext(null);
                size++;
            }
        }


        public void addMerg(Object object)
        {Node node=new Node();
        Node node1=new Node(object);
        node=head;
        node.setPrev(head.getPrev());
        node.setNext(head.getNext());
            for (int i=0;i<(size/2);i++) {
                node=node.getNext();
            }
            node1.setNext(node);
            node1.setPrev(node.getPrev());
            node.getPrev().setNext(node1);
            node.setPrev(node1);
            node1.setValue(object);
            size++;
        }
        public void remove_Merge(){
            Node node=new Node();
            node=head;
            node.setPrev(head.getPrev());
            node.setNext(head.getNext());
            for (int i=0;i<(size/2);i++) {
                node=node.getNext();
            }
            Node node1=new Node();
            node1=node.getNext();
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
        }

            public void removeFirst(){
               head.getNext().setPrev(null);
                head=head.getNext();
                size--;
            }

            public void removeLast(){
                tail.getPrev().setNext(null);
                tail=tail.getPrev();
                size--;
            }

        public void display(){
            Node node=new Node();
            node=head;
                while(node!=null)
            {
                    System.out.println(node);
                node=node.getNext();
            }
        }

        public void obrat_display(){
            Node node=new Node();
            node=tail;
            while (node!=null)
            {
                System.out.println(node);
                node=node.getPrev();
            }
        }




}

