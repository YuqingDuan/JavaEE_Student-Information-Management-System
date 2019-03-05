package ca.laurentian.dao;

/**
 * The Dao defines access rules for t_user table.
 */
public interface UserDao {
    /**
     * Here we simply return a boolean type, true or false.
     * But when developing, once the login is successful, the user's personal information should be returned here.
     *
     * @param username
     * @param password
     * @return true: login successfully; false: login failed
     */
    boolean login(String username, String password);
}
