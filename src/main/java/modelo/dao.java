/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fran13
 */
public class dao {

    public dao() {

    }

    public ResultSet query(String query) {

        DBConexion conx = new DBConexion();

        ResultSet ret = null;

        try {

            Statement st = (Statement) conx.getConnection().createStatement();

            ret = st.executeQuery(query);

            ret.close();

            st.close();

            conx.desconectar();

        } catch (SQLException ex) {

            Logger.getLogger(dao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ret;
    }

//    public List lista_cachimba(){
//        
//    }
}
