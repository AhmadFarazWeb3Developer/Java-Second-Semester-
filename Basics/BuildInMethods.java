
public class BuildInMethods {

	
	public static void main(String[] args)
	{
				
		int y=1;
		int i=2;
		int j=3;
		System.out.println("Absolute of j is " + Math.abs(-9));
		System.out.println(y + " is approximately " + Math.round(1.35));
		System.out.println("The ceiling of " + y + " is " + Math.ceil(1.35));
		System.out.println("The floor of " + y + " is " + Math.floor(1.35));
		System.out.println("max(" + i + "," + j + ") is " + Math.max(5,9));
		System.out.println("min(" + i + "," + j + ") is " + Math.min(5,9));
		System.out.println("pow(2, 2) is "  + Math.pow(2,2));
		System.out.println( "The square root of " + i + " is " + Math.sqrt(i));
		System.out.println(Character.isDigit('6'));
		System.out.println(Character.isLetter('6'));//false
		System.out.println(Character.isLetterOrDigit('6'));//true
		System.out.println(Character.toLowerCase('A'));//a
		System.out.println(Character.toUpperCase('b'));//B
	}
	
	
}
