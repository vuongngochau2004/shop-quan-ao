package DAO;

import java.util.List;

import Mapper.RowMapper;

public interface GenericDAO<T> {
	 List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
}
