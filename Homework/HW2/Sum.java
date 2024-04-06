public class Sum{
	public static void main(String[] args) {
		System.out.print("Please enter the first number:");
		int number1=IO.readInt();
		System.out.print("Please enter the second number:");
		int number2=IO.readInt();
		System.out.print("The sum of the two number is ");
		IO.outputIntAnswer(number1+number2);
	}
}