package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int result = 0;
        int tmp = 9;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            tmp = tmp * 10 + 9;
            result += tmp;
        }
        if (lengthOfLastNumber > 0 ) result += 9;
        System.out.println(result);
    }
}
