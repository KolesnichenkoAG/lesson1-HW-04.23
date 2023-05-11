package gb.ru.lesson5;

import org.flywaydb.core.Flyway;

public class AppHibernate {

    public static void main(String[] args) {
        Flyway database = Flyway.configure()
                .dataSource("jdbc:mysql://localhost/hibernate_lesson5", "root", "kag1981")
                .load();
        database.migrate();

        // запускаем тесты
        new Tests().start();
        System.out.println(" Тест завершен ");
    }
}



