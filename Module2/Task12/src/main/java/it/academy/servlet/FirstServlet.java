package it.academy.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class FirstServlet extends HttpServlet {
    private static final long serialVersionUID =1L;
    int countOfVisiting = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        countOfVisiting++;
        ServletOutputStream out = response.getOutputStream();
        response.setContentType("image/jpeg");
        ImageIO.write(createImgFromString("You've visited this site :"+countOfVisiting + " times!"), "jpeg", out);
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    private BufferedImage createImgFromString (String str){
        BufferedImage image = new BufferedImage(800,50,BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();
        graphics.setFont(new Font("Serif", Font.ITALIC, 48));
        graphics.setColor(Color.GREEN);
        graphics.drawString(str,30,50);

        return image;
    }
}
