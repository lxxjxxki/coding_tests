import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] card1 = new int[n];
        for (int i = 0; i < n; i++) {
            card1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(card1);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] card2 = new int[m];
        for (int i = 0; i < m; i++) {
            card2[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < m; i++) {
            System.out.print(binarySearch(card2[i], card1)+" ");
        }
    }

    public static int binarySearch(int key, int[] card) {
        int low = 0;
        int high = card.length-1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if(key == card[mid]) return 1;
            else if (key > card[mid]) low = mid + 1;
            else if (key < card[mid]) high = mid - 1;
        }
        return 0;
    }
}
