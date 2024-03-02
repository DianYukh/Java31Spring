package org.Homework02.User;

import org.Homework02.User.config.UserConfig;
import org.Homework02.User.model.User;
import org.Homework02.User.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Scanner;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
       UserService service = context.getBean(UserService.class);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть операцію");
        boolean isSelect = true;
        while (isSelect) {
            System.out.println("1 Додати нового користувача.");
            System.out.println("2 Видалити існуючого користувача.");
            System.out.println("3 Перевірити, чи існує такий користувач.");
            System.out.println("4 Показати всіх користувачів.");
            System.out.println("0 Вихід.");


            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> service.addUser(new User(2,"Max","max@gmail.com"));
                case 2 -> service.deleteUser(new User());
                case 3 -> {
                    System.out.println("Введіть ідентифікатор користувача для перевірки:");
                    int checkUserId = scanner.nextInt();
                    service.getUser(checkUserId);
                }
                case 4 ->   service.getAllUsers();
                case 0 -> {
                    System.out.println("До побачення");
                    isSelect = false;;
                }
                default ->  System.out.println("Помилка введення операції. Повторіть спробу. Оберіть цифри зі списку.");
            }
            }
        }
    }

