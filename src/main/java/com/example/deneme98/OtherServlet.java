package com.example.deneme98;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
    @WebServlet(name = "otherServlet", value = "/other-servlet")
    public class OtherServlet extends HttpServlet {
        public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         if (request.getAttribute("error") == null){
             String name = (String)request.getAttribute("name");
             String lastName = (String)request.getAttribute(" last name");


             System.out.println(name + " " + lastName);



            }
        }
    }

