package Day3;

public class Conditionalclass {
	public static void main(String[] args)
	{
	int a = 30;
	int b = 20;
	int c = 50;
	if (a < b) {
		
		System.out.println("a is a grater than b " + a);
		
	}
	else if (a < c) {
		
		System.out.println("c is a grater than a " + c);
		
		}
	else {
		System.out.println("a is a non grater than b " + b);
		
	}
	String switch_case = "mobile";
	switch (switch_case) {
	case "mobileon":
		System.out.println("mobileon"); 
		break;
	case "patterlock":
		System.out.println("patterlock"); 
		break;
	case "dataon":
		System.out.println("dataon"); 
		break;
	default: 
		System.out.println("You have selected nothing from the case"); 
	break;
	
	}
	}
}
