package org.example.restspring.dao.mappers;

import org.example.restspring.entities.ARTICLE;
import org.example.restspring.entities.SKIRTS;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SkirtsRowMapper implements RowMapper<SKIRTS> {
    @Override
    public SKIRTS mapRow(ResultSet resultSet, int i) throws SQLException{
        final SKIRTS skirts = new SKIRTS();

        skirts.setNAME(resultSet.getString("NAME"));
        skirts.setBRAND(resultSet.getString("BRAND"));

        return skirts;
    }
}
