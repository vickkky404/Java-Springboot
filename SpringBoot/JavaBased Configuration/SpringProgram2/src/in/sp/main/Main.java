package in.sp.main;

public class Main 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Student std = (Student)context.getBean("stdId1");
		std.displayInfo();
	}

}
