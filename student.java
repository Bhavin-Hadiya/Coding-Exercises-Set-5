package student;

public class Student {
    int rollNo;
    String name;

    public Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    public void displayStudent() {
        System.out.println(rollNo);
        System.out.println(name);
    }
}

package exam;

import student.Student;

public class Result extends Student {
    int m1;
    int m2;
    int m3;

    public Result(int r, String n, int a, int b, int c) {
        super(r, n);
        m1 = a;
        m2 = b;
        m3 = c;
    }

    public void displayResult() {
        displayStudent();
        int total = m1 + m2 + m3;
        double avg = total / 3.0;
        System.out.println(total);
        System.out.println(avg);
    }
}

package exam;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        String n = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Result obj = new Result(r, n, a, b, c);
        obj.displayResult();
    }
}