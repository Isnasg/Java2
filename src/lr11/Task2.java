package lr11;
import java.util.Scanner;
public class Task2 {
    public static Scanner in=new Scanner(System.in); //ïåðåìåííàÿ äëÿ ââîäà
    public static int [] EnterArray(int i, int [] arr) { //ìåòîä ââîäà
        if (i<0) {return arr;}
        else {
            System.out.print("["+i+"]=");
            int n=in.nextInt();
            arr[i]=n;
            EnterArray(i-1, arr); //ðåêóðñèÿ
        }
        return arr;
    }
    public static void PrintArray (int i, int [] arr) //ìåòîä âûâîäà
    {
        if(i<0) return;
        else PrintArray(i-1, arr); //ðåêóðñèÿ
        System.out.print("[" + (i) + "]=" + arr[i]+" ");
    }
    public static void main(String[] args) {
        try {
            System.out.println("Ïðîãðàììà ïîçâîëÿåò ââåñòè è âûâåñòè îäíîìåðíûé ìàññèâ öåëûõ ÷èñåë.\n"
                    + "Äëÿ ââîäà è âûâîäà ìàññèâà èñïîëüçóþòñÿ ðåêóðñèâíûå ìåòîäû âìåñòî öèêëîâ for.");
            System.out.println("Ââåäèòå äëèíó ìàññèâà:");
            int size=in.nextInt(); //ââîä äëèíû ìàññèâà
            int [] array=new int[size]; //ñîçäàíèå ìàññèâà
            System.out.println("Ââåäèòå ýëåìåíòû ìàññèâà ìåòîäîì ðåêóðñèè:");
            array=EnterArray(size-1, array);
            System.out.println("-------------------------------------------------");
            System.out.println("âûâîä ìàññèâà ìåòîäîì ðåêóðñèè");
            PrintArray(size-1, array);
        }
        catch (Exception error) { System.out.println("Ïðè îáðàáîòêå äàííûõ ïðîèçîøëà îøèáêà!"); } //îáðàáîòêà èñêëþ÷åíèÿ
    }
}
