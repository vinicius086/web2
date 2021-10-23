package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class weekToMonth
 */
@WebServlet("/weekToMonth")
public class weekToMonth extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		int tab1=Integer.parseInt(request.getParameter("tab1"));
		int tab2=Integer.parseInt(request.getParameter("tab2"));
		int aux;
		if (tab1>tab2)
		{
			aux=tab1;
			tab1=tab2;
			tab2=aux;
		}
		try (PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet CalcularTabuadaComDoisNumeros</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Servlet CalcularTabuadaComDoisNumeros2 at: " + request.getContextPath() + "</h1>");
			while(tab1<=tab2) {
				out.println("=========================<br/>");
				out.println("Tabuada do número "+tab1+ "<br />");
				out.println("=========================<br/>");
				for(int i=0; i<=10; i++) {
					out.println(tab1 + " x "+i+" = "+tab1*i+"<br />");
				}
				tab1++;
			}
			out.println("</body>");
			out.println("</html>");
		}
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public weekToMonth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
		doGet(request, response);
	}

}