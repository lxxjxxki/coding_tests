import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (N > 0){
            arrayList.add(N % 10);
            N /= 10;
        }
        arrayList.sort((o1, o2) -> o2-o1);
        for (int num : arrayList) {
            System.out.print(num);
        }
    }
}