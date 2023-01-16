import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 0;
        String str = br.readLine();//주어진 문자열 입력받기..
        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};//확인해야할 알파벳들 배열로.. 
        for(int i=0;i<str.length();i++){
            String str2 = str.substring(i);//문자열 0자리부터 확인..
            int length = 0;
            for(int j=0;j<arr.length;j++){  //확인해야할 알파벳 배열 반복문으로 비교..
                length = arr[j].length();   //원소 문자열의 길이 .. ( 2 or 3 )
                if(str2.length()<arr[j].length()){  //남은 문자열 길이가 원소 문자열 길이보다 짧으면 비교 불가.. 건너뛰기
                    continue;
                }else{
                    String str3 = str2.substring(0, length);
                    if (str3.equals(arr[j])) {    //만약 일치한다면
                        i += length - 1;          //arr[j]와 일치하는 문자열 건너뛰고 다음부터..
                        break;
                    }
                }
            }
            cnt++;    //알파벳 count..
        }
        bw.write(cnt+"");
        br.close();
        bw.flush();
    }
}