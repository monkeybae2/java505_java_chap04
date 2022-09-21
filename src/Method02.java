import java.util.Scanner;

public class Method02 {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

//         문제 1) 사칙연산을 하기 위한 메서드를 메서드의 4가지 형태로 각각 생성하여 실행하는 프로그램을 작성하세요
//        1. 더하기, 빼기, 곱하기, 나누기 를 각각 4가지 형태로 생성
//        2. 1번타입의 함수 이름 : sum1, sub1, multi1, div1
//           2번 타입의 함수 이름 : sum2, sub2, multi2, div2
//           3번 타입의 함수 이름 : sum3, sub3, multi3, div3
//           4번 타입의 함수 이름 : sum4, sub4, multi4, div4
//        3. 각각의 함수를 모두 실행하여 결과를 확인
        System.out.print("\n----- 문제 1 -----\n");

        sum1();
        sub1();
        multi1(10, 20);
        div1(20, 10);

        System.out.println();

        sum2();
        sub2();
        multi2(30, 40);
        div2(60, 30);

        System.out.println();

        sum3();
        sub3();
        multi3(40, 20);
        div3(50, 25);

        System.out.println();

        sum4();
        sub4();
        multi4(10, 27);
        div4(48, 24);

//        문제 2) 사용자 입력을 통해서 숫자를 입력받아 해당하는 단수의 구구단을 출력하는 프로그램을 작성하세요
//        1. 구구단을 출력하는 부분을 함수로 구현 (함수명 : gugudan)
//        2. 사용자 입력 부분은 함수로 구현해도 되고 안해도 됨
        System.out.println("\n----- 문제 2 -----\n");
        System.out.print("숫자를 입력하세요>>");
        int num = 0;
        num = scanner.nextInt();
        gugudan(num);


//        문제 3) 사용자 입력을 통해서 국어, 영어, 수학의 점수 3개를 입력받고, 총점과 평균, 등급을 출력하는 프로그램을 작성하세요
//        1. 등급 계산 부분을 함수로 구현 (함수명 : scores)
//        2. 총점과 평균 계산 부분을 함수로 구현 (함수명 : average)
//        3. 등급은 90이상 A, 80이상 B, 70이상 C, 60이상 D, 60미만 F
//        4. 등급은 평균점수를 기반으로 함
//        5. 출력형태는 총점, 평균, 등급을 모두 출력
        System.out.print("\n----- 문제 3 -----\n");
        int kor = 0;
        int eng = 0;
        int math = 0;
        int total = 0;
        double avg = 0;
        String level = "F";

        System.out.println("국어 점수를 입력해주세요 : ");
        kor = scanner.nextInt();
        System.out.println("영어 점수를 입력해주세요 : ");
        eng = scanner.nextInt();
        System.out.println("수학 점수를 입력해주세요 : ");
        math = scanner.nextInt();

        total = kor + eng + math;
        avg = average(total);
        level = scores((int) avg);

        System.out.println("총점은 " + total + "이고," + "평균은 " + avg + "이고," + "등급은 " + level + "입니다.");

    }

    public static void sum1() {
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("sum1의 덧셈은 : " + result);
    }

    public static void sub1() {
        int a = 10;
        int b = 20;
        System.out.println("sub1의 뺄셈은 : " + (a - b));
    }

    public static void multi1(int a, int b) {
        int result = a * b;
        System.out.println("multi1의 곱셈은 : " + result);
    }

    public static void div1(double a, double b) {
        int result = (int) (a / b);
        System.out.println("div1의 나눗셈은 : " + result);
    }

    public static void sum2() {
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("sum2의 덧셈은 : " + result);
    }

    public static void sub2() {
        int a = 10;
        int b = 20;
        System.out.println("sub2의 뺄셈은 : " + (a - b));
    }

    public static void multi2(int a, int b) {
        int result = a * b;
        System.out.println("multi2의 곱셈은 : " + result);
    }

    public static void div2(double a, double b) {
        int result = (int) (a / b);
        System.out.println("div2의 나눗셈은 : " + result);
    }

    public static void sum3() {
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("sum3의 덧셈은 : " + result);
    }

    public static void sub3() {
        int a = 10;
        int b = 20;
        System.out.println("sub3의 뺄셈은 : " + (a - b));
    }

    public static void multi3(int a, int b) {
        int result = a * b;
        System.out.println("multi3의 곱셈은 : " + result);
    }

    public static void div3(double a, double b) {
        int result = (int) (a / b);
        System.out.println("div3의 나눗셈은 : " + result);
    }

    public static void sum4() {
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("sum4의 덧셈은 : " + result);
    }

    public static void sub4() {
        int a = 10;
        int b = 20;
        System.out.println("sub4의 뺄셈은 : " + (a - b));
    }

    public static void multi4(int a, int b) {
        int result = a * b;
        System.out.println("multi4의 곱셈은 : " + result);
    }

    public static void div4(double a, double b) {
        int result = (int) (a / b);
        System.out.println("div4의 나눗셈은 : " + result);
    }


    public static void gugudan(int num) {
        System.out.println(num + "단");
        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }

    public static String scores(int avg) {
        String level = "F";

        if (avg >= 90) {
            level = "A";
        } else if (avg >= 70) {
            level = "B";
        } else if (avg >= 60) {
            level = "C";
        }
        if (avg < 60) {
            level = "F";
        }
        return level;
    }

    public static double average(int total) {
        return (double) total / 3;
    }

}
