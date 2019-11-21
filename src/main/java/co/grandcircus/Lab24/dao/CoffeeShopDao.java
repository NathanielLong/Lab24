package co.grandcircus.Lab24.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.Lab24.Products;
import co.grandcircus.Lab24.UsersInfo;

@Repository
public class CoffeeShopDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;	
	
	//This is the R in CRUD
	public List<Products> findAllProducts() {
		//The BeanPropertyRowMapper class helps us map the table columns to the instance
		//variables/getters and setters for the food class
		return jdbcTemplate.query("select * from products", new BeanPropertyRowMapper<Products>(Products.class));
	}
	
	public int addUsers(String nameFirst, String nameLast, Integer phone, String password, String email) {
		//We are using prepared statements which use the ? for all of the values in a SQL
		//statement, they attempt to protect our data in the DB from hackers and help make the code
		//more efficient when making several queries to the DB
		String addQuery = "insert into users(firstname, lastname, phone, password, email) values(?,?,?,?,?)";
		return jdbcTemplate.update(addQuery, nameFirst, nameLast, phone, password, email);
	}

	public List<UsersInfo> findAllUsers() {
		//The BeanPropertyRowMapper class helps us map the table columns to the instance
		//variables/getters and setters for the food class
		return jdbcTemplate.query("select * from users", new BeanPropertyRowMapper<UsersInfo>(UsersInfo.class));
	}
	
	public int addToCart(String name, String description, Integer quantity, Double price) {
		//We are using prepared statements which use the ? for all of the values in a SQL
		//statement, they attempt to protect our data in the DB from hackers and help make the code
		//more efficient when making several queries to the DB
		String addQuery2 = "insert into userproducts(name, description, quantity, price) values(?,?,?,?)";
		return jdbcTemplate.update(addQuery2, name, description, quantity, price);
	}
	
	
	
	
	
	
	
}
