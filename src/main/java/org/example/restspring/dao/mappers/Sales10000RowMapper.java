package org.example.restspring.dao.mappers;

import org.example.restspring.entities.ARTICLE;
import org.example.restspring.entities.SALAS10000;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sales10000RowMapper implements RowMapper<SALAS10000> {
    @Override
    public SALAS10000 mapRow(ResultSet resultSet, int i) throws SQLException{
        final SALAS10000 sale10000 = new SALAS10000();

        sale10000.setNAME(resultSet.getString("NAME"));
        sale10000.setMANY(resultSet.getInt("MANY"));

        return sale10000;
    }
}
