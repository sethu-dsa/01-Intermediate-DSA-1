import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(solve(input));
        scanner.close();
    }

    public static int solve(int n)
    {
        double squareRoot = Math.pow(n, 0.5);

        if (squareRoot % 1 == 0)
        {
            return (int)squareRoot;
        }
        
        return -1;
    }
}