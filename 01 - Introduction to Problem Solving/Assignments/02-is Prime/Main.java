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
        if (n == 1)
        {
            return 0;
        }

        for (int iterator = 2; iterator*iterator <= n; iterator++)
        {
            if (n%iterator == 0)
            {
                return 0;
            }
        }
        return 1;
    }
}
