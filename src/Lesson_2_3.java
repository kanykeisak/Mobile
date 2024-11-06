import java.util.Scanner;

public class Lesson_2_3 {
    public static void main(String[] args) { // DRY
        // можно создавать метод
        System.out.println("ЗАВТРАК");
        makeTee();

        System.out.println("ОБЕД");
        makeTee();

        System.out.println("УЖИН");
        makeTee();
                   // (аргументы)
//        addition(2, 3, "Сумма чисел:");
//        addition(10, 65, "Результат сложения -");
        calculatePerimeter(5.6f, 5.0f, "Аудитория 1");
        calculatePerimeter(3.5f, 2.0f, "Кухня");
        calculatePerimeter(7, 10, "Холл");
        int areaOfAuditory1 = (int) calculateArea(5.6f, 5.0f);
        System.out.println("Площадь Аудитория 1: " + areaOfAuditory1);
        int areaOfKitchen = (int) calculateArea(3.5f, 2.0f);
        System.out.println("Площадь Кухни: " + areaOfKitchen);
        int areaOfHall = (int) calculateArea(7, 10);
        System.out.println("Площадь Кухни: " + areaOfHall);
        System.out.println("Общая площадь: " + (areaOfAuditory1 + areaOfKitchen + areaOfHall));
        System.out.println("Приятно познакомиться, " + nameInput());
    }

    public static String nameInput(){
        // возвращаемый метод без параметров
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свое имя: ");
        return scanner.nextLine();
    }

    public static int calculateArea(float length, float width){
        // возвращаемый метод с 2-мя параметрами
        int area = Math.round(length * width);
        return area;
    }
    // method signature          // parameters
//    public static void addition(int num1, int num2, String phrase){
//        // невозвращаемый метод с 3-мя параметрами
//        System.out.println(phrase + " " + (num1 + num2));
//    }
    public static void calculatePerimeter(float length, float width, String roomName){
        // невозвращаемый метод с 3-мя параметрами
        float perimeter = (length + width) * 2;
        System.out.println("Периметр комнаты " + roomName + ": " + perimeter);
    }

    public static void makeTee(){
        // невозвращаемый метод без параметров
        // нельзя создавать метод внутри метода
        System.out.println("Вскипятить воду");
        System.out.println("Насыпать заварку");
        System.out.println("Залить кипятком");
        System.out.println("Дать настояться");
        System.out.println("Добавить молоко или сахар по-вкусу");
        duration();
    }
    public static void duration(){
        // невозвращаемый метод без параметров
        System.out.println("Займет 10 мин");
    }
}
