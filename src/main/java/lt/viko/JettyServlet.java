package lt.viko;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class JettyServlet extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
        throws SecurityException, IOException{
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("{\"status\": \"ok\"}");
    }
}
