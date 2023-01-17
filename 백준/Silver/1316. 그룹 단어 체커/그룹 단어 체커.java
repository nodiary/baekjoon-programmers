import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 0;
        int caseCnt = Integer.parseInt(br.readLine());// test case 개수

        for(int i=0;i<caseCnt;i++){
            String str = br.readLine();//2행부터 주어진 문자열 입력받기..
            if(str.length()==1){    //문자열 길이가 1이면 그룹단어..
                cnt++;
                continue;
            }
            boolean[] chkArr = new boolean[26];
            boolean flag = false;
            for(int j=0;j<str.length();j++){
                char c = str.charAt(j);
                if(j==0){
                    chkArr[c-97]=true;
                } else {
                    if(chkArr[c-97]==true){ //앞전에 나왔던 알파벳이면..
                        if(c==str.charAt(j-1)){ // 직전 알파벳과 연속되면 통과..
                            flag=true;
                            continue;
                        } else{ //다르면 탈출..
                            flag=false;
                            break;
                        }
                    }else{  //처음 나온 알파벳
                        chkArr[c-97]=true;  //알파벳 배열 값 -> true..
                    }
                    flag=true;
                }
            }
            if(flag==true) cnt++;
        }
        bw.write(cnt+"");
        br.close();
        bw.flush();
    }
}