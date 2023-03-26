package lr11.Task5;
//главный класс Наращивание головы
public class Task5_2 {
    public static void main(String[] args) {
        Node52 head=null;
        for (int i =9; i>=0; i--) {
            head=new Node52(i, head);
        }
        Node52 ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value); ref = ref.next;
        }
    }
}
class Node52{
    public int value;
    public Node52 next;
    Node52(int value, Node52 next) {
        this.value = value;
        this.next = next;
    }
}

