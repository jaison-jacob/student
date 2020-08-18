package studentsdatabase;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Main
 */
//@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    /**
     * Default constructor. 
     */
    public Main() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("index.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		sqlconnection connect = new sqlconnection();
		
	    List <students> store = new ArrayList();
		
	    String switch1 = request.getParameter("page");
	    System.out.println(switch1);
	    
	    
		if (switch1.equalsIgnoreCase("add")) {
			String name = request.getParameter("name");
			int id = Integer.parseInt(request.getParameter("id"));
			int tamil = Integer.parseInt(request.getParameter("tamil"));
			int english = Integer.parseInt(request.getParameter("english"));
			int maths = Integer.parseInt(request.getParameter("maths"));
			int science = Integer.parseInt(request.getParameter("science"));
			int social = Integer.parseInt(request.getParameter("social"));

			students data = new students(id, name, tamil, english, maths,
					science, social);
			boolean check = true;
			try {
			store = connect.adddetail(data,store);
			} catch (InstantiationException | IllegalAccessException
					| ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("data",store);
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
		if(switch1.equalsIgnoreCase("search")){
			String searchname = request.getParameter("searchname");
			List<reults> resultstore = new ArrayList<reults>();
			try {
				resultstore = connect.getresult(searchname,resultstore);
			} catch (InstantiationException | IllegalAccessException
					| ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			System.out.println(resultstore.get(0).name);
			request.setAttribute("resultdata", resultstore);
			request.getRequestDispatcher("result.jsp").include(request, response);
		}
		
	}

}
