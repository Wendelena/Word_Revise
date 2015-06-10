import java.sql.*;

public class Database{
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	public Database(String name){
		try{
			con=DriverManager.getConnection ("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ="+name);
			stmt=con.createStatement();
		}catch(Exception e){
			System.err.println("Error occured in Constructor.");
		}
	}
	@Override
	public void finalize(){
		try{
			con.close();
		}catch(Exception e){
			System.err.println("Error occured in finalize()");
		}
	}
	public Word[] Prepare(String lname,int numq){
		return null;
	}
	public void UpdateProfic(String lname,String name,int delta){
	}
	public void creatNewList(String lname){
	}
	public void addNewEntry(String lname,Word a){
		try{
			stmt.executeUpdate("INSERT INTO DemoTable (test_id, test_val) VALUES(1,'One')");
		}catch(Exception e){
			System.err.println("Error occured in addNewEntry(Word a)");
		}
	}
}