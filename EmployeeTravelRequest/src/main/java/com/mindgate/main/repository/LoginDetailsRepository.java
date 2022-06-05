package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mindgate.main.pojo.LoginDetails;

@Repository
public class LoginDetailsRepository implements LoginDetailsRepositoryInterface {
	@Autowired
	JdbcTemplate jdbcTemplate;

	private int result;
	private static final String INSERT_LOGIN_DETAILS = "INSERT INTO LOGIN_DETAILS(PASSWORD,ROLE) VALUES (?,?)";
	private static final String UPDATE_LOGIN_DETAILS = "UPDATE LOGIN_DETAILS SET PASSWORD=? ,ROLE=? WHERE LOGIN_ID=?";
	private static final String DELETE_LOGIN_DETAILS_BY_ID = "DELETE FROM LOGIN_DETAILS WHERE LOGIN_ID=?";
	private static final String GET_LOGINDETAILS_BY_ID = "SELECT * FROM LOGIN_DETAILS WHERE LOGIN_ID=?";
	private static final String GET_ALL_LOGIN_DETAILS = "SELECT* FROM LOGIN_DETAILS";

	@Override
	public boolean addLoginDetails(LoginDetails loginDetails) {
		System.out.println("inserting new employee into database");

		result = jdbcTemplate.update(INSERT_LOGIN_DETAILS, loginDetails.getPassword(), loginDetails.getRole());

		if (result > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateLoginDetails(LoginDetails loginDetails) {

		result = jdbcTemplate.update(UPDATE_LOGIN_DETAILS,
				new Object[] { loginDetails.getPassword(), loginDetails.getRole(),loginDetails.getLoginId()});
		if (result > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteLoginDetailsById(int loginId) {

		result = jdbcTemplate.update(DELETE_LOGIN_DETAILS_BY_ID, loginId);
		if (result > 0)
			return true;

		return false;
	}

	@Override
	public LoginDetails getLoginDetailsById(int loginId) {

		LoginDetails loginDetails = jdbcTemplate.queryForObject(GET_LOGINDETAILS_BY_ID, new LoginDetailsRowMapper(),
				new Object[] { loginId });

		return loginDetails;
	}

	@Override
	public List<LoginDetails> getAllLoginDetails() {

		List<LoginDetails> list = jdbcTemplate.query(GET_ALL_LOGIN_DETAILS, new LoginDetailsRowMapper());
		return list;
	}

	public static final class LoginDetailsRowMapper implements RowMapper<LoginDetails> {

		@Override
		public LoginDetails mapRow(ResultSet resultSet, int arg1) throws SQLException {
			int loginId = resultSet.getInt("Login_Id");
			String password = resultSet.getString("Password");
			String role = resultSet.getString("Role");

			LoginDetails loginDetails = new LoginDetails();
			loginDetails.setLoginId(loginId);
			loginDetails.setPassword(password);
			loginDetails.setRole(role);
			return loginDetails;
		}

	}

}
