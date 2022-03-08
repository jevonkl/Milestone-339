package com.gcu.data.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gcu.data.entity.ProductEntity;

/*
 * RowMapper is an Interface used by Jdbc Template for mapping rows of a result set
 * on a per-row basis. Implementation of this interface perform the
 * work of mapping each row to a result object
 */

public class ProductRowMapper implements RowMapper<ProductEntity> {
	public ProductEntity mapRow(ResultSet rs, int rowNumber) throws SQLException {
		return new ProductEntity(rs.getLong("ID"), rs.getString("GAME_NO"), rs.getString("GAME_NAME"),
				rs.getFloat("PRICE"), rs.getInt("QUANTITY"));
	}

}
