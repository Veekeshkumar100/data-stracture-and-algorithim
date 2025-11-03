public class App {
    public static void main(String[] args) throws Exception {
         int x=15;
         int y=20;
        int sum = x+y;
        System.out.println("Sum of "+ x + " and " +y+ "is:"+  sum);   

        int prd=x*y;
        System.out.println("product of "+ x + " and " +y+ "is:"+  prd);
        System.out.println("devid" + x/y+ "modulo" + x%y + "rever devid" + y/x);

        //int exp = x*y/x+y ; //300/35=8 but the awsser is 40
        int exp = (x*y)/(x+y) ; 
        System.out.println(exp);
    }
}
