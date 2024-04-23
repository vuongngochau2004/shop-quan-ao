package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.User;

public class UserMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs) {
		
			try {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setFullname(rs.getString("fullname"));
				user.setEmail(rs.getString("email"));
				user.setPhoneNumber(rs.getString("phone_number"));
				user.setAddress(rs.getString("address"));
				user.setPassword(rs.getString("password"));
				user.setDeleted(rs.getBoolean("deleted"));
				user.setRole(rs.getInt("role"));			
				return user; 
			} catch (SQLException e) {
				return null;
			}	
	}

}
