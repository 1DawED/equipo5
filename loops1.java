import java.util.Scanner;

public class loops1 {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < 11; i++) {
			System.out.println(n + "x" + i + " = " + n*i);
		}
    }
}

