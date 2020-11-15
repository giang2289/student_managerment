/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_management.dao;

import java.util.List;
import java.util.Map;
import javax.management.relation.Role;
import student_management.entities.User;

/**
 *
 * @author GIANG
 */
public interface IUser {
    public boolean checkUser(User user);
    public User getNewUserRegister(String name, String pass, String email);

    public void insert(User user);

    public void update(User user);

    public void delete(User user);

    public boolean confirmUser(User user, String code);

    public boolean updatePasswordByEmail(User user, String password);

    public List<User> getAllUser();

    public User getUserToLogin(String name, String pasword);

    public User getUserByEmail(String email);

    public User getUserByName(String name);

    public User addVerifyCodeByEmail(String email, Integer code);

    public void closeDatabaseConnection();

    public boolean checkUserNameNotExists(String username);

    public boolean checkUserEmailNotExists(String email);
 public Map<String,User> getListMapUserWithRole();

}
