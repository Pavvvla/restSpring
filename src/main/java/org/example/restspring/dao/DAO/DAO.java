package org.example.restspring.dao.DAO;

import org.jetbrains.annotations.NotNull;

public interface DAO <T, String>{

     void create(T t);

     boolean read(T t);

     boolean update(T t);

     boolean delete(T t);

}
