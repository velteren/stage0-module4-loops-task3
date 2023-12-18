package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int result = 0;
        int sum = 0;
        t = Math.abs(t);
        for (int i = t; i >= 0; i /= 10) {
            result = i % 10;
            sum += result;
        }
        System.out.println(result);
    }
}
