package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int max = Math.max(first, second);
        int result = 0;
        for (int i = max; i > 0; i--){
            if (first % i == 0 && second % i == 0){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
