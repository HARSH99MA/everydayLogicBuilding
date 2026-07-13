class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        int number = 0;
        while (n > 0) {
            number = n % 10;
            sum += number;
            product = product * number;
            n /= 10;
        }
        int result = product - sum;
        return result;
    }
}