package threeblog.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import threeblog.service.*;


/**
 * Servlet implementation class zhucheguoma
 * ajax����ֻ����Ƿ�ע���
 */
@WebServlet("/zhucheguoma")
public class Zhucheguoma extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Zhucheguoma() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		System.out.println("zhucheguoma");
		request.setCharacterEncoding("utf-8");
		String result="";
		String username=request.getParameter("phone");
		Service service=new Service();
		response.setCharacterEncoding("utf-8");
		if(service.valiateUserName(username)){
			 result="{'bol':false}";
		}
        else{  
        	result="{'bol':true}";
        }
		response.setContentType("test/html");  
        response.setCharacterEncoding("UTF-8");  
        response.getWriter().print(result); 
		
	}

}
