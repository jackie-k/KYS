<%@page import="poly.dto.AdminDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	AdminDTO aDTO = (AdminDTO)request.getAttribute("aDTO");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="/memberModifyProc.do">
	<input type="hidden" name="seq" value="<%=aDTO.getSeq()%>">
	<div style="text.align:left; font-size:2em">정보 수정</div>
	<table border="1">
		<col width="100px" />
		<col width="500px" />
		<tr>
			<td align="center">이름</td>
			<td><input type="text" name="title" maxlength="100" style="width:450px" value="<%=aDTO.getName() %>"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<textarea name="contents" style="width: 550px; height:400px"> <%=aDTO.getEmail() %></textarea>
			</td>
		</tr>
	<tr>
		<td align="center" colspan="2">
			<input type="submit" value="수정" />
		</td>
	</tr>
	
	</table>


</form>

</body>
</html>