/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioangiv4;

import biblioangiv4.ConnectionMysql;

/**
 *
 * @author MACIEK
 */
public class Main {
    
    public static void main(String[] arg){
        ConnectionMysql connection = new ConnectionMysql();
        connection.getData();
        connection.insertData();
    }
    
}
