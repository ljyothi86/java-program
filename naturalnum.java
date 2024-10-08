/*
class Square
{
public static void main(String args[])
{
int no=25;
System.out.print("The first"+ no + "terms of the Square series are:\n");
for(int i=1;i<=no;i++)
{
int term =(i*i);
System.out.println(term + " ");
}
}
} 

*/

 
class numseries
{
public static void main(String args[])
{
int no=5;
System.out.print("The first"+ no + "terms of the numseries series are:\n");
for(int i=1;i<=no;i++)
{
int term =(i*(i+1)) % 2;
System.out.println(term + " ");
}
}
} 

