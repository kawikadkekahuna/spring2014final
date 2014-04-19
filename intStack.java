import java.util.Scanner;

public class intStack {

	public intStack() {
		stackArray = new double[30];

	}

	public static void push() {
		if (isFull() == true) {
			fullError();
		}
		if (isFull() == false) {
			stackArray[order] = Math.random();
			temp = stackArray[order];
			order++;
			top++;
			System.out.println("Entry received. What would you like to do next");
		}

	}

	public static void pop() {

		if (isEmpty() == false && isFull() == false) {
			stackArray[order] = 0;
			order--;
			top--;
			System.out.println("You popped position " + order
					+ " containing the number " + stackArray[order]);
	
				
			}
		if(isFull() == true){
			order--;
			top--;
			System.out.println("You popped position " + order
					+ " containing the number " + stackArray[order]);
		}

		else
			emptyError();

	}

	public static boolean isFull() {
		if (top == 29) {
			return true;
		}
		return false;
	}

	public static boolean isEmpty() {
		while (top == -1) {
			return true;
		}
		return false;
	}

	public static void emptyError() {

		if (isEmpty() == true) {
			System.out
					.println("The stack is currently empty.  Please push numbers");
		}

	}

	public static void fullError() {

		if (isFull() == true) {
			System.out
					.println("The stack is currently full.  Please pop numbers off before pushing.");
		}
	}

	public static void displayOrder() {
		if (isEmpty() == true) {
			stackArray[0] = 0;
			System.out.println("The list is empty");
		}
		for (int y = 0; y <= order - 1; y++) {
			System.out.printf("%1s  %-7s    %-6s%n", "Order", "", "Push");
			System.out.printf("%1s  %-7s    %n",+y,+ stackArray[y]);

		}
		System.out.println("What would you like to do next?");

	}

	public static double getTop() {
		return top;
	}

	public String toString() {

		return "info here.";

	}

	public static void setRepeat(boolean repeat) {
		intStack.repeat = repeat;
	}

	public void prompt() {
		setRepeat(true);
		System.out.println("Would you like to do?  For options type /cmd");
		while (repeat == true) {

			switch (sc.nextLine()) {

			case "/cmd":
				System.out.println(op);
				break;
			case "Quit":
				setRepeat(false);
				System.exit(1);
				break;
			case "Display":
				displayOrder();
				break;
			case "Push":
				push();
				break;
			case "Push30":
				for (int i = 0; i <= 29; i++){push();}
				break;
				
			case "Pop":
				pop();
				break;

			}
		}
	}

	private static Scanner sca = new Scanner(System.in);
	private static Scanner sc = new Scanner(System.in);
	private static double[] stackArray = new double[30];
	private static int order = 0; // order of the array
	private static double top = order - 1;
	private static double temp = 0; // placeholder for each push method
	private static options op = new options();
	private static boolean repeat = true;
	private static String Case = "Case";
}
