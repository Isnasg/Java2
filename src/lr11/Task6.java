package lr11;

    import java.util.Scanner;

public class Task6 {
    public static Node createHead(Node head) {
        Node tail=head;
        for (int i = 0; i <9; i++) {
            tail.next=new Node(i+1, null);
            tail=tail.next;
        }
        return head;
    }
    public static Node createTail(Node head) {
        for (int i=0; i<=9; i++) {
            head=new Node(i, head);
        }
        return head;
    }
    public static String toString(Node head) {
        Node ref = head;
        String str="";
        while (ref != null) {
            str=str+" " +String.valueOf(ref.value);
            ref = ref.next;
        }
        return str;
    }
    public static Node AddFirst(Node head, int newValue) {
        head=new Node (newValue, head);
        return head;
    }
    public static Node AddLast(Node head, int newValue) {
        Node newtail=new Node(newValue,null);
        Node ref=head;
        while (ref.next !=null) {ref=ref.next;}
        ref.next=newtail;
        return head;
    }
    public static Node Insert(Node head, int newValue, int num) {
        Node newNode=new Node(newValue, null);
        Node ref=head;
        int k=1;
        while (ref.next !=null && (k<num)) {
            ref=ref.next;
            k++;
        }
        newNode.next=ref.next.next;
        ref.next=newNode;
        return head;
    }
    public static Node RemoveFirst(Node head) {
        head=head.next;
        return head;
    }
    public static Node RemoveLast(Node head) {
        Node ref = head;
        while (ref.next.next != null) { ref = ref.next;
        }
        ref.next=null;
        return head;
    }
    public static Node Remove(Node head, int delValue) {
        Node ref = head;
        int k=1;
        while (ref.next!= null && (k<delValue )) { ref = ref.next;
            k++;
        }
        ref.next=ref.next.next;
        return head;
    }
    public static Node createHeadRec(int i,Node head) {
        if (i<9)
        {
            Node tail=head;
            tail.next=new Node(i+1, null);
            tail=tail.next;
            createHeadRec(i+1, tail);
        }
        return head;
    }
    public static Node createTailRec(int i,Node head) {
        Node result=null;
        if (i<9) {
            head=new Node(i+1, head);
            result=createTailRec(i+1, head); }
        if (i==9) result=head;
        return result;
    }
    public static String toStringRec(Node head) {
        Node ref = head;
        String result="";
        if (ref != null) {
            String str=" " +String.valueOf(ref.value);
            result=str+toStringRec(ref.next);
        }
        else return result;

        return result;
    }
    public static void main(String[] args) {
        try {
            Scanner in=new Scanner(System.in);
            Node head1=new Node(0, null);
            Node head2=null;
            head1=createHead(head1);
            System.out.println("Ввод с головы:"+toString(head1));
            head2=createTail(head2);
            System.out.println("Ввод с хвоста:"+toString(head2));
            System.out.println("Введите значение нового элемента:");
            int n=in.nextInt();
            head1=AddFirst(head1,n);
            System.out.println("Метод добавления элемента в начало списка (головы):");
            System.out.println("Линейный односвязанный список:"+toString(head1));
            System.out.println("Метод добавления элемента в конец списка:");
            head1=AddLast(head1, n);
            System.out.println("Линейный односвязанный список:"+toString(head1));
            System.out.println("Метод добавления элемента с заданным номером из списка");
            System.out.println("Введите номер, куда вставить новый элемент:");
            int num=in.nextInt();
            head1=Insert(head1, n, num);
            System.out.println("Линейный односвязанный список:"+toString(head1));
            System.out.println("Метод удаления элемента с начала списка(головы)");
            head1=RemoveFirst(head1);
            System.out.println("Линейный односвязанный список:"+toString(head1));
            System.out.println("Метод удаления элемента с конца списка(с хвоста)");
            head1=RemoveLast(head1);
            System.out.println("Линейный односвязанный список:"+toString(head1));
            System.out.println("Метод удаления элемента с заданным номером из списка");
            System.out.println("Введите номер элемента, который надо удалить:");
            num=in.nextInt();
            head1=Remove(head1, num);
            System.out.println("Линейный односвязанный список:"+toString(head1));
            Node Rechead1=new Node(0, null);
            Node Rechead2=new Node(0, null);
            System.out.println("Методы заполнения односвязного линейного списка и его вывода через рекурсию:");
            Rechead1=createHeadRec(0, Rechead1);
            System.out.println("Линейный односвязанный список ввод с головы(рекурсией):"+toStringRec(Rechead1));
            Rechead2=createTailRec(0,Rechead2);
            System.out.println("Линейный односвязанный список ввод с хвоста(рекурсией):"+toStringRec(Rechead2));
        }
        catch (Exception error) { System.out.println("Ошибка!"); }
    }
}
class Node {
    public int value;
    public Node next;
    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}