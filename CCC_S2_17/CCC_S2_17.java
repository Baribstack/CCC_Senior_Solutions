import java.io.*;
import java.util.*;
public class CCC_S2_17{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numMeasurements = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        int[] measurements = new int[numMeasurements];
        for(int i = 0; i < numMeasurements; i++){
            measurements[i] = Integer.parseInt(temp[i]);
        }
        Arrays.sort(measurements);
        for(int i = 0; i < measurements.length; i++){
            System.out.print(measurements[i] + " ");
        }
        System.out.println();
        if(numMeasurements%2!=0){
            int highs = (int) Math.ceil(measurements.length/2)+1;
            for(int i = (int) Math.ceil(measurements.length/2); i > 0; i--){
             System.out.print(measurements[i]+" "+measurements[highs]+" ");
             highs++;
            }
            System.out.print(measurements[0]);
        }else{
            int highs = (int) Math.ceil(measurements.length/2);
            for(int i = (int) Math.ceil(measurements.length/2)-1; i > -1; i--){
             System.out.print(measurements[i]+" "+measurements[highs]+" ");
             highs++;
            }
        }
    }
}