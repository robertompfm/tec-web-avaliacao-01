package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Data;
import model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Data data;
       
    public LoginServlet() {
		super();
		this.data = Data.getData();
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		User user = data.findUserByEmail(email);
		
		RequestDispatcher rd;
		if (user != null && user.getPassword().equals(password)) {
			rd = request.getRequestDispatcher("home.jsp");	
		} else {
			rd = request.getRequestDispatcher("index.jsp");
			request.setAttribute("error", "Usuario ou senha invalido");
		}
		rd.forward(request, response);
	}

}
