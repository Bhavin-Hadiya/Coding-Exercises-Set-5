import java.util.*;

interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double avg);
}

class Result implements Exam, Classify {
    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    public String getDivision(double avg) {
        if (avg >= 60)
            return "First Division";
        else
            return "No Division";
    }
}

public class Exam() {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mark = sc.nextInt();
        double avg = sc.nextDouble();

        Result r = new Result();

        System.out.println(r.isPassed(mark));
        System.out.println(r.getDivision(avg));
    }
}