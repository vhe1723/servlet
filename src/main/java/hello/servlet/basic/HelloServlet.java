package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    //서블릿 요청과 응답
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("HelloServlet.service");     //soutm
        System.out.println("request = " + request);     //soutv
        System.out.println("response = " + response);   //soutv

        //http://localhost:8080/hello?username=kim
        //요청                          "쿼리파라미터"
        String username = request.getParameter("username");
        //실행결과 username=kim

        //응답
        response.setContentType("text/plain");      //헤더
        response.setCharacterEncoding("utf-8");     //인코딩정보 /헤더
        response.getWriter().write("hello " + username);

    }
}
