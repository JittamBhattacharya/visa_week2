package com.visa.prj.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.visa.prj.dao.FetchException;
import com.visa.prj.dao.ProductDao;
import com.visa.prj.dao.ProductDaoJdbcImpl;
import com.visa.prj.entity.Product;

/**
 * Servlet implementation class GameServlet
 */
@WebServlet("/game")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ses = request.getSession(true);
		ses.setAttribute("Answer", "Bangalorae");
		ses.setAttribute("Life", 5);
		ses.setAttribute("Hint", "**********");
		request.getRequestDispatcher("game.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ses = request.getSession(true);
		if(ses != null) {
			String guess = request.getParameter("guess");
			String answer = (String) ses.getAttribute("Answer");
			String hint = (String) ses.getAttribute("Hint");
			System.out.println(guess);
			System.out.println(answer);
			int check = answer.indexOf(guess);
			if(check != -1) {
				System.out.println(hint);
				System.out.println(hint.charAt(check));
				while(hint.charAt(check) != '*') {
					System.out.println("I am here!!");
					System.out.println(check);
					check = check +1 + answer.substring(check + 1).indexOf(guess);
					System.out.println(check);
					
				}
				StringBuilder strbld = new StringBuilder(hint);
				System.out.println(strbld.toString());
				System.out.println(check);
				System.out.println(answer);
				strbld.setCharAt(check, answer.charAt(check));
				System.out.println(strbld.toString());
				ses.setAttribute("Hint", strbld.toString());
				if(strbld.toString().equals(answer)) {
					request.getRequestDispatcher("won.html").forward(request, response);
				}
				else {
					request.getRequestDispatcher("game.jsp").forward(request, response);
				}
			}
			else {
				int life =  (int) ses.getAttribute("Life");
				life = life - 1;
				ses.setAttribute("Life", life);
				if(life >= 0) {
				request.setAttribute("Life", life);
				request.getRequestDispatcher("game.jsp").forward(request, response);				}else {
					request.getRequestDispatcher("lost.html").forward(request, response);				}
				}
		}
		
		
		
		
//		response.sendRedirect("game.jsp");
	}


}
