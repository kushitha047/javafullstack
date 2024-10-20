***
print FIZZ & BUZZ numbers in 100 numbers
***
class div
{
public static void main(String args[])
{
int i=1;
for(i=1;i<=100;i++)
{
if(i%3==0 && i%5==0)
{
System.out.print("FIZZ BUZZ,");
}
else if(i%3==0)
{
System.out.print("FIZZ,");
}
else if(i%5==0)
{
System.out.print("BUZZ,");
}
else
{
System.out.print(i+",");
}
}
}
}
