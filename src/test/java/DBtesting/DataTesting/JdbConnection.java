package DBtesting.DataTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JdbConnection {
	
	
	
	

	public static void main(String[] args) throws SQLException {
		
		
		
		
		
		
		
	
		String host = "localhost";
		String port = "3306";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/Qadbt", "root", "Dots@123");
		Statement s = con.createStatement();
		ResultSet rs=s.executeQuery("select * from credentials where name='Adam';");
		
	
		
		
		while(rs.next()){
			
			
	
			
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.cssSelector("input[id=\"username\"]")).sendKeys(rs.getString("username"));
		driver.findElement(By.cssSelector("input[id=\"password\"]")).sendKeys(rs.getString("password"));	
		System.out.println(rs.getString("username"));
		System.out.println(rs.getString("password"));
		
		// IF we want to insert database data to our selenium test case then we need to follow below codes
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://login.salesforce.com/?locale=in"); // Visit the any username and password field link(Any website URL) to check that our username and password data are coming in the respective field or not 
//		driver.findElement(By.cssSelector("input[id=\"username\"]")).sendKeys(rs.getString("username"));// Inserting username value in the username field available on that form
//		driver.findElement(By.cssSelector("input[id=\"password\"]")).sendKeys(rs.getString("password"));// Inserting password value in the password field available on that form
//		
		
		
		
		
		
		}
		
	

	}

}
