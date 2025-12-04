package Homework_05;
public class StringPool {
    /*
    2. Сравнение строк — "Проверка пароля"
        Тема: Сравнение строк (equals() vs ==)
        Описание:
        Напиши программу, которая:
        Хранит правильный пароль (пример):

        String correctPassword = "JavaRocks";

        Просит пользователя ввести пароль (можно задать вручную переменную String input = "JavaRocks"; для теста).
        Сравнивает строки:
        Если пароль совпадает (equals()), выводит "Access granted".
        Иначе — "Access denied".
        Для эксперимента также сравни == и покажи разницу в выводе.
    */

    private String correctPassword = "JavaRocks";
    private String input;

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void checkPassword() {
      /*  if (correctPassword.equals(input)) {
            System.out.println("Access granted (equals)");
        }

        else {
            System.out.println("Access denied (equals)");
        }*/
        String result = correctPassword.equals(input) ? "Access granted (equals)" : "Access denied (equals)";
        System.out.println(result);
    }
}