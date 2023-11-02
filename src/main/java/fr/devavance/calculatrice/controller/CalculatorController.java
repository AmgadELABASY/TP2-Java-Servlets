package fr.devavance.calculatrice.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import fr.devavance.calculatrice.metiers.Calculator;
import java.lang.RuntimeException;


@WebServlet(name="CalculatorController",urlPatterns= {"/calculate"})
public class CalculatorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CalculatorController() {
        super();
        
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		String operation = request.getParameter("operation");
		String operande1 = request.getParameter("operande1");
		String operande2 = request.getParameter("operande2");
				
		double resultat = 0;
		
		if(operation.equals("add")) {
			resultat= Calculator.add(operande1, operande2);
		}
		
		
		if(operation.equals("sous")) {
			resultat= Calculator.soustraction(operande1, operande2);
			
		}
		if(operation.equals("mult")) {
			resultat= Calculator.multiplication(operande1, operande2);
			
		}
		if(operation.equals("div")) {
			resultat= Calculator.multiplication(operande1, operande2);
			
			
		}
		String res = Double.toString(resultat);
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<!DOCTYPE html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Calculatrice</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>valeur de l'opérande 1 : "+operande1+"</p>");
		out.println("<p>valeur de l'opérande 2 : "+operande2+"</p>");
		out.println("<p>Opération demandés : "+operation+"</p>");
		out.println("<p>Résultat : "+res+"</p>");
		out.println("</body></html>");
		
		*/
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculate.jsp").forward(request, response);

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String operation = request.getParameter("operation");
		String operande1 = request.getParameter("operande1");
		String operande2 = request.getParameter("operande2");
		
		double resultat = 0.0;
		
		if(operation.equals("addition")) {
			resultat = Calculator.add(operande1, operande2);
		}
		
		
		if(operation.equals("soustraction")) {
			resultat = Calculator.soustraction(operande1, operande2);
		}
		if(operation.equals("multiplication")) {
			resultat = Calculator.multiplication(operande1, operande2);
		}
		if(operation.equals("division")) {
			resultat = Calculator.division(operande1, operande2);
		}
		String res = Double.toString(resultat);
		
		request.setAttribute("res", res);
		request.setAttribute("operation", operation);
		request.setAttribute("operande1", operande1);
		request.setAttribute("operande2", operande2);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/resultat.jsp").forward(request, response);	
	}

}
