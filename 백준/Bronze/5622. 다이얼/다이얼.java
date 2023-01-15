import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] arr = br.readLine().toCharArray();
        int time = 0;
        for (int i=0;i<arr.length;i++){
            int c = (int)arr[i];
            if(c>=65 && c<=67){
                time += 3;
            } else if (c>=68 && c<=70) {
                time += 4;
            } else if (c>=71 && c<=73) {
                time += 5;
            } else if (c>=74 && c<=76) {
                time += 6;
            } else if (c>=77 && c<=79) {
                time += 7;
            } else if (c>=80 && c<=83) {
                time += 8;
            } else if (c>=84 && c<=86) {
                time += 9;
            } else if (c>=87 && c<=90) {
                time += 10;
            }
        }
        bw.write(time+"");
        br.close();
        bw.flush();
    }
}