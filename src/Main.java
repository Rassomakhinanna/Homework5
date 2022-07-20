import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        int num = 0;
        while(num < 10) {
            System.out.print(++ num + " ");
        }
        System.out.println();

        for(; num > 0; num--) {
            System.out.print(num + " ");
        }

        // Задание 2
        int friday = 6;
        for (int currentFriday = friday; currentFriday <= 31; currentFriday +=7){
            System.out.println("Сегодня пятница " + currentFriday + " нужно подготовить отчет");
        }

        // Задание 3
        int currentYear = LocalDate.now().getYear();

        int start = currentYear - 200;
        int end = currentYear + 100;

        for(int y = start; y <= end; y++){
            if (y % 79 == 0){
                System.out.println(y);
            }
        }
    }
}