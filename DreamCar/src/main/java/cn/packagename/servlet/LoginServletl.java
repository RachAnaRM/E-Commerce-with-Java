package cn.packagename.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import cn.packagename.connection.DBConnection;
import cn.packagename.dao.UserDao;
import cn.packagename.model.User;

/**
 * Servlet implementation class LoginServletl
 */
public class LoginServletl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public LoginServletl() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("login.jsp");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()) {
//			out.print("This is servlet login");
			String email = request.getParameter("login-email");
			String password = request.getParameter("login-password");

//				UserDao udao;
				try {
					UserDao udao = new UserDao(DBConnection.getConnection());
					User user = udao.userLogin(email, password);
					
					if(user != null ) {
						out.print("user login");
					}
					else {
						out.print("user email/password false");
					}
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//			out.print(email+password);
		}
	}

}
