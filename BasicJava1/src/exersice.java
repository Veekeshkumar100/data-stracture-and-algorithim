import java.util.*; 
// import java.util.Scanner;

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

// public class exersice {
    
//     public static void main(String[] args) {
//         Scanner scn=new Scanner(System.in);
//         System.out.println("Eneter a number");
//         int n= scn.nextInt();
//             int count=0;
//             int temp =n;
//              while(temp!=0){
//                 temp=temp/10;
//                 count++;
//              }
//                int div=(int)Math.pow(10, count-1);    
//            while( n !=0){
//                 int q= n/div;
//                System.out.println(q);
//                  n=n%div;
//             div=div/10;
                   
//            }
//    //very good you have solved three problem keep going
// }}


// public class exersice {
//     // print revers of numver
//     public static void main(String[] args) {
//         Scanner scn=new Scanner(System.in);
//         System.out.println("Eneter a number");
//         int n= scn.nextInt();
         
         
//            while( n !=0){
//                 int r= n%10;
//                System.out.println(r);
//                  n=n/10;
   
//            }
//    //very good you have solved three problem keep going
// }}

//todo inverse a digit
// public class exersice {
//     //inverse a number 
//     public static void main(String[] args) {
//         Scanner scn=new Scanner(System.in);
//         System.out.println("Eneter a number");
//         int n= scn.nextInt();
             
//          int inv = 0;
//          int count=0;
//          int temp = n;
//          while(temp!=0){
//            temp=temp/10;
//           count++;
//          }
//             int i=1;
//         System.out.println(count);
//            while( i<=count){
//                 int last= n%10;
//                 int y = i*(int)Math.pow(10, last-1);
//                 System.out.println(y);
//                  inv= inv+y;
//                 n=n/10;
//                 i++;
//            }
//                 System.out.println(inv);
//    //very good you have solved three problem keep going
// }}

// public class exersice {
//     //inverse a number 
//     public static void main(String[] args) {
//         Scanner scn=new Scanner(System.in);
//         System.out.println("Eneter a number");
//         int n= scn.nextInt();
             
//          int inv = 0;
        
    
//             int op=0;
//            while(n!=0){
//                 int od= n%10;
//                 int ip=od;
//                int  id=op;
//                 int y = id *(int)Math.pow(10, ip-1); 
//                  inv= inv+y;
//                 n=n/10;
//                 op++;
//               }
//               System.out.println(inv);
//               //very good you have solved three problem keep going
// }}



// public class exersice {
//     //inverse a number 
//     public static void main(String[] args) {
//         Scanner scn=new Scanner(System.in);
//         System.out.println("Eneter a number");
//         int n= scn.nextInt();
//         System.out.println("ROTATE KEY");
//         int y =scn.nextInt();  
        

        
//          int rd=n%(int)Math.pow(10,y);
//          System.out.println(rd);
//          int qd=n/(int)Math.pow(10,y);
//          System.out.println(qd);
//          int rotate= rd+qd;
//          System.out.println(rotate);
//               //very good you have solved three problem keep going
// }}




//  public class exersice {
// //     //inverse a number 
//     public static void main(String[] args) {
//         Scanner scn=new Scanner(System.in);
//         System.out.println("Eneter a number");
//        int n= scn.nextInt();
//        System.out.println("Enter a number how many number you want to rotate:");
//        int rn= scn.nextInt();
//        if(rn>0){
//            int div = (int)Math.pow(10, rn);
//            int r=n%div; 
//            int q=n/div;
//            int temp =q;
//            int count =0;
//            while(temp!=0){
//                count++;
//                temp=temp/10;
//             }
//             int mutipul= r * (int)Math.pow(10, count);
//             int rotateNumber =mutipul +q;
//             System.out.println(rotateNumber); 
//           }
//           if(rn<0){
//            int temp2=n;
//            int count2=0;
//                 while(temp2!=0){
//               count2++;
//               temp2=temp2/10;
//           }
//           int lastDigitcount= count2+rn;
//           if (lastDigitcount <= 0) {
//               System.out.println("Cannot rotate: rotation value too large for the number");
//               return;
//             }
//             int r=n%(int)Math.pow(10, lastDigitcount);
//             System.out.println(r); 
//             int  q=n/ (int)Math.pow(10, lastDigitcount);
//             System.out.println(q); 
//           int  rotateNumber=q+r*(int)Math.pow(10, -rn);
//           System.out.println(rotateNumber); 
          
//           }
    
//               //very good you have solved three problem keep going
// }}


// todo lohesst commen divider (lcm) and greatest common divider 


 public class exersice {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Eneter a two numbers");
       int n1= scn.nextInt();
     
       int n2= scn.nextInt();
          
       while(n1 % n2!=0){
         int rem = n1 % n2;
         n1=n2;
         n2=rem;
       }
    int gcd=  n2;
    int lcm=(n1 *n2)/gcd;

 System.out.println("gcd"+gcd);

 System.out.println("lcm"+lcm);
              //very good you have solved three problem keep going
}}
