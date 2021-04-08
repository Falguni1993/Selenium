
public class CompileTimeException {

	public static void main(String[] args) {
		System.out.println("my program starts");
		System.out.println("some more line of code");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
System.out.println("program execution");
	}

}
