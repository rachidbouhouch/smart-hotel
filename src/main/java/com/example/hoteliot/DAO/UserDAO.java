package com.example.hoteliot.DAO;

import com.example.hoteliot.Models.Admin;
import com.example.hoteliot.Models.BDSingleton;
import com.example.hoteliot.Models.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    public User getConnectedUser(String userName, String password) {
        Admin admin=null;
        PreparedStatement pstmt;
        ResultSet rs = null;
        String sqlQuery="SELECT * FROM admin WHERE username=? AND motdepasse=?";

        try {
            pstmt= BDSingleton.getConn().prepareStatement(sqlQuery);
            pstmt.setString(1,userName);
            pstmt.setString(2,password);
            rs=pstmt.executeQuery();
            while(rs.next()){
                long id=rs.getLong("id");
                String prenom = rs.getString("prenom");
                String nom = rs.getString("nom");
                String email = rs.getString("email");
                String username = rs.getString("username");
                String motdepasse = rs.getString("motdepasse");
                String cin =rs.getString("cin");
                admin = new Admin(id,prenom,nom ,email,cin,username, motdepasse);

            }

        }
        catch(Exception e){
            e.printStackTrace();

        }
        return admin;
    }
}
