package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int result = 0;
        int max = Math.max(firstBoarder, secondBoarder);
        int min = Math.min(firstBoarder, secondBoarder);
        if (firstBoarder == secondBoarder) {
            result = firstBoarder;
        } else if (Math.abs(firstBoarder) == Math.abs(secondBoarder)) {
            result = 0;
        } else {
            for (int i = min; i < max; i++) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
