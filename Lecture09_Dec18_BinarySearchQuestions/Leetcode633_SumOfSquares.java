package Lecture09_Dec18_BinarySearchQuestions;

public class Leetcode633_SumOfSquares {
    public boolean judgeSquareSum(int c) {
        int low = 0, high = (int) Math.sqrt(c);

        while (low <= high) {
            long sum = (long) low * low + (long) high * high; // handling overflow
            if (sum == c)
                return true;
            else if (sum < c)
                low++;
            else
                high--;
        }

        return false;
    }

}
