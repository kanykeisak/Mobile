import java.util.Random;

public class Homework_2 {
    public static void main(String[] args) {
//        System.out.println("Человек с возростом 22 и температура на улице 2 -- " + permission(22, 2));
//        System.out.println("Человек с возростом 10 и температура на улице -25 -- " + permission(10, -25));
//        System.out.println("Человек с возростом 37 и температура на улице -5 -- " + permission(37, -5));
//        System.out.println("Человек с возростом 60 и температура на улице -10 -- " + permission(60, -10));
//        System.out.println("Человек с возростом 5 и температура на улице 30 -- " + permission(5, 30));
//
        System.out.println("Человек c возростом " + generateRandomAge() + " и температура на улице 2 -- " + permission(generateRandomAge(), 2));
        System.out.println("Человек с возростом " + generateRandomAge() + " и температура на улице -25 -- " + permission(generateRandomAge(), -25));
        System.out.println("Человек с возростом " + generateRandomAge() + " и температура на улице -5 -- " + permission(generateRandomAge(), -5));
        System.out.println("Человек с возростом " + generateRandomAge() + " и температура на улице -10 -- " + permission(generateRandomAge(), -10));
        System.out.println("Человек с возростом " + generateRandomAge() + " и температура на улице 30 -- " + permission(generateRandomAge(), 30));

    }
    public static String permission(int agePerson, float temperature){
        if (agePerson > 20 && agePerson < 45 && temperature > - 20 && temperature < 30 ){
            return "Можно идти гулять";
        } else if (agePerson < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (agePerson > 45 && temperature > - 10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(100);
    }
}
