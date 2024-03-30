package org.example.servlets;


import org.example.model.PlayerNew;
import org.example.model.PlayerService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/player.do")
public class PlayerServlet extends HttpServlet {

    PlayerService service = new PlayerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        request.getRequestDispatcher("/WEB-INF/views/main-menu.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String playerName = request.getParameter("name");

        PlayerNew player = service.getPlayerByName(playerName);

        request.setAttribute("name", playerName);
        request.setAttribute("country", player.getNationality());
        request.setAttribute("dob", player.getBirthDate());
        request.setAttribute("titles", player.getTitles());
        request.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(request, response);
    }
}