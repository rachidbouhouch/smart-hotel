package com.example.hoteliot.DAO;

import java.util.List;

public interface DAO<T> {
    List<T> getAll();
    boolean Add(T element);
    boolean delete(int id);
    boolean update(T element);

}
