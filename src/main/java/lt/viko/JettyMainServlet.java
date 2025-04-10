package lt.viko;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.swing.text.html.HTML;
import java.io.IOException;
import java.io.PrintWriter;

public class JettyMainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {


        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        // Generowanie strony HTML z linkiem
        out.println("<html><body>");
        out.println("<h1>Welcome to the PDF Generator</h1>");
        out.println("<a href='/pdf/static'>Test PDF</a>");
        out.println("</body></html>");
    }
}
