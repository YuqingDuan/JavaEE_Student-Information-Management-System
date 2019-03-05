package ca.laurentian.web.servlet;

import ca.laurentian.dao.StudentDao;
import ca.laurentian.dao.UserDao;
import ca.laurentian.dao.impl.StudentDaoImpl;
import ca.laurentian.dao.impl.UserDaoImpl;
import ca.laurentian.domain.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * This is a servlet for handling login request.
 */
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // the submitted data may contain Chinese, avoid scrambling
        request.setCharacterEncoding("UTF-8");
        // may write Chinese to web page
        response.setContentType("text/html;charset=utf-8");

        // get data submitted by users
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // print to check
        // System.out.println("username: " + username + ", password: " + password);

        // check whether the user name and password are valid
        UserDao userDao = new UserDaoImpl();
        boolean isValid = userDao.login(username, password);

        // print the result to page
        if (isValid) {
            // response.getWriter().write("login successfully!");
            // after successful login, jump to the stu_list page
            // 1. query out all the students' information
            StudentDao studentDao = new StudentDaoImpl();
            List<Student> studentList = studentDao.findAll();
            // 2. put studentList into session scope
            request.getSession().setAttribute("students", studentList);
            // 3. redirect/ forward
            response.sendRedirect("stu_list.jsp");
        } else {
            response.getWriter().write("ERROR: Incorrect username or password!");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
