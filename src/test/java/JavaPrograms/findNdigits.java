package JavaPrograms;

public class findNdigits {

    public static void main(String[] args)
    {
        int n = 2;			// N-digit
        int sum = 4;		// given sum

        String res = "";
        findNdigitNums(res, n, sum);
    }
        // Function to find all n-digit numbers with sum of digits equal to sum
        // in Bottom-up manner
        public static void findNdigitNums(String res, int n, int sum)
        {
            // if number is less than n-digit and its sum of digits is less than the given sum
            if (n > 0 && sum >= 0)
            {
                char d = '0';
                if (res.equals(""))
                {	// special case - number can't start from 0
                    d = '1';
                }

                // consider every valid digit and put it in the current index and recur for next index
                            while (d <= '9') {
                    findNdigitNums(res + d, n - 1, sum - (d-'0'));
                    d++;
                }
            }

            // if number becomes n-digit and its sum of digits is equal to given sum, print it
            else if (n == 0 && sum == 0) {
                System.out.print(res + " ");
            }
        }


    }


        /*
                First we try to express our problem in a subproblem.
                 If we observe that in a N-digit number if you fix the first digit to be x,
                 then we have to solve for solution of problem where we have (N-1) digits and (SUM - x)
                 to be sum of the rest of the digits. In these way we can express our solution as,
                 SOLUTION(N, SUM) = SUM OF SOLUTION(N-1, SUM - x),
                 for 0 <= x <= N.
                 */