import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n ,cnt=0;
        boolean[] arr = new boolean[43];
        for(int i=0;i<10;i++){
            n=Integer.parseInt(br.readLine());
            arr[n%42]= true;
        }
        for(int i=0;i<=42;i++){
            if(arr[i]==true) cnt++;
        }
        bw.write(cnt+"");
        br.close();
        bw.flush();
    }
}