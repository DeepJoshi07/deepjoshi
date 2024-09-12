package recursion;

public class SumofDigit {
    public static void sumofdigit(int number, int sum) {
        if (number == 0) {
            System.out.println(sum);
            return;
        }
        int remender = number % 10;
        sum += remender;
        sumofdigit(number / 10, sum);

    }

    public static void main(String[] args) {
        int number = 555555;
        int sum = 0;
        sumofdigit(number, sum);
    }

}
