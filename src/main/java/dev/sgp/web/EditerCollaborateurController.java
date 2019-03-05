package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String matricule = req.getParameter("matricule");
		resp.setContentType("text/html");
		
		if(matricule==null){
			resp.sendError(400, "Un matricule est attendu");
		}else{
			resp.getWriter().write("<h1>Edition de collaborateur</h1>"
					+ "<ul>"
					+ "<li>Matricule="+ matricule + "</li>"
					+ "</ul>");
		}
		
		
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		
		String paramNull = "";
		
		if(matricule == null){
			paramNull += "matricule ";
		}
		
		if(titre == null){
			paramNull += "titre ";
		}
		
		if(nom == null){
			paramNull += "nom ";			
		}
		
		if(prenom == null){
			paramNull += "prenom ";	
		}
		
		if(!paramNull.equals("")){
			resp.sendError(400, "Les paramètres suivants sont incorrects : "+paramNull);			
		}else{
			resp.setStatus(201);
			resp.setContentType("text/html");
			resp.getWriter().write("Création d'un collaborateur avec les informations suivantes"
					+ "\n matricule="+matricule+", titre="+titre+", nom="+nom+", prénom="+prenom+".");
			
		}
		
		
	}
}
