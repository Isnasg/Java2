package lr11.Task5;
//Наращивание с хвоста
public class Task5_1 {
    public static void main(String[] args) {
        Node51 head = new Node51(0, null);
        Node51 tail = head;
        for (int i = 0; i < 9; i++) {
            tail.next = new Node51(i + 1, null);
            tail = tail.next;
        }
        Node51 ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
class Node51 {
    public int value;
    public Node51 next;
    Node51(int value, Node51 next) {
        this.value = value;
        this.next = next;
    }
}
