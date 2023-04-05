import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        char[] arr = new char[S.length()];
        for(int i = 0; i < S.length(); i++){
            arr[i] = S.charAt(i);
        }
        int[] dic = new int['z'-'a'+1];
        for(int i = 0; i <= (int)'z'-'a'; i++){
            dic[i] = -1;
            for(int j = 0; j < S.length(); j++){
                if(dic[i] != -1)
                    continue;
                if('a'+i == arr[j]){
                    dic[i] = j;
                }
            }
            System.out.print(dic[i]+" ");
        }
    }
}