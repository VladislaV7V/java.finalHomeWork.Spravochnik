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

    public static void getListContact() {
        System.out.println("getListContact");
    }

    public static void searchContact() {
        System.out.println("searchContact");
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

    public static void editContact() {
        System.out.println("editContact");
    }

    public static void deleteContact() {
        System.out.println("deleteContact");
    }
}
