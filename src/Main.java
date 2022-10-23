import java.util.Scanner;


public class Main {

    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.println("Введите номер операции: 1.Сложение 2. Вычитание 3.Умножение");
        int operation = scanner.nextInt();
        int res = 0;
        switch (operation){
            case 1:
                res = num1 + num2;
                System.out.println("Результат: " + res );
                break;
            case 2:
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;
            case 3:
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;
            default:
                System.out.println("Операция не определена");
                break;
        }
        scanner.close();



    }
}
