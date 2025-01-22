import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class People{
    int age;
    String name;
    int index;

    People(int age, String name, int index) {
        this.age = age;
        this.name = name;
        this.index = index;
    }
    @Override
    public String toString() {
        return age + " " + name;
    }

}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<People> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            arrayList.add(new People(age, name, i));
        }

        Collections.sort(arrayList, new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                if (o1.age != o2.age) {
                    return Integer.compare(o1.age, o2.age);
                } else {
                    return Integer.compare(o1.index, o2.index);
                }
            }
        });

        for (People p : arrayList) {
            System.out.println(p);
        }
    }
}