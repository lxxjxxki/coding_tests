import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            bw.write(binarySearch(A, Integer.parseInt(st.nextToken()))+"\n");
        }
        bw.flush();
        bw.close();
    }
    private static int binarySearch(int[] A, int key){
        int low = 0;
        int high = A.length-1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if(key == A[mid]) return 1;
            else if (key > A[mid]) low = mid + 1;
            else if (key < A[mid]) high = mid - 1;
        }
        return 0;
    }
}