/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.mvc;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.view.ItemView;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.SQLException;




/**
 *
 * @author sahan
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            DBConnection.getInstance().getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Example.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Example.class.getName()).log(Level.SEVERE, null, ex);
        }

        ItemView itemView = new ItemView();
        itemView.setVisible(true);
    }
}
