import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arrayList.add(br.readLine());
        }
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return Integer.compare(o1.length(), o2.length());
            }
        });
        ArrayList<String> uniqueList = new ArrayList<>();
        for (String str : arrayList) {
            if (!uniqueList.contains(str)) {
                uniqueList.add(str);
            }
        }
        for (String str : uniqueList) {
            System.out.println(str);
        }
    }
}