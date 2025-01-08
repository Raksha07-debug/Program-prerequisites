import java.util.*;
class Task5{
public static void main (String args[]){
Scanner sc =new Scanner(System.in);
System.out.print("enter the  value for radius and height");
double radius= sc.nextFloat();
double height=sc.nextFloat();
double volume = Math.PI * Math.pow(radius, 2) * height;
System.out.println("volume of a cylinder"+ volume);

}
}