import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n;
        n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            char[] arr = br.readLine().toCharArray();
            int score=0;
            int bonus=0;
            boolean flag = false;
            for(int j=0;j<arr.length;j++){
                if(arr[j]=='O') {
                    bonus += 1;
                    score += bonus;
                }else{
                    bonus = 0;
                }
            }
            bw.write(score+"\n");
        }
        br.close();
        bw.flush();
    }
}