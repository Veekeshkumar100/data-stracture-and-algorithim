

// public class pattern {
//     // *
//     // **
//     // ***
//     // ****
//     // *****
//       public static void main(String[] args) {
       
//         for(int i=1 ; i<=5; i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }

//       }  


// }




// public class pattern {
//     // *****
//     // ****
//     // ***
//     // **
//     // *
//       public static void main(String[] args) {
//         for(int i=5 ; i>=0; i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }

//       }  


// }

import java.util.Scanner;

// public class pattern {
//       public static void main(String[] args) {
//          Scanner num=ew  Scanner(System.in);
//          System.out.println("Enter a number");
//           int num = n.nextInt();

//          int sp=num-1
//          int st=1;

//         for(int i=1 ; i<=n; i++){
//          for(int j=1; j<=sp;j++){
//             System.out.println("");
//          }    
//          for(int r=1;r<=st;r++){
//             System.out.println("*");
//          }
//         }
// sp--;
// st++;
// System.out.println();
// //       }  


// }
// public class pattern {
//       public static void main(String[] args) {
//          Scanner n=new  Scanner(System.in);
//          System.out.println("Enter a number");
//           int num = n.nextInt();
//        int  st=num;
//        int sp=0;
//      for(int i=1; i<=num; i++){
//        for(int r=1;r<=sp;r++){
//             System.out.print(" ");
//          }
//          for(int j=1;j<=st;j++){
//             System.out.print("*");
//          }
//          sp++;
//          st--;
//          System.out.println();
//       }

//       }  


// }
// public class pattern {

//       public static void main(String[] args) {
//          Scanner n=new  Scanner(System.in);
//          System.out.println("Enter a number");
//           int num = n.nextInt();
//        int  st=1;
//        int sp=num/2;
//      for(int i=1; i<=num; i++){
//        for(int r=1;r<=sp;r++){
//             System.out.print(" ");
//          }
//          for(int j=1;j<=st;j++){
//             System.out.print("*");
//          }
//          if(i<=num/2){
      
          
//             st+=2;
//             sp--;
//          }else{
//             st-=2;
//             sp++;
//          }
         
   
//          System.out.println();
//       }

//       }  


// }
// public class pattern {

//       public static void main(String[] args) {
//          Scanner n=new  Scanner(System.in);
//          System.out.println("Enter a number");
//           int num = n.nextInt();
//           int st=num/2;
//          int sp=1;

//      for(int i=1; i<num; i++){
//         for(int j=1; j<=st;j++){
//          System.out.print("*");
//         } 
//         for(int r=1;r<=sp;r++){
//          System.out.print(" ");
//         }
//          for(int j=1;j<=st;j++){
//           System.out.print("*");
//          }
//         if(i<=st){
//          sp=sp+2;
//          st--;
//         }
//         else{
//          sp=sp-2;
//          st++;
//         }
//          System.out.println();
//       }

//       }
//    }




// public class pattern {
//   //diagonol
//       public static void main(String[] args) {
//          Scanner n=new  Scanner(System.in);
//          System.out.println("Enter a number");
//           int num = n.nextInt();
//      for(int i=0; i<=num; i++){
//         for(int j=0;j<=num;j++){
//          if(i+j==num+1){
//             System.out.print("*");
//          }else{
//             System.out.print(" ");
//          }
//          }
//          System.out.println(" ");
//       }
//       }
//    }


// public class pattern {
//   //diagonol
//       public static void main(String[] args) {
//          Scanner n=new  Scanner(System.in);
//          System.out.println("Enter a number");
//           int num = n.nextInt();

//           //type 1
//    //   for(int i=1; i<num; i++){
      
//    //      for(int j=1;j<=sp;j++){
//    //         System.out.print(" ");
//    //       }
//    //       System.out.println("*");
//    //       sp--;
//    //    }

//    // type 2
//    for(int i=1; i<=num; i++){
      
//       for(int j=1;j<=num;j++){
//          if(i==j){
//             System.out.print("*");
//          }else{
//             System.out.print(" ");
//          }
//       }
//       System.out.println();
//    }

//       }
//    }



   // print 
   //     *        *
   //       *    *
   //          *
   //       *    *
   //   *           *

//  public class pattern {
//       public static void main(String[] args) {
//          Scanner n=new  Scanner(System.in);
//          System.out.println("Enter a number");
//           int num = n.nextInt();
   
          
      
//      for(int i=1; i<=num; i++){
//          for(int j=1;j<=num;j++){
//             if(i==j || i+j==num+1){
//                System.out.print("*");
//             }
//              System.out.print(" ");
//           }
//            System.out.println();

//       }
//       }
//    }




// public class pattern {
   
//          public static void main(String[] args) {
//             Scanner n=new  Scanner(System.in);
//             System.out.println("Enter a number");
//             int num = n.nextInt();
      
//             int outerSpac=num/2;
//             System.out.println(outerSpac);
//             int innnerSpace=-1;
         
//          for(int i=1; i<=num; i++){
//             for(int j=1;j<=outerSpac;j++){
//                System.out.print(" ");
//             }
//             System.out.print("*");
//             for(int r=1;r<=innnerSpace;r++){
//                System.out.print(" " );
//             }
//             if(i!=1 && i!=num){
//                System.out.print("*");
//             }
         
//             if(i<=num/2){
//                outerSpac--;
//                innnerSpace+=2;
//             }else{
//                outerSpac++;
//                innnerSpace-=2;
//             }
//                System.out.println();
//          }
      
      
//       }}





// public class pattern {
   
      //  
      

// public class pattern {

//          public static void main(String[] args) {
//             Scanner n=new  Scanner(System.in);
//             System.out.println("Enter a number");
//             int num = n.nextInt();
//                int a=0;
//                int b=1;
//             for(int i=0;i<=num;i++){
//                for(int j=1;j<=i;j++){
//                   System.out.print(a+" ");
//                   int c=a+b;
//                   a=b;
//                   b=c;
             
//                }
//                System.out.println();
//             }
            
//          }
// }



// public class pattern {

//           public static void main(String[] args) {
//              Scanner n=new  Scanner(System.in);
//              System.out.println("Enter a number");
//              int num = n.nextInt();
                
//              for(int i=1;i<=10;i++){
//                System.out.println(num+ "*" +i + "=" +(num*i));
//              }



//                }

          
//          }



public class pattern {

          public static void main(String[] args) {
             Scanner n=new  Scanner(System.in);
             System.out.println("Enter a number");
             int num = n.nextInt();
                   
          }}