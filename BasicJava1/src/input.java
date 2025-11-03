import java.util.*;
public class input {
public static void main(String[] args) {
       Scanner scn= new Scanner(System.in);
       System.out.println("provide a number for countng");
       int n= Integer.parseInt(scn.nextLine());
         String name= scn.nextLine();
          System.out.println("your name is " +name+ " counting is");
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
       

    }
}
