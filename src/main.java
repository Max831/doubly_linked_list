
public class main {
    public static void main(String args[]) {
        DLList list1 = new DLList();
        list1.addFirst(1);
        list1.addFirst(2);
        list1.addFirst(3);
//        list1.addFirst(4);
        list1.addLast(5);
        list1.addLast(8);

        list1.addMerg(6);
        //list1.remove_Merge();
   //     list1.obrat_display();
        list1.display();
    }
}
