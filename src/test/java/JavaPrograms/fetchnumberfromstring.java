package JavaPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fetchnumberfromstring {

         public static void main(String[] args) {
            String input = "Hi 57 how are you 300";
            System.out.println(process(input));
             System.out.println(isValid(input));
        }

        private static boolean process(String input) {
            Pattern pattern = Pattern.compile(".*?(\\d+).*?(\\d+)");
            Matcher matcher = pattern.matcher(input);

            if (matcher.matches()) {
                int one = Integer.parseInt(matcher.group(1));
                int other = Integer.parseInt(matcher.group(2));

                System.out.println(one);
                System.out.println(other);


                int total = one + other;
                return total >= 80 && total <= 95;
            }

            return false;
        }

    public static boolean isValid(String str) {
        // regular expression matches 1 or 2 digit number
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{1,2}(?!\\d)").matcher(str);
        int sum = 0;

        // iterate over all found digits and sum it
        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
            System.out.println(sum);
        }

        return sum >= 80 && sum <= 95;
    }
    }

