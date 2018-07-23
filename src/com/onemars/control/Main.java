package com.onemars.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onemars.beans.UserBean;
import com.onemars.beans.convertors.UserBeanConverter;
import com.onemars.model.User;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Home")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}
	
	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Unallowed Protocol, please contact your administrator.");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//mise en place du timeout à 5mins (300sec)
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(300);
		
		//preparation de la redirection
		RequestDispatcher dispatcher;
		String redirection = "index.jsp";
		
		//recupération de l'action venant de la jsp
		String action = "action";
		action = request.getParameter(action);
		
		//DO things
		
		//action de valider le formulaire
		if ("Connection".equals(action)) {
			
			String userLogin;
			userLogin = request.getParameter("userLogin");
			userLogin = userLogin.trim();
			
			String userPassword;
			userPassword = request.getParameter("userPassword");
			userPassword = userPassword.trim();
			
			UserBean userBean = new UserBean(userLogin, userPassword);
			
			User user = null;
			
			try {
				user = UserBeanConverter.convertFromBean(userBean);
				
				
				//si le user est reconnu
				if(user.getStatus()) {
					
					userBean = UserBeanConverter.convertToBean(user);
					session.setAttribute("userBean", userBean);
					
					redirection = "reservation.jsp";
				}
				//si le user n'est pas reconnu
				else {
					//ajouter un pop-up qui indique qu'il y a eu un soucis
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//action a faire si la convertion echoue 
				e.printStackTrace();
			}
			
		}
		
		//action de valider le formulaire
		if ("Disconnection".equals(action)) {
			session.removeAttribute("userBean");
			session.invalidate();
		}
		
		//fin Do things
		
		//redirection
		dispatcher = request.getRequestDispatcher(redirection);
		dispatcher.forward(request, response);
		
	}

}
