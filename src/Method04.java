import java.util.Arrays;
import java.util.Scanner;

public class Method04 {

    public static int[] input() {
        Scanner scanner = new Scanner(System.in);
        int numbers[] = new int[10];

        System.out.print("정수 10개 입력>>");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    public static void output(int numbers[]) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
    }


    public static void main(String[] args) {
//        문제 1) 책 126페이지의 5번 문제를 풀고, 메서드를 사용하는 방식으로 변환하세요
//        Arrays 클래스의 정렬 메서드 sort()를 사용하여 정렬

//        int nums[] = {10, 50, 80, 70, 20};
//        Arrays.sort(nums);

        int numbers[];
        numbers = input();
        output(numbers);
        System.out.println();

        Arrays.sort(numbers);

        output(numbers);

    }
}

//        Scanner scanner = new Scanner(System.in);
//        int[] Num = new int[10];
//        int temp = 0;
//        System.out.print("정수 10개 입력>>");
//        for (int i = 0; i < 10; i++) {
//            Num[i] = scanner.nextInt();
//        }
//        for (int i = 0; 1 < Num.length; i++) {
//            for (int j = 0; 1 < Num.length - i - 1; j++) {
//                if (Num[j] > Num[j + 1]) {
//                    temp = Num[j];
//                    Num[j] = Num[j = 1];
//                    Num[j + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.print(Num[i] + " ");
//        }
//    }
//}



//        for(int i = 0; i < numbers.length; i++) {
//            for(int j = i; j < numbers.length; j++) {
//                if(numbers[i] > numbers[j]) {
//                    int tmp = numbers[i];
//                    numbers[i] = numbers[j];
//                    numbers[j] = tmp;
//                }
//            }
//        }