package Local;

import java.util.Scanner;

public class Authentification {

    private String login = "Admin";
    private String password = "P@ssw0rd";

    public void Authentification() {
        this.login = login;
        this.password = password;


        // На 10 строке создаём объект класса Scanner для обработки ввода с клавиатуры
        Scanner in = new Scanner(System.in);

        System.out.print("Введите login: ");

        // На 19 строке создаем строкову локальную переменную с именем usersLogin
        // и принимаем в нее ввод от пользователя

        String usersLogin = in.next();

        if (login.equals(usersLogin)) {
            System.out.print("Введите password: ");
            String usersPassword = in.next();

            if (password.equals(usersPassword)) {
                System.out.println("Здравствуйте " + usersLogin + ", Вы вошли в систему.");
            } else {
                System.out.println("Вы ввели неверный пароль!");
            }
        } else {
            System.out.println("Нет пользователя с таким именем!");
        }
    }

}