import java.util.scanner;
class pattern
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
System.out. println("enter the number of row:");
int rows = Sc.nextInt();
for(int i=0;i<=5-1;i++)
{
for(int j=0;j<=i;j++)
{
System. out .print("*" + " ");
}
System .out.println(" ");
}
for (int i=0;i<=5-1;i++)
{
for(intj=0; j<=i-1;j++)
{
System.out.print("*" + " ");
}
System.out.println("");
}
Sc.close();
}
}
