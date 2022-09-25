/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jerma
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

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
        
       request.setAttribute("result", "---");
       
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
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
        
        String firstNumString = request.getParameter("firstnum");
        String secondNumString = request.getParameter("secondnum");
        
        int firstNum = 0;
        int secondNum = 0;

        try {
            firstNum = Integer.parseInt(firstNumString);
            secondNum = Integer.parseInt(secondNumString);
            
        } catch (NumberFormatException e) {
            
            request.setAttribute("firstnum", firstNumString);
            request.setAttribute("secondnum", secondNumString);
            
            request.setAttribute("result", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            return;
        }
        
        request.setAttribute("firstnum", firstNum);
        request.setAttribute("secondnum", secondNum);
        
        String submit = request.getParameter("submit");
        int result = 0;
        switch(submit) {
            case"+": result = firstNum + secondNum; break;
            case"-": result = firstNum - secondNum; break;
            case"*": result = firstNum * secondNum; break;
            case"%": result = firstNum % secondNum; break;
            default: break;
        }
        
        request.setAttribute("result", result);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }
}
