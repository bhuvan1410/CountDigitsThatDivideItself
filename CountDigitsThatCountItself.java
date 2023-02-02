public class CountDigitsThatCountItself {
    public static int countDigits(int num) {
        int use = num;
        int digits = 0;

        while (use > 0) {
            int mod = use % 10;
            if (mod != 0 && num % mod == 0) {
                digits++;
            }
            use /= 10;
        }

        return digits;

    }

    public static void main(String[] args) {

        int digit1 = 7;
        int digit2 = 121;
        int digit3 = 1248;

        int amount1 = countDigits(digit1);
        int amount2 = countDigits(digit2);
        int amount3 = countDigits(digit3);

        System.out.println("The amount of digits that can be divised by itself in " + digit1 + " is " + amount1);
        System.out.println("The amount of digits that can be divised by itself in " + digit2 + " is " + amount2);
        System.out.println("The amount of digits that can be divised by itself in " + digit3 + " is " + amount3);

    }
}
