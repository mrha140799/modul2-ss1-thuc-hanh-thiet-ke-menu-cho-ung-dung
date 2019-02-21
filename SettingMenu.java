package SS1TH8;

import java.util.Scanner;

public class SettingMenu {
    public static void main(String[] args) {
        int choise ;
        Scanner scn = new Scanner(System.in);
        System.out.println("1. Ăn Cơm");
        System.out.println("2. Đi ngủ");
        System.out.println("3. Đi học");
        System.out.println("4. Về nhà");
        System.out.println("0. Không chọn!");
        System.out.print("Enter your choise : ");
        choise = scn.nextInt();
        switch (choise) {
            case 0 :
                System.out.println("Oke bye bye");
                break;
            case 1:
                System.out.println("Let go!");
                break;
            case 2:
                System.out.println("Let go!");
                break;
            case 3:
                System.out.println("Let go!");
                break;
            case 4:
                System.out.println("Let go!");
                break;
        }

    }
}
