package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int result = 0;
        for (int i = 0; i < (t+"").length(); i++) {
            result += (int) ((t+"").charAt(i));
        }
        System.out.println(result);
    }
}
