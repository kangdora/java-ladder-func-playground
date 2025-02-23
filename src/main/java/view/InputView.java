package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getHeight() {
        System.out.print("사다리의 높이는 몇 개인가요?\n");
        return scanner.nextInt();
    }

    public static int getWidth() {
        System.out.print("사다리의 넓이는 몇 개인가요?\n");
        return scanner.nextInt();
    }
}