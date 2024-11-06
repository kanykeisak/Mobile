import java.util.Scanner;

public class Lesson2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = sc.nextInt(); // Введется с терминала число
        switch (number) {  // переключатель
            case 1:
                System.out.println("Число равно 1");
                break; // прерывает switch
            case 2:
                System.out.println("Число равно 2");
                break;
            case 3:
                System.out.println("Число равно 3");
                break;
            default:
                System.out.println("Число неизвестно");
                break;
        }
    }
}
