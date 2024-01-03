import java.util.Scanner;
public class Q10 {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 2 no.");
     Integer i1=sc.nextInt();
     Integer i2=sc.nextInt();
     System.out.println("Enter the operations as +:1 -:2 *:3 /:4");
     int a=sc.nextInt();
if(a==1){
    Integer b=i1+i2;
    System.out.println(b);
}
if(a==2){
    Integer b=i1-i2;
    System.out.println(b);
    }
    if(a==3){
    Integer b=i1*i2;
    System.out.println(b);
    }
    if(a==4){
    Integer b=i1/i2;
    System.out.println(b);
    }
}
}
