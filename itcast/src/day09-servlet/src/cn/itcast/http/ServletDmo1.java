package cn.itcast.http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 和location和302一起完成重定向
 * @author Administrator
 *
 */
public class ServletDmo1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 向页面输出内容
		response.setContentType("text/html;charset=UTF-8");
		// response.getWriter().write("向班长借钱...");
		// 我没钱
		response.setStatus(302);
		// 告诉我富班长的地址
		response.setHeader("location", "/day09/1.html");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
