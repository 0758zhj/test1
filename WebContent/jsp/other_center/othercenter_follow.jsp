<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ListIterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="threeblog.entity.*" %>
<%@ page import="threeblog.service.Service" %>
<%
	Service service = new Service();
	int other_id=Integer.valueOf(request.getParameter("id"));
	ArrayList<Follow> follows = service.getFollowFromFollowing_id(other_id);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Ta的关注</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css" type="text/css"/>
</head>

<body>
	<!--中间栏begin-->
        <div id="othercenter_body">
        	<div id="othercenter_info">
        		<h1 style=" font-size:24px; width:960px; margin-left:40px;">█ Ta的关注</h1>
            	<table class="zebra">
    <thead>
    <tr>
        <th >#</th>        
        <th>用户名</th>
        <th>关注时间</th>
        <th>操作</th>

    </tr>
    </thead>
    <tfoot>
    <tr>
        <td>&nbsp;</td>        
        <td></td>
        <td></td>
        <td></td>
    </tr>
    </tfoot>    
    <tbody>
    <%
    if(!follows.isEmpty()){
    	for(int i=0;i<follows.size();i++){
    		Follow follow=follows.get(i);
    		User follower=service.getUserFromId(follow.getFollower_id());
    %>
    <tr>

        <td><%=i+1 %></td>        
        <td><%=follower.getUsername() %></td>
        <td><%=follow.getFollow_date() %></td>
        <td><a href="${pageContext.request.contextPath}/jsp/other_center/otherscenter.jsp?id=<%=follow.getFollower_id()%>" target="_blank"><img  id="eye<%=i%>" src="${pageContext.request.contextPath}/image/eye.png"  style="width:40px; height:40px;"></a>
        <!--查看图标更换的jq-->
<script>
$('#eye<%=i%>').click(function(){  
          
        if($('#eye<%=i%>').attr('src')=='image/eye.png'){  
            $('#eye<%=i%>').attr('src','image/eyes.png');  
        }
          
});  
</script>
        </td>
    </tr>  
          <%}} %>
   
</tbody></table>
            	
            </div>
        </div>
        <!--中间栏end-->
</body>
</html>
