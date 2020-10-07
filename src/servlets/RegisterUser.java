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
import model.User;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/cadastro-usuario-servlet")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private Data data;
	
    public RegisterUser() {
        super();
        this.data = Data.getData();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String password = request.getParameter("password");
		
		User newUser = new User(name, email, phone, address, password);
		
		
		RequestDispatcher rd;
		if (data.addUser(newUser)) {
			rd = request.getRequestDispatcher("home.jsp");
			request.setAttribute("feedback", "Usuario cadastrado com sucesso!");
		} else {
			rd = request.getRequestDispatcher("cadastro-usuario.jsp");
			request.setAttribute("error", "Ja existe usuario cadastrado com o email ou telefone inserido");
		}
		rd.forward(request, response);
	}

}
