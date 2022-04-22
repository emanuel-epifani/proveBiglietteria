package com.crud_bigliettera.repository;

import com.crud_bigliettera.model.Utente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.crud_bigliettera.CredentialsDB.CredentialsDb.*;

public class UtenteRepository {

   public static List<Utente> selezionaUtente() {
       List<Utente> utenteList = new ArrayList<>();

       try {
           Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
           Statement stmt = conn.createStatement();
           ResultSet rs = stmt.executeQuery("SELECT * FROM utente");
           while (rs.next()){
               Utente st = new Utente(
                       rs.getInt("id_utente"),
                       rs.getString("nome_utente"),
                       rs.getString("cognome_utente")
               );
               utenteList.add(st);
           }
           conn.close();
           stmt.close();
           return utenteList;

       } catch (SQLException ex){
           // handle any errors
           System.out.println("SQLException: " + ex.getMessage());
           System.out.println("SQLState: " + ex.getSQLState());
           System.out.println("VendorError: " + ex.getErrorCode());
       }
       return new ArrayList<>();
   }


}
