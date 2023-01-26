import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine());//test case의 수
		int[][] arr = new int[15][15];
		
		for(int i=0;i<15;i++) {
			arr[i][0]=1;
			arr[0][i]=i+1;
		}
		for(int i=1;i<15;i++) {
			for(int j=1;j<15;j++) {
				arr[i][j]=arr[i][j-1]+arr[i-1][j];
			}
		}
		for(int m=0;m<c;m++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			bw.write(arr[k][n-1]+"\n");
		}
		br.close();
		bw.flush();
	}
}