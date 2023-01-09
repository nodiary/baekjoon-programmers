import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int max,maxIndex=0;
		int[] arr = new int[9];
		for(int i=0;i<9;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		max = arr[0];
		for(int i=0;i<9;i++) {
			if(max<=arr[i]) {
				max = arr[i];
				maxIndex = i+1;
			}
		}

		bw.write(max+"\n"+maxIndex);
		br.close();
		bw.flush();
		bw.close();
	}
}