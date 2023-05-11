package gb.ru.lesson5.repository;

import gb.ru.lesson5.model.Student;

import java.util.List;

public interface StudentRepository extends Repository<Student, Long> {
    Long countAll();

    List<Student> mergeBatch(List<Student> entities);

    List<Student> findByName(String name);

    boolean removeAll();
}
