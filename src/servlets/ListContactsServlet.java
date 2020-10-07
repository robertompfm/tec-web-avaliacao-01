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

/**
 * Servlet implementation class ListContactsServlet
 */
@WebServlet("/lista-contatos-servlet")
public class ListContactsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private Data data;
    
    public ListContactsServlet() {
        super();
        data = Data.getData();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("contacts", data.getContacts());
		RequestDispatcher rd = request.getRequestDispatcher("lista-contatos.jsp");
		rd.forward(request, response);
	}

}
