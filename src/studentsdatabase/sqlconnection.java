package studentsdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;





public class sqlconnection {

	
	
	
	public List<students>   adddetail(students data,List<students> store) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/studentsdata", "root", "");
		
		 
	
		
		Statement stmt = (Statement) con.createStatement();

		stmt.execute("insert into students(id,name,tamil,english,maths,science,social)"
				+ "values"
				+ "("
				+ data.id
				+ ","
				+ "'"
				+ data.name
				+ "'"
				+ ","
				
			
				+ data.tamil
				+ ","
				+ data.english
				+ ","
				+ data.maths
				+ ","
				+ data.science
				+ ","
				+ data.social + ")");
		
		String query = "select * from students";
		 stmt = (Statement) con.createStatement();
		 
		 ResultSet rs = stmt.executeQuery(query);
		 while(rs.next()){
		 
		 int id = rs.getInt(1);
		 String name = rs.getString(2);
		 int tamil = rs.getInt(3);
		 int english = rs.getInt(4);
		 int maths = rs.getInt(5);
		 int science = rs.getInt(6);
		 int social = rs.getInt(7);
		 students list = new students(id,name,tamil,english,maths,science,social);
		 
			 store.add(list);
		 }
		 con.close();
		 return store; 
		
	}

	public List<reults> getresult(String searchname, List<reults> resultstore) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/studentsdata", "root", "");
		
		String query = "select * from students where name="+"'"+searchname+"'";
		Statement stmt = (Statement) con.createStatement();
		stmt = (Statement) con.createStatement();
		 students[] resultdata = new students[1];
		 ResultSet rs = stmt.executeQuery(query);
		 reults[] res = new reults[1]; 
		 while(rs.next()){
			 int id = rs.getInt(1);
			 String name = rs.getString(2);
			 int tamil = rs.getInt(3);
			 int english = rs.getInt(4);
			 int maths = rs.getInt(5);
			 int science = rs.getInt(6);
			 int social = rs.getInt(7);
			int total = tamil+english+maths+science+social;
			int avg = total/5;
			boolean studentresult;
			if (tamil < 40 ||english < 40
					|| maths < 40 || science < 40
					|| social < 40) {

			   studentresult = false;

			} else {

			   	studentresult = true;
			}
			
			reults re = new reults (total,avg,studentresult,id,name,tamil,english,maths,science,social);
		    
	        resultstore.add(re);
		 }
		
		return resultstore;
	}
	

}
