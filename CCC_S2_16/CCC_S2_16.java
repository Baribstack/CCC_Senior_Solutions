import java.util.*;
import java.io.*;
public class CCC_S2_16{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int question = Integer.parseInt(br.readLine());
        int numCitizens  = Integer.parseInt(br.readLine());
        int[] dmojCitizens = new int[numCitizens];
        int[] pegCitizens = new int[numCitizens];
        String[] temparr = br.readLine().split(" ");
        for(int i = 0; i < numCitizens; i++){
            dmojCitizens[i] = Integer.parseInt(temparr[i]);
        }
        temparr = br.readLine().split(" ");
        for(int i = 0; i < numCitizens; i++){
            pegCitizens[i] = Integer.parseInt(temparr[i]);
        }
        int totalSpeed = 0;
        if(question == 1){
            Arrays.sort(dmojCitizens);
            Arrays.sort(pegCitizens);
            for(int i = 0; i < numCitizens; i++){
                if(dmojCitizens[i] >= pegCitizens[i]){
                    totalSpeed += dmojCitizens[i];
                }else{
                    totalSpeed += pegCitizens[i];
                }
            }
        }else{
            Arrays.sort(dmojCitizens);
            Arrays.sort(pegCitizens);
            int j = numCitizens -1;
            for(int i = 0; i < numCitizens; i++){
                if(dmojCitizens[i] >= pegCitizens[j]){
                    totalSpeed+= dmojCitizens[i];
                }else{
                    totalSpeed+= pegCitizens[j];
                }
                j--;
            }
            
        }
        System.out.print(totalSpeed);
    }
}