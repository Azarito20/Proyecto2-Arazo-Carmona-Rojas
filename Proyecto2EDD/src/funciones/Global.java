/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.io.File;
import proyecto2edd.UserList;

/**
 *
 * @author pjroj
 */
public class Global {
    private static File file;
    private static UserList userlist;

    public static UserList getUserlist() {
        return userlist;
    }

    public static void setUserlist(UserList list) {
        Global.userlist = list;
    }

    public static File getFile() {
        return file;
    }
    
    public static void setFile(File file) {
        Global.file = file;
    }
    
}
