import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        int[] arr1 = {1,1,2,2,2,8};
        StringTokenizer st = new StringTokenizer(a);
        for(int i=0;i<6;i++) {
            arr1[i] = arr1[i] - Integer.parseInt(st.nextToken());
            System.out.print(arr1[i]);
            if(i==5){
                continue;
            }else{
                System.out.print(" ");
            }
        }
    }
}