package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Data;
import model.Contact;
import model.User;

/**
 * Servlet implementation class ListContactsServlet
 */
@WebServlet("/lista-usuarios-servlet")
public class ListUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private Data data;
    
    public ListUsersServlet() {
        super();
        data = Data.getData();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("users", data.getUsers());
		RequestDispatcher rd = request.getRequestDispatcher("lista-usuarios.jsp");
		rd.forward(request, response);
	}

}
