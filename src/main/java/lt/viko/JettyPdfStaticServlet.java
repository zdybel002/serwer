package lt.viko;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class JettyPdfStaticServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

        String pdfFileName = "countries.pdf";

        File pdfFile = new File(pdfFileName);
        response.setContentType("application/pdf");

        response.addHeader("Content-Disposition", "inline: filename= " + pdfFileName);
        response.setContentLength((int) pdfFile.length());

        FileInputStream fileInputStream = new FileInputStream(pdfFileName);
        OutputStream responseOutputStream = response.getOutputStream();
        int bytes;

        while ((bytes = fileInputStream.read()) != -1 ) {
            responseOutputStream.write(bytes);

        }
    }
}
