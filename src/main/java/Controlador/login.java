package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("enviar")!=null) {
			String usuario, password;
			usuario=request.getParameter("usuario");
			password=request.getParameter("contraseña");
			if(usuario.equals("a") && password.equals("1234")) {
				//?nom=+usuario se envia el nombre del usuario a menu jsp como parametro
				response.sendRedirect("menu.jsp?nom="+usuario);
			}else {
				response.sendRedirect("Login.jsp");
			}
		}
	}

}
