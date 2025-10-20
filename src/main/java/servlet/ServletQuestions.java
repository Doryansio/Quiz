package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Questions;

import java.io.IOException;

import Data.DataQuestions;

/**
 * Servlet implementation class ServletQuestions
 */
@WebServlet("/quiz")
public class ServletQuestions extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletQuestions() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Questions q = DataQuestions.getRandomQuestion();
		request.setAttribute("question", q);
		request.getRequestDispatcher("./quiz.jsp").forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int questionId = Integer.parseInt(request.getParameter("questionId"));
		String reponseUtilisateur= request.getParameter("reponse").trim();
		Questions q = DataQuestions.GetId(questionId);
		if(q == null) {
			response.getWriter().println("Erreur : question introuvable pour id =" + questionId);
		}
		boolean correct = q.GetResponse().equalsIgnoreCase(reponseUtilisateur);
		request.setAttribute("question", q);
		request.setAttribute("reponseUtilisateur", reponseUtilisateur);
		request.setAttribute("correct", correct);
		
	}

}
