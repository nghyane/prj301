package com.fptuni.prj301.demo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Random;

public class CalculatorServlet extends HttpServlet {
    private final Integer MAX_NUMBER = 100; 
    private final String CALCULATOR_PAGE = "calculator.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        request.getRequestDispatcher(CALCULATOR_PAGE).forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Random rand = new Random();

        int a = rand.nextInt(MAX_NUMBER);
        int b = rand.nextInt(MAX_NUMBER);

        request.setAttribute("a", a);
        request.setAttribute("b", b);
        request.setAttribute("result", "?");

        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("a", request.getParameter("a"));
        request.setAttribute("b", request.getParameter("b"));
        request.setAttribute("result", request.getParameter("result"));

        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
