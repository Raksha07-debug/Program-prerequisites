import java.util.Scanner;
class Task9{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter the kilometer  value you want to convert in miles");
double km=sc.nextFloat();
double miles=km*0.621371; 
System.out.println("miles: "+miles);

}
}