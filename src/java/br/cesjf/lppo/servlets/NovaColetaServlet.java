/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lppo.servlets;

import br.cesjf.lppo.classes.Coleta;
import br.cesjf.lppo.dao.ClasseDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RafaelaEmília
 */
@WebServlet(name = "NovaColetaServlet", urlPatterns = {"/NovaColetaServlet"})
public class NovaColetaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/nova-coleta.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Coleta coleta = new Coleta();
        coleta.setDescricao(request.getParameter("descricao"));
        
        
        try{
            ClasseDAO dao = new ClasseDAO();
            dao.cria(coleta);
        } catch(Exception ex){
            System.err.println(ex);
            request.setAttribute("mensagem", ex);
            request.getRequestDispatcher("WEB-INF/nova-coleta.jsp").forward(request, response);
            return;
        }
        response.sendRedirect("lista-coletas.html");
        
    }
}
