import java.util.*;
import java.io.*;
public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rows = Integer.parseInt(br.readLine());
        int cols = Integer.parseInt(br.readLine());
        String[][] canvas = new String[rows][cols];
        for(int i =0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                canvas[i][j] = "B";
            }
        }
        int gold = 0;
        int numChanges = Integer.parseInt(br.readLine());
        List<String> currentString = new ArrayList<>();
        /*for(int i =0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(canvas[i][j]+" ");
            }
            System.out.println();
        }*/
        int j = 0;
        for(int i = 0; i < numChanges; i++){
            currentString = Arrays.asList(br.readLine().split(" "));
            j = Integer.parseInt(currentString.get(1))-1;
            if(currentString.get(0).equals("C")){
                for(int k = 0; k < rows; k++){
                    if(canvas[k][j].equals("B")){
                        canvas[k][j] = "G";
                        gold++;
                    }else if(canvas[k][j].equals("G")){
                        canvas[k][j] = "B";
                        gold--;
                    }
                }
            }
            if(currentString.get(0).equals("R")){
                j = Integer.parseInt(currentString.get(1))-1;
                for(int k = 0; k < cols; k++){
                    if(canvas[j][k].equals("B")){
                        canvas[j][k] = "G";
                        gold++;
                    }else if(canvas[j][k].equals("G")){
                        canvas[j][k] = "B";
                        gold--;
                    }
                }
            }
            System.out.println();
            System.out.println(currentString);
            for(int l =0; l < rows; l++){
            for(int q = 0; q < cols; q++){
                System.out.print(canvas[l][q]+" ");
            }
                System.out.println();
            }
            System.out.println(gold);
        }
        System.out.print(gold);
    }

}
