<%@page import="java.util.List"%>
<%@page import="poly.dto.AdminDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	List<AdminDTO> mList = (List<AdminDTO>)request.getAttribute("mList");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
</head>
<body>

<div style="width:800px; margin-left:5%; margin-top:5%">
	<div style="text-align:center; font-size:2em">
		게시판
	</div>
	<table class="table table-striped">
		<thead>
			<tr>
				<th width="100px">회원 번호</th>
				<th width="500px">회원 이름</th>
				<th width="200px">날짜</th>
			</tr>
		</thead>
		<tbody>
		<%for(AdminDTO aDTO : mList){ %>
			<tr>
				<td><%=aDTO.getSeq() %></td>
				<td><a href="/memberDetail.do?seq=<%=aDTO.getSeq() %>"><%=aDTO.getName() %></a></td>
				<td><%=aDTO.getRegDate() %></td>
			</tr>
			<%} %>
		</tbody>
	</table>
	<hr/>
</div>
   
</body>
</html>