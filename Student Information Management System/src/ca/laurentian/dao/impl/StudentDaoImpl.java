package ca.laurentian.dao.impl;

import ca.laurentian.dao.StudentDao;
import ca.laurentian.domain.Student;
import ca.laurentian.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement queryStudent = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtil.getConn();
            String sql = "select * from t_stu";
            queryStudent = conn.prepareStatement(sql);
            rs = queryStudent.executeQuery();

            // more data is loaded with objects and more objects are loaded with collections
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setAge(rs.getInt("age"));
                student.setName(rs.getString("name"));
                student.setGender(rs.getString("gender"));
                student.setAddress(rs.getString("address"));
                studentList.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(conn, queryStudent, rs);
        }
        return studentList;
    }
}
