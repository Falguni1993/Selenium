
public class RunTimeException {

	public static void main(String[] args) {
	
		int arr[]=new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		System.out.println("continue program execution");
		try
		{
		System.out.println(arr[3]/0);	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
		e.printStackTrace();
	}
		

		
		
		{

	}

}
