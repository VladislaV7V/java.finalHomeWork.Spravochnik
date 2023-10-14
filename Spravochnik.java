package Tell;

import java.util.Scanner;

public class Spravochnik {
    static boolean f = true;
    public static void main(String[] args) {
        while (f) {
            System.out.println("Приветствую!");
            System.out.println("1 - Вывести все контакты.");
            System.out.println("2 - Поиск определенного контакта.");
            System.out.println("3 - Добавить контакт.");
            System.out.println("4 - Изменить контакт.");
            System.out.println("5 - Удалить контакт.");
            System.out.println("0 - выход из программы.");
            System.out.print("Введите команду: ");
            int res = Integer.parseInt(scan.nextLine());
            System.out.println(res);
            switch (res) {
                case 0:
                    System.out.println("Завершение работы. Хорошего дня!");
                    f = false;
                break;
                case 1:
                    getListContact();
                break;
                case 2:
                    searchContact();
                break;
                case 3:
                    addContact();
                break;
                case 4:
                    editContact();
                break;
                case 5:
                    deleteContact();
                break;
                default:
                    System.out.println("Введено недопустимое число, повторите попытку.");
                break;
            }            
        }
    }

    static Scanner scan = new Scanner(System.in);
    public static void fName() {
        System.out.println("Hello, Geek Brains!");
    }

    static void addContact(){        
        int a = 300;
        double b = 3.1999;

        System.out.println("Введите Ваше имя: ");
        String name = scan.nextLine();
        System.out.println("Привет, " + name + "!");
        System.out.printf("%d%.4f Привет %.4s !\n", a, b, name);
        System.out.println("good day!");
    }

    public static void collMaxNextValume() {
        int[] collection = new int[] {1, 0, 1, 1, 1, 1, 0, 1};
        int elem = collection[0];
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < collection.length; i++){
            if (elem == collection[i]){
                count += 1;
            }
            else {
                if(maxCount < count){
                    maxCount = count;
                }
                elem = collection[i];
                count = 1;
            }
        }
        if(maxCount < count){
            maxCount = count;
        }
        System.out.println(maxCount);
    }
}
