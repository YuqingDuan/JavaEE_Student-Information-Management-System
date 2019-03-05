package ca.laurentian.dao;

import ca.laurentian.domain.Student;

import java.util.List;

public interface StudentDao {
    /**
     * Finds out all the students' information in database stus.
     *
     * @return
     */
    List<Student> findAll();
}
