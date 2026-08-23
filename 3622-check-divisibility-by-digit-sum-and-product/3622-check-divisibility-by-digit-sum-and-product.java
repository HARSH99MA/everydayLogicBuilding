class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int number = n;
        while(n > 0){
            int digit =n  % 10;
            sum = sum + digit;
            product *= digit;
            n = n/10;
        }
        int num = sum + product;
       return number % num == 0;
    }
}