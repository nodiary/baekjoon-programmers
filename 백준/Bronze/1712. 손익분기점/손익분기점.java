import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());//고정비용
		int b = Integer.parseInt(st.nextToken());//가변비용
		int c = Integer.parseInt(st.nextToken());//노트북 가격
		int j = -1;
		if(c>b) {//판매가격이 가변비용보다 커야만 손익분기좀이 온다..
			j = (a/(c-b)) + 1; 
		}
		bw.write(j+"");
		br.close();
		bw.flush();
	}
}