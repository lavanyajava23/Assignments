package School.Teacher;

public class School {
	
   static String schoolname = "Middle School";
   
   private String principal = "Mike Hall";
	
	void Conduct_Exam()
	{
		System.out.println("We are conducting the board exam!!");
		System.out.println("Principal name inside School::::" +principal);
	}
	
	void Publish_Result(String name,int mark)
	{
		System.out.println("Student: "+name);
		if(mark >=75)
			System.out.println("You passed with distinction! "+mark);
		else if (mark>=60 && mark <75)
			System.out.println("You passed with first class! "+mark);
		else
			System.out.println("Sorry! Better luck next time!!! "+mark);
	}

}



