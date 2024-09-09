import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/Login")
public class login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");

        LoginDao dao = new LoginDao();

        try {
            if(dao.check(uname, pass))
            {
                HttpSession session = request.getSession();
                session.setAttribute("uname", uname);
                response.sendRedirect("welcome.jsp");
            }
            else
            {
                response.sendRedirect("login.jsp");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
