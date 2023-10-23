package School.Teacher;

public class Teacher {
	
		public static void main (String Args[])
		{
		 School sch = new School();
		 System.out.println("Welcome to the school: " +sch.schoolname);
		 
		 //System.out.println("Principal name: " +sch.principal);
		 
		 sch.Conduct_Exam();
		 
		 sch.Publish_Result("Kumar",80);
		 
		 sch.Publish_Result("Geetha",65);
		 
		 sch.Publish_Result("Rani",50);
		 
		 
		}
		
}
