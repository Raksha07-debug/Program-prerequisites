import java.util.Scanner;
class Task9{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the value for first number");
int a=sc.nextInt();
System.out.println("enter the value for second number");
int b=sc.nextInt();
System.out.println("enter the value for third number");
int c=sc.nextInt();

int avg= (a+b+c)/3;

System.out.println("average of three number is " +avg);

}
}