public class Options {
	
	public Options() {
		
		//System.out.println("push(x) to push a number\npop(x) to remove the number from the stack\ndisplay to display the stack\nquit to quit");
	}
	
	public String toString(){
		return "\"Push\" to push the next number.\n\"Push30\" to automatically push 30 numbers at once.\n\"Pop\" to remove the previous number.\n\"Display\" to display the stack or queue and it's position \n\"Quit\" to quit the program.";
	}
}
