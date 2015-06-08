import java.sql.*;

public class Database{
	Connection con;
	tatement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	private final String list_name;
	public Database(String name,String lname){
		con=DriverManager.getConnection ("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ="+name);
		stmt=con.createStatement();
		list_name=lname;
	}
	@Override
	public void finalize(){
		con.close();
	}
	public Question[] Prepare(int numq){
	}
	public void UpdateProfic(String name,int delta){
	}
	public void creatNewList(String s){
	}
	public void addNewEntry(Word a){
		stmt.executeUpdate("INSERT INTO DemoTable (test_id, test_val) VALUES(1,'One')");
	}
}