import java.util.Scanner;
class Tenis
{
Scanner sc=new Scanner(System.in);
String name;
int rank;
public void init()
{
System.out.println("enter name:");
name=sc.nextLine();
System.out.println("enter rank:");
rank=sc.nextInt();
System.out.println("the name is:"+name);
System.out.println("the rank is:"+rank);
}
}
class Ex1
{
public static void main(String[] args)
{
Tenis ob=new Tenis();
ob.init();
}
} 