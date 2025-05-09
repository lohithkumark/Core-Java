package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/dry")

public class BookingApp extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String name = getInitParameter("name");

        String location = getInitParameter("location");

        String price = getInitParameter("price");

        int ticket_price = 0;
        if(price != null){
            ticket_price = Integer.parseInt(price);
        }
        String tickets  = getInitParameter("tickets");

        int ticket = 0;
        if(tickets != null){
            ticket = Integer.parseInt(tickets);
        }

        int totalAmount = ticket_price * ticket;

        servletResponse.setContentType("text/html");
        PrintWriter result = servletResponse.getWriter();
        result.println("<h1> Thanks for booking the movie</h1>");
        result.println("<h2>Your total amount is:</h2>" + totalAmount );

    }
}
