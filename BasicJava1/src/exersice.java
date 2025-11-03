import java.util.Scanner;
import java.util.*;

//very good you are the exellent
// public class exersice {
//     public static void main(String[] args) {
//        Scanner scn= new Scanner(System.in);
//        System.out.println("cout of input number");
//         int n= scn.nextInt();

//        for(int i=1; i<=n;i++){
//          int  n2=scn.nextInt();
       
//          int count =0;
//          int devidBy=0;
//          for( int j=2;j<n2;j++){
//             if(n2%j==0){
//                 count++;
//                 devidBy=j;
//                   break;
//             }
//          }
//           if(count==0){
//             System.out.println("number is prime" );
//         }else{
//               System.out.println("number is not prime becouse it is devided by" + devidBy);

//           }
//        }
       

//     }
// }

//toto take the two as a range check the prime number between them

// public class exersice {
//     public static void main(String[] args) {
//        Scanner scn= new Scanner(System.in);
//        System.out.println("Enter lower number:");
//        int l= scn.nextInt();
//        System.out.println("Enter higher number:");
//        int h=scn.nextInt();

//        for(int i=l;i<h;i++){
//         int count=0;
//         for(int j=2; j<i;j++){
//             if(i%j==0){
//                 count++;
//                 break;
//             }
//         }
//         if(count==0){
//             System.out.println(i+ " is prime number");
//         }
//     }
//        }
//     }

//todo print fibonaci seriece

// public class exersice {
//     //fibonacci series
//     public static void main(String[] args) {
//         Scanner scn=new Scanner(System.in);
//         System.out.println("Eneter a number");
//         int n= scn.nextInt();

//         int a=0;
//         int b=1;
//         int next=0;
//         System.out.println("You fibonacci series is");
//         for(int i=0;i<=n;i++){ 
//             System.out.println(a);
//              next=a+b;
//              a=b;
//              b=next;

//         }


// }}

//todo count digit in a number
//like n=2335467 in is the number digits are 7


// public class exersice {
//     //fibonacci series
//     public static void main(String[] args) {
//         Scanner scn=new Scanner(System.in);
//         System.out.println("Eneter a number");
//         int n= scn.nextInt();

//          int count =0;
//           while(n!=0){
//            n=n/10;
//            count++;
//           }
//           System.out.println(count);


// }}


//todo print the digit of number 

public class exersice {
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Eneter a number");
        int n= scn.nextInt();
            int count=0;
            int temp =n;
             while(temp!=0){
                temp=temp/10;
                count++;
             }
               int div=(int)Math.pow(10, count-1);    
           while( n !=0){
                int q= n/div;
               System.out.println(q);
                 n=n%div;
            div=div/10;
                   
           }
       
   //very good you have solved three problem keep going
}}