/*
//To perform arithmetic operations 
import java.util.Scanner;
public class operator
{
public static void main(String[] args )
{
System.out.print("Enter two numbers: \n");
Scanner obj= new Scanner(System.in);
double first = obj.nextDouble();
double second = obj.nextDouble();
System.out.print("Enter an operator (+, -, *, /): \n");
char operator = obj.next().charAt(0);
double result;
switch(operator)
{
case '+':
result = first + second;
break;
case '-':
result = first - second;
break;
case '*':
result = first * second;
break;
case '/':
result = first / second;
break;
// operator doesn't match any case constant (+, -, *, /)
default:
System.out.printf("Error!operator is not correct");
return;
}
System.out.printf("%.1f %c %.1f =%.1f", first, operator, second, result);
}
}


*/
import java.util.Scanner;
public class seasons
{
public static void main(String args[] )
{
String season;
System.out.println("Enter any month(20to30)");
Scanner obj = new Scanner(System.in);
int entry = obj.nextInt();
switch (entry)
{
case 20:
case 30:
season = "+";
break;
case 20:
case 30:
season = "--";
break;
case 20:
case 30:
case 6:
season = "*";
break;
case 7:
case 8:
season = "/";
break;
default:
season = "Autumn";
}
System.out.println("The Entered month is in the " + season + ".");
}
}

