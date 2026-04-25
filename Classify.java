import java.util.*;

interface Classify {
    String getDivision(double avg);
}

class Result implements Classify {
    public String getDivision(double avg) {
        if (avg >= 60)
            return "First Division";
        else
            return "No Division";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double avg = sc.nextDouble();

        Result r = new Result();
        System.out.println(r.getDivision(avg));
    }
}