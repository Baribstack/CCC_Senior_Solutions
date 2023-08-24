
// this one works for all test cases, use this one
import java.io.*;
import java.util.*;
public class Optimized1 {
    public static void main(String [] args) throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rows = Integer.parseInt(br.readLine());
        int cols = Integer.parseInt(br.readLine());
        int gold = 0;
        int numChanges = Integer.parseInt(br.readLine());
        List<String> currentString = new ArrayList<>();
        int k = 0;
        int[] freqRow = new int[rows];
        int[] freqCol = new int[cols];
        for(int i = 0; i < numChanges; i++){
            currentString = Arrays.asList(br.readLine().split(" "));
            k = Integer.parseInt(currentString.get(1))-1;
            if(currentString.get(0).equals("C")){
                freqCol[k]++;
            }else{
                freqRow[k]++;
            }

        }
       
        int crossPath = 0;
        int crossPathC = 0;
        for(int i = 0; i < rows; i++){
            if(freqRow[i] % 2 != 0){
                gold = gold + cols;
                crossPath++;
            }
        }
        for(int i = 0; i < cols ; i++){
            if(freqCol[i] % 2 !=0 ){
                gold = gold + rows;
                crossPathC++;
            }
        }
        gold = gold - crossPath * crossPathC * 2;
        System.out.println(gold);
    }
}
