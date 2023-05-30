/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entities.Marque;
import facades.MarqueFacade;
import entities.Produit;
import facades.ProduitFacade;

/**
 *
 * @author hp
 */
public class CreationProduit extends HttpServlet {

    @EJB
    private ProduitFacade produitFacade;

    @EJB
    private MarqueFacade marqueFacade;
    
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CreationProduit</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CreationProduit at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<form action=\"\" method=\"post\">");
        response.getWriter().println("Référence du produit: <input type=\"text\" name=\"reference\"><br>");

        // Récupération de la liste des marques (à remplacer par votre logique d'accès aux marques)
        List<Marque> marques = marqueFacade.findAll();

        response.getWriter().println("Marque du produit: <select name=\"marque\">");
        response.getWriter().println("<option value=\"\">Toutes les marques</option>");
        marques.forEach( marque ->{
           try {
               response.getWriter().println("<option value=\"" + marque.getNom() + "\">" + marque.getNom() + "</option>");
           } catch (IOException ex) {
               Logger.getLogger(CreationProduit.class.getName()).log(Level.SEVERE, null, ex);
           }
        });
        response.getWriter().println("</select><br>");

        response.getWriter().println("Dénomination du produit: <input type=\"text\" name=\"denomination\"><br>");
        response.getWriter().println("Prix du produit: <input type=\"number\" name=\"prix\"><br>");
        response.getWriter().println("Poids du produit: <input type=\"number\" name=\"poids\"><br>");
        response.getWriter().println("Volume du produit: <input type=\"number\" name=\"volume\"><br>");
        response.getWriter().println("<input type=\"submit\" value=\"Créer\">");
        response.getWriter().println("</form>");
        response.getWriter().println("</body></html>");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                    
            String reference = request.getParameter("reference");
            String nomMarque = request.getParameter("marque");
            String denomination = request.getParameter("denomination");
            int prix = Integer.parseInt(request.getParameter("prix"));
            double poids = Double.parseDouble(request.getParameter("poids"));
            double volume = Double.parseDouble(request.getParameter("volume"));
            
            
            
            Marque marque = marqueFacade.getMarqueByName(nomMarque);
            Produit produit = new Produit(reference, marque, denomination, prix, poids, volume);
            boolean creationReussie = produitFacade.createProduit(produit);
            
 
            // Affichage du message de confirmation ou d'erreur
            response.setContentType("text/html");
            response.getWriter().println("<html><body>");
            if (creationReussie) {
                response.getWriter().println("Le produit a été créé avec succès.");
            } else {
                response.getWriter().println("Erreur lors de la création du produit.");
            }
            response.getWriter().println("</body></html>");

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
