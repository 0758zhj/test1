package threeblog.servlet;
import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import threeblog.entity.User;
import threeblog.service.Service;

/**
 * Servlet implementation class register
 * ע��
 */
@WebServlet("/search")
public class Search {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		String username="";
		String password="";
		String phonenum="";
	
		
		
		phonenum=request.getParameter("phonenum");
		username=request.getParameter("username");
		System.out.println("�ֻ���:"+username);
		password=request.getParameter("pass1");

		
		User user=new User();
		user.setUsername(username);
		user.setPhonenum(phonenum);
		user.setPassword(password);
		Date now =new Date();
		java.sql.Date register_time=new java.sql.Date(now.getTime());
		user.setRegister_time(register_time);
		
		Service service=new Service();
		int flag=service.regeditUser(user);
		if(flag==1){
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().print("<script>alert(`ע����ɣ����Զ����ص�¼ҳ�棡`)</script>");
			String   content=3+ ";URL= "+"../jsp/login/sign_in.jsp"; 
			response.setHeader( "REFRESH ",content);
		}else{
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().print("<script>alert(`δ֪���������ԣ�`)</script>");
			String   content=3+ ";URL= "+"../jsp/login/register.jsp"; 
			response.setHeader( "REFRESH ",content);
		}
		
	}

}
