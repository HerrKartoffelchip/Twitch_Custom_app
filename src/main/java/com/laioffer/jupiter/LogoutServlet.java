package com.laioffer.jupiter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LogoutServlet", value = "/logout")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Destroy the session since the user is logged out.
        // param false: 有就有，没有就没有
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        // ask browser clear cookie?? not necessary
    }
}
