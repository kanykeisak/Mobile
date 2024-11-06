public class Lesson_2_2 {
    public static void main(String[] args) {
        int numberOfStudents = 20, temperature = 15;
        boolean isRainy = true;
        if (temperature > 10 && temperature < 35) { //true && true
            // && - логиский опретор и (AND) *
            System.out.println("Хорошой прогулки");
        }

        if (numberOfStudents == 22 && temperature > 7){ // false && true
            System.out.println("Играем в футбол");
        }

        if (temperature > 7 && numberOfStudents == 22){ // true && false
            System.out.println("Играем в футбол");
        }

        if (temperature < 15 || isRainy) { // false || true
            // || - логиский опретор или (OR)
            System.out.println("Холодно");
        }

        if (isRainy || temperature > 20) { // true || false
            // || - логиский опретор или (OR) +
            System.out.println("Прохладно");
        }

        if (isRainy){
            System.out.println("Возьмите зонт!");
        }

        if(!isRainy){ // false
            // ! - логический оператор отрицание не (NOT)
            System.out.println("Идем купаться!!!");
        }

        if (temperature > 0 && temperature < 15
                || numberOfStudents > 5 && numberOfStudents < 10
                || isRainy) {
            // true && false || true && false || true => 1 * 0 + 1 * 0 + 1 => 0 + 0 + 1 => 1 (TRUE)
            System.out.println("Идем в кафе");
        }
    }
}
