package com.suftz.demo.jenkins;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/3/3 22:06
 */
@WebServlet(name = "MyServlet",urlPatterns = "/mine")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("name","agile");
        req.setAttribute("email","agile@suftz.com");
        req.getRequestDispatcher("/WEB-INF/myinfo.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
