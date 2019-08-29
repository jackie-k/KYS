package poly.util;

import java.util.HashMap;

public class Email {

    private String subject;
    private String content;
    private String regdate;
    private String reciver;

    public String getReciver() {
        return reciver;
    }
    public void setReciver(String reciver) {
        this.reciver = reciver;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getRegdate() {
        return regdate;
    }
    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }
    public String setContents(HashMap<String, Object> hMap){
    	String contents = "";
    	contents += "<html>";
    	contents += "<title>";
    	contents += "</title>";
    	contents += "<body>";
		contents += "<table width='696' align='center' border='0' cellspacing='0' cellpadding='0'>";
		contents += "<tr>";
		contents += "<td height='20' style='color: rgb(77, 77, 77); line-height: 14px; font-size: 12px;></td>";
		contents += "</tr>";
		contents += "<tr>";
		contents += "<td style='color: rgb(77, 77, 77); line-height: 14px; font-size: 12px;><img src=''></td>";
		contents += "</tr>";
		contents += "<tr>";
		contents += "<td height='2' style='color: rgb(77, 77, 77); line-height: 14px; font-size: 12px;></td>";
		contents += "</tr>";
		contents += "<tr>";
		contents += "<td height='20' style='color: rgb(77, 77, 77); line-height: 14px; font-size: 12px;' bgcolor='#000000'></td>";
		contents += "</tr>";
		contents += "<tr>";
		contents += "<td height='20' style='color: rgb(77, 77, 77); line-height: 14px; font-size: 12px;></td>";
		contents += "</tr>";
		contents += "<tr>";
		contents += "<td height='35' style='color: rgb(77, 77, 77); line-height: 14px; font-size: 12px;'></td>";
		contents += "</tr>";
		contents += "<tr>";
		contents += "<td class='texts' style='color: rgb(97, 106, 116); line-height: 22px; padding-left: 10px; font-family: 돋움, Dotum; font-size: 12px;'><b>임시비밀번호 :</b>"+hMap.get("tmpPass").toString()+"</td>";
		contents += "</tr>";
		contents += "<tr>";
		contents += "<td height='30' style='color: rgb(77, 77, 77); line-height: 14px; font-size: 12px;'></td>";
		contents += "</tr>";
		contents += "<tr>";
		contents += "<td height='80' style='color: rgb(77, 77, 77); line-height: 14px; font-size: 12px;'></td>";
		contents += "</tr>";
		contents += "<tr>";
		contents += "<td height='2' style='color: rgb(77, 77, 77); line-height: 14px; font-size: 12px;></td>";
		contents += "</tr>";
		contents += "<tr>";
		contents += "<td height='20' style='color: rgb(77, 77, 77); line-height: 14px; font-size: 12px;' bgcolor='#000000'></td>";
		contents += "</tr>";
		contents += "<table>";
    	contents += "</body>";
    	contents += "</html>";
    	return contents;
    };
     
}