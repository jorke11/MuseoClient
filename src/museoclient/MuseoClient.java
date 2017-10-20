/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museoclient;

import java.util.List;
import museocommon.DataUser;

/**
 *
 * @author pinedo
 */
public class MuseoClient {

    /**
     * @param args the command line arguments
     */
    public static List<DataUser> listUser;

    public static void main(String[] args) {
        Container win = new Container();
        win.setVisible(true);

    }

}
