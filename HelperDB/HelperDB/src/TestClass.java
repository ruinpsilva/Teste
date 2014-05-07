/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import HelperDB.DBAccessObj;
import java.sql.*;
/**
 *
 * @author Miguel
 */
public class TestClass {
    public static void main(String[] args) {
        DBAccessObj conexao = new DBAccessObj();
        
        conexao.executeSQL("Insert into Author columns (Name, SURNAME) VALUES ('XICO', 'MENDES')");
        
        ResultSet rs = conexao.executeQuery("SELECT * FROM AUTHOR");
        
        try{
             while(rs.next()){
                    int aID = ((int)rs.getInt("Id"));
                    String aName = ((String)rs.getString("Name"));
                    String aSurname = ((String)rs.getString("Surname"));
                    //
                    System.out.println(Integer.toString(aID) + " " + aName + " " + aSurname);
             }
        }
        catch(Exception e){
                System.out.println("ERRO " + e.getMessage());
        }      
    }
}
