package ca.laurentian.dao.impl;

import ca.laurentian.dao.UserDao;
import ca.laurentian.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(String username, String password) {
        Connection conn = null;
        PreparedStatement queryUser = null;
        ResultSet rs = null;
        try {
            // get "conn"
            conn = JDBCUtil.getConn();
            // sql sentence
            String sql = "select * from t_user where username=? and password=?";
            // instance PreparedStatement(instead of Statement)
            /*
            Code Fragment 1:
            Statement stmt = conn.createStatement();
            String updateString = "UPDATE COFFEES SET SALES = 75 " + "WHERECOF_NAME LIKE ′Colombian′";
            stmt.executeUpdate(updateString);
             */
            /*
            Code Fragment 2:
            PreparedStatement updateSales = conn.prepareStatement("UPDATE COFFEES SETSALES = ? WHERE COF_NAME LIKE ? ");
            updateSales.setInt(1, 75);
            updateSales.setString(2, "Colombian");
            updateSales.executeUpdate();
             */
            queryUser = conn.prepareStatement(sql);
            queryUser.setString(1, username);
            queryUser.setString(2, password);
            rs = queryUser.executeQuery();

            // return query result
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // param2 is similar to: Statement st = new PreparedStatement()
            JDBCUtil.release(conn, queryUser, rs);
        }
        return false;
    }
}
