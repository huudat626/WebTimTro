package com.tro.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.tro.beans.Account;

public class AccountMapper implements RowMapper<Account> {
  public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
	  Account account = new Account();
	  account.setAccount_id(rs.getInt("ID"));
	  account.setAccount_name(rs.getString("Name"));
	  account.setPhone_number(rs.getString("PhoneNumber"));
	  account.setAddress(rs.getString("address"));
	  account.setEmail(rs.getString("Email"));
	  account.setPassword(rs.getString("PassWord"));
    return account;
  }
}

