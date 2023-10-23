public class Calculator {
	
	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
		
		//method calling
		calc.Multiply(5, 45);
		
		int sum = calc.Add(60,89);
		System.out.println("Sum of 60 and 89 = "+ sum);
		int sub = calc.Sub(90,50);
		System.out.println("Sub of 90 and 50 = "+ sub);
	}

	//return statment method
	public int Add(int a, int b)
	
	{
		return a+b;
	}
	public int Sub(int a, int b)
	{
		return a-b;
	}
	
	//void method 
	//method definition
	public void Multiply(int a, int b)
	{
		System.out.println("Multiply " +a*b);
	}
}
