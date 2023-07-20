package com.example.deneme98;
import model.Person;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PersonServlet2", value = "/person")
public class PersonServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        StringBuilder error = new StringBuilder();
        if (firstName == null) {
            error.append("A first name was not provided.");
        } else if (lastName == null) {
            error.append("A last name was not provided.");
        }
        if (error.length() > 0) {
            request.setAttribute("error", error.toString());
            request.setAttribute("person", new Person());
        } else {
            request.setAttribute("person", new model.Person(firstName, lastName));

        }

        getServletContext().getRequestDispatcher("/name.jsp").forward(request,response);
    }
}



