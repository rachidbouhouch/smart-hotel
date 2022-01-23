package com.example.hoteliot.DAO;

import com.example.hoteliot.Models.BDSingleton;
import com.example.hoteliot.Models.Client;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO implements DAO<Client> {
        @Override
        public List getAll() {
            List<Client> clients = new ArrayList<>();
            PreparedStatement pstmt;
            ResultSet rs = null;

            try {
                String sqlQuery = "select * from client";
                pstmt = BDSingleton.getConn().prepareStatement(sqlQuery);
                rs=pstmt.executeQuery();
                while (rs.next()) {
                    long id = rs.getLong("id");
                    String prenom = rs.getString("prenom");
                    String nom = rs.getString("nom");
                    String email = rs.getString("email");
                    String cin = rs.getString("cin");
                    String pays = rs.getString("pays");
                    String ville = rs.getString("ville");
                    String telephone = rs.getString("telephone");
                    String address = rs.getString("address");
                    Client client = new Client(id, prenom, nom, email, cin, telephone, address, pays, ville);
                    clients.add(client);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            return clients;

        }

        @Override
        public boolean Add(Client element) {
            return false;
        }

        @Override
        public boolean delete(int id) {
            return false;
        }

        @Override
        public boolean update(Client element) {
            return false;
        }


    }
