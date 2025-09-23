package in.sp.resources;

import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringConfig 
{
//	this is java based configuration class
	@Bean 
	public Student stdId1() {
		Student std = new Student();
		
		std.setName("Nalinikant");
		std.setRollno(001);
		std.setEmail("nalinikant@gmail.com");
//		bean object will be created named stdId1
		
		return std;
		
	}
}
