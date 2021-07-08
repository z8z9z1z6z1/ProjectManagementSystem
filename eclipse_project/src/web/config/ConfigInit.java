package web.config;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class ConfigInit
 */
@WebServlet(urlPatterns = "/ConfigInit",loadOnStartup = 1)
public class ConfigInit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("啟動");
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

}
