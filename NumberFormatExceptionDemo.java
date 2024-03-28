
public class NumberFormatExceptionDemo {
public static void main(String args[])
{
	try{
		String str="abc";
		int num=Integer.parseInt(str);
		System.out.println(num);
	}
	catch(NumberFormatException e){
		System.out.println("Error "+e.getMessage());
	}
	finally
	{
		System.out.println("Program is Normally executed");
	}
}
}
