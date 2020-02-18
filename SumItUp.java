public class SumItUp{
    
    public static int sum(int x, int y) {
        int sum = 0;
        if (x != y) {
            sum = x + y;
        } else {
            sum = (x + y) * 2;
        }

        return sum;
    }
}