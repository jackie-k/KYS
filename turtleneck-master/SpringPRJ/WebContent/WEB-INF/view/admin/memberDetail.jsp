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

<form method="post" action="/memberModify.do">
	<input type="hidden" name="seq" value="<%=aDTO.getSeq()%>">
	<table border="1">
		<col width="100px" />
		<col width="500px" />
		<tr>
			<td align="center">이름</td>
			<td><input type="text" readonly="readonly" name="name" maxlength="100" style="width: 450px" value="<%=aDTO.getName() %>"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<textarea readonly="readonly" name="details" style="width: 550px; height: 400px"><%=aDTO.getContent() %></textarea>
			</td>
		</tr>
	<tr>
		<td align="center" colspan="2">
			<input type="submit" value="수정" />
			<input type="button" onclick="location.href='/memberDelete.do?seq=<%=aDTO.getSeq() %>'" value="삭제" />
			<input type="button" onclick="location.href='/memberList.do'" value="돌아가기" />
		</td>
	</tr>					
		
	</table>

</form>

</body>
</html>