package threeblog.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import threeblog.entity.Article;
import threeblog.entity.Collect;
import threeblog.service.Service;

/**
 * Servlet implementation class DeleteCollect
 */
@WebServlet("/DeleteCollect")
public class DeleteCollect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCollect() {
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
		int collect_id=Integer.valueOf(request.getParameter("collect_id"));
		Service service=new Service();
		Collect collect=service.getCollectFromId(collect_id);
		Article article=service.getArticleFromId(collect.getArticle_id());
		int newCollected=article.getCollected();
		newCollected--;
		article.setCollected(newCollected);
		service.updateArticleCollected(article);
		service.deleteCollectRecord(collect_id);
	}

}
