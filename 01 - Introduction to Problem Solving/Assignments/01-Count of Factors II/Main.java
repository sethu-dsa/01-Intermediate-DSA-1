import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(solve(input));
        scanner.close();
    }

    public static int solve(int n)
    {
        int countOfFactors = 0;
        for (int iterator = 1; (iterator*iterator) < n; iterator++)
        {
            if (n%iterator == 0)
            {
                if (iterator * iterator == n)
                {
                    countOfFactors++;
                }
                else
                {
                    countOfFactors += 2;
                }
            }
        }
        return countOfFactors;
    }
}