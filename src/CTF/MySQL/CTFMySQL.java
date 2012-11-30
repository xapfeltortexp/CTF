package CTF.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import CTF.CTF;

public class CTFMySQL {

	public CTF main;

	public CTFMySQL(CTF main) {
		this.main = main;
	}

	public Connection connect;

	public void mySqlConnect() {

		String connection = "jdbc:mysql://" + main.MySQLHost + ":" + main.MySQLPort + "/" + main.MySQLTable;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connect = DriverManager.getConnection(connection, main.MySQLUser, main.MySQLPassword);
			System.out.print("[CTF] MySQL connection is ok.");
			return;
		} catch (Exception ex) {
			System.out.print("[CTF] There was an Error: " + ex);
			return;
		}

	}

	public void MySQLDisconnect() {

		try {
			this.connect.close();
		} catch (SQLException e) {
			System.out.print("[CTF] There was an Error: " + e);
		}

	}

	public void write(String sql) {

		try {
			Statement statement = this.connect.createStatement();
			statement.executeUpdate(sql);
			statement.close();
		} catch (SQLException ex) {
			System.out.print("[CTF] There was an Error: " + ex);
		}

	}

	public void generateTables() {

    /**
     * TODO: Generate Tables
     */

	}
	
	public void addArena() {
		/**
		 * TODO: Save an Arena
		 */
	}

}
