import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(scan.nextInt());
		System.out.println(scan.nextInt());
		System.out.println("Addition:"+(Integer.parseInt(args[0])+Integer.parseInt(args[1])));
		System.out.println("Subtraction:"+(Integer.parseInt(args[0])-Integer.parseInt(args[1])));
		System.out.println("Multiplication:"+(Integer.parseInt(args[0])*Integer.parseInt(args[1])));
		System.out.println("Division:"+(Integer.parseInt(args[0])/Integer.parseInt(args[1])));
	}

}