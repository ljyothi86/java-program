class trianglestar
{
int i,j,row= 4;
public static void main(String args[])
{
for(int i=0;i<=row;i++)
{
for(int j=row-i; j>1;j--)
{
System.out.print(" ");
}
for(int j=0; j<=i;j++)
{
System.out.print(" * ");
}
System.out.println();
}
}
}