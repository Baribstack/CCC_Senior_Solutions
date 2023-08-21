import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_11_S2 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] answers = new String[num];
        int count = 0;
        for(int i = 0; i<num; i++){
            answers[i] = br.readLine();
        }
        for(int i = 0 ; i < num; i++){
            if(br.readLine().equals(answers[i])){
                count++;
            }
        }
        System.out.println(count);
        //WORKS !!!
    }
}
