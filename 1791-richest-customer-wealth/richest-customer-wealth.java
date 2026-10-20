import java.util.Arrays;

class Solution {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
                     .mapToInt(customer -> Arrays.stream(customer).sum())
                     .max()
                     .orElse(0);
    }
}