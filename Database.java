import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Database{
	/*public static void main(String args[]){
		Database db = new Database();
		db.creatNewList("step");
		Word a = new Word("happy", "hp", "love", "pleasant", "lalala", Calendar.getInstance().getTime(), 2);
		db.addNewEntry("step", a);
		db.UpdateProfic("step", "happy", 5, Calendar.getInstance().getTime());
	}*/
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	SimpleDateFormat conv=new SimpleDateFormat("yyyy-MM-dd");
	public Database(){
		  String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  //加载JDBC驱动
		  String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=test";  //连接服务器和数据库test
		  String userName = "sa";  //默认用户名
		  String userPwd = "899";  //密码
		try{
			Class.forName(driverName);
			con = DriverManager.getConnection(dbURL, userName, userPwd);
			stmt = con.createStatement();
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
		try{
			rs=stmt.executeQuery("SELECT TOP "+numq+" * FROM "+lname+" WHERE nextDate <= "+conv.format(new java.util.Date()));
			rs.last();
			int nrow=rs.getRow();
			Word ans[]=new Word[nrow];
			rs.first();
			for (int i=0;i<nrow;i++){
				String n=rs.getString("name");
				String p=rs.getString("pron");
				String m=rs.getString("mean");
				String e=rs.getString("expre");
				String s=rs.getString("synonym_");
				java.util.Date nd=conv.parse(rs.getString("nextDate"));
				int pr=rs.getInt("proficiency");
				ans[i]=new Word(n,p,m,e,s,nd,pr);
			}
			return ans;
		}catch(Exception e){
			System.err.println("Error occured in Prepare()");
			return null;
		}
	}
	public void UpdateProfic(String lname,String name,int newp,java.util.Date newdate){
		try{
			stmt.executeUpdate("UPDATE "+lname+" SET proficiency = "+newp+", nextDate = \'"+conv.format(newdate)+"\' WHERE name = \'"+name + "\'");
		}catch(Exception e){
			System.err.println("Error occured in UpdateProfic");
			e.printStackTrace();
		}
	}
	public void creatNewList(String lname){
		try{
			stmt.executeUpdate("CREATE TABLE [dbo].["+lname+"]([name] NVARCHAR(20) NOT NULL PRIMARY KEY, "
								+"[pron] NVARCHAR(20) NULL, [mean] NVARCHAR(40) NULL, [expre] NTEXT NULL, "
								+"[synonym_] NVARCHAR(20) NULL, [nextDate] DATE NOT NULL, [proficiency] SMALLINT NOT NULL)");
		}catch(Exception e){
			System.err.println("Error occured in creatNewList");
		}
	}
	public void addNewEntry(String lname,Word a){
		try{
			stmt.executeUpdate("INSERT INTO "+lname+" VALUES(\'"+a.name+"\', \'"+a.pron+"\', \'"+a.mean+"\', \'"+a.expre
			+"\', \'"+a.synonym+"\', \'"+conv.format(a.nextDate)+"\', "+a.proficiency+")");
		}catch(Exception e){
			System.err.println("Error occured in addNewEntry(Word a)");
			e.printStackTrace();
		}
	}
}
