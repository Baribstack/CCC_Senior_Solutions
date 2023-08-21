import java.util.*;
import java.io.*;
public class CCC_13_S2{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxWeight = Integer.parseInt(br.readLine());
        int numCars = Integer.parseInt(br.readLine());
        Queue<Integer> carWeights = new LinkedList<>();
        for(int i = 0; i < numCars; i++){
            carWeights.add(Integer.parseInt(br.readLine()));
        }
        int currentWeight = 0;
        int maxCars = 0;
        Queue<Integer> bridgeCarWeights = new LinkedList<Integer>();
        for(int i = 0; i < numCars; i++){
            if(bridgeCarWeights.size() >= 4){
               // System.out.println("Executes remove");
                currentWeight -= bridgeCarWeights.remove();
            }
            currentWeight += carWeights.peek();
            bridgeCarWeights.add(carWeights.remove());
            if(currentWeight > maxWeight){
                break;
            }
            maxCars++;
           // System.out.println(maxCars + " "+ currentWeight);
        }
        System.out.print(maxCars);
        br.close();
    }
}