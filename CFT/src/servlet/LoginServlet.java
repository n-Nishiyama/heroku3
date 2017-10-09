package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Top")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// HttpSession session;
		// セッションがある場合top.htmlに飛ばす
		session = request.getSession(false);
		if (session != null) {
			response.sendRedirect("/CFT/html/top/top.html");
		}

		String id = request.getParameter("id");
		String pass = request.getParameter("pass");

		// response.sendError(HttpServletResponse.SC_OK);
		// String responseJson = "{\"id\" : "+id+",\"pass\":"+pass+"}";
		// response.setContentType("application/json;charset=UTF-8");
		// PrintWriter out = response.getWriter();
		// out.print(responseJson);

		// ログイン成功
		if (id.equals("idid") && pass.equals("passpass")) {
			session = request.getSession(true);
			response.sendRedirect("/CFT/html/top/top.html");

		} else {
			response.sendRedirect("/CFT/html/personalLogin/personalLogin.html");
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendError(HttpServletResponse.SC_NOT_FOUND);

		// session = request.getSession(false);
		// if(session != null){
		// response.sendRedirect("/CFT/html/top/top.html");
		// }

	}

}
