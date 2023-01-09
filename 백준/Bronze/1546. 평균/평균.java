import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n ;
        int max=0;
        double average=0;
        n=Integer.parseInt(br.readLine());
        String[] arr1 = br.readLine().split(" ");
        double[] arr2 = new double[n];
        for(int i=0;i<n;i++){
            if(max<Integer.parseInt(arr1[i])) max = Integer.parseInt(arr1[i]);
            arr2[i] = Double.parseDouble(arr1[i]);
        }
        for(int i=0;i<n;i++){
            average += arr2[i]/max*100;
        }
        average = average/n;
        bw.write(average+"");
        br.close();
        bw.flush();
    }
}