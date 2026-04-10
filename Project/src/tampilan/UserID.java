/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tampilan;

/**
 *
 * @author Aura Pitaloka
 */
public class UserID {
    private static String userLogin;

    // Constructor and other methods can be added as needed.

    public static void setUserLogin(String username) {
        // You might want to perform additional validation or processing here.
        userLogin = username;
    }

    public static String getUserLogin() {
        return userLogin;
    }
}