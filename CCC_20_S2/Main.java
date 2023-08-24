import java.util.*;
import java.io.*;
public class Main{
    public static void main(String [] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int rows = Integer.parseInt(br.readLine());
       int cols = Integer.parseInt(br.readLine());
       int[][] room = new int[rows][cols];
       String[] convert;
        for(int i = 0; i < rows; i++){
            convert = br.readLine().split(" ");
            for(int j = 0;j < cols; j++){
                room[i][j] = Integer.parseInt(convert[j]);
            }
       }
       Queue<Node> visited = new LinkedList<>();
       visited = getAllFactors(visited, room[0][0]);
       int size = visited.size();
       boolean isYes = false;
      /*  for(int i = 0; i < size; i++){
            System.out.print(visited.peek().x +","+visited.peek().y+" ");
            visited.remove();
       }*/
       visited = getAllFactors(visited, room[visited.peek().x][visited.peek().y]);
       /*for(int i = 0; i < size; i++){
            System.out.print((visited.peek().x+1) +","+(visited.peek().y+1)+" ");
            System.out.print(visited.peek().x +","+visited.peek().y+" ");
            System.out.println();
            visited.remove();
       }*/

       while(visited.size()!= 0){
        if(visited.peek().x == rows-1 && visited.peek().y == cols-1){
            System.out.print("yes");
            isYes = true;
            break;
        }
        if(visited.peek().x < rows && visited.peek().y < cols){
            visited = getAllFactors(visited, room[visited.peek().x][visited.peek().y]);
            visited.remove();
        }else{
            visited.remove();
        }
       }
       if(isYes == false)System.out.print("no");
       /*for(int i = 0 ; i < rows; i++){
        for(int j = 0; j < cols; j++){
            System.out.print(room[i][j]+ " ");
        }
        System.out.println();
       }*/
    }
    public static Queue<Node> getAllFactors(Queue<Node> factors, int num){
        Queue<Node> factor = factors;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                factor.add(new Node(i-1,num/i-1));
            }
        }
        return factor;
    } 
}