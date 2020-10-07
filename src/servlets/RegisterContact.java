package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Data;
import model.Contact;

/**
 * Servlet implementation class RegisterContact
 */
@WebServlet("/cadastro-contato-servlet")
public class RegisterContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Data data;
	
	public RegisterContact() {
		super();
		this.data = Data.getData();
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		Contact newContact = new Contact(name, email, phone);
		
		RequestDispatcher rd;
		if (data.addContact(newContact)) {
			rd = request.getRequestDispatcher("home.jsp");
			request.setAttribute("feedback", "Contato cadastrado com sucesso!");
		} else {
			rd = request.getRequestDispatcher("cadastro-contato.jsp");
			request.setAttribute("error", "Ja existe contato cadastrado com o email ou telefone inserido");
		}
		rd.forward(request, response);
	}

}
