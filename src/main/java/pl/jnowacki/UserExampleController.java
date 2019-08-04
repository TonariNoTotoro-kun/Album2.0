package pl.jnowacki;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userServlet")
public class UserExampleController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().setAttribute("userNameSessionName", "myServletName");

        getServletContext().getRequestDispatcher("/user.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("name");
        String password = request.getParameter("password");

        if (userName == null || userName.isEmpty()) {
            userName = "initialName";
        }
        if (password == null || password.isEmpty()) {
            password = "initialPassword";
        }

        request.getSession().setAttribute("userNameSessionName", userName);
        request.getSession().setAttribute("userPasswordSessionName", password);

        getServletContext().getRequestDispatcher("/user.jsp").forward(request, response);
    }
}
