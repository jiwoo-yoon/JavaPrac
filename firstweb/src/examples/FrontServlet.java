package examples;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontServlet
 */
@WebServlet("/front")
public class FrontServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  int diceValue = (int)(Math.random() * 6) + 1; 
          request.setAttribute("dice", diceValue); //request에다가 값을 달아놓는다.
          
          RequestDispatcher requestDispatehcer = request.getRequestDispatcher("/next");//같은내부에서만 동작하고, ""안에있는 페이지로 넘겨준다.
          requestDispatehcer.forward(request, response);//forward에선 req,res를 꼭 넘겨줘야한다.
	}

}
