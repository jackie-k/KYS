/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2019-08-06 07:32:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userReg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("  <meta name=\"description\" content=\"\">\r\n");
      out.write("  <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("  <title>회원 가입 페이지</title>\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom fonts for this template-->\r\n");
      out.write("  <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom styles for this template-->\r\n");
      out.write("  <link href=\"css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function pwCheck(){\r\n");
      out.write("\tvar pw = $(\"#pw\").val();\r\n");
      out.write("\tvar pwc = $(\"#pwc\").val();\r\n");
      out.write("\tconsole.log(pw);\r\n");
      out.write("\tconsole.log(pwc);\r\n");
      out.write("\tvar contents = \"\"\r\n");
      out.write("\tif(pw == pwc) {\r\n");
      out.write("\t\tcontents += \"<div class='alert alert-success'>일치합니다.</div>\";\r\n");
      out.write("\t\t$('#showPwCheck').html(contents);\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\tcontents += \"<div class='alert alert-danger'>일치하지 않습니다.</div>\";\r\n");
      out.write("\t\t$('#showPwCheck').html(contents);\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"bg-gradient-primary\">\r\n");
      out.write("\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"card o-hidden border-0 shadow-lg my-5\">\r\n");
      out.write("      <div class=\"card-body p-0\">\r\n");
      out.write("        <!-- Nested Row within Card Body -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-lg-5 d-none d-lg-block bg-register-image\"></div>\r\n");
      out.write("          <div class=\"col-lg-7\">\r\n");
      out.write("            <div class=\"p-5\">\r\n");
      out.write("              <div class=\"text-center\">\r\n");
      out.write("                <h1 class=\"h4 text-gray-900 mb-4\">회원가입</h1>\r\n");
      out.write("              </div>\r\n");
      out.write("              <form id=\"userReg\" action=\"/userRegProc.do\" method=\"POST\" class=\"user\">\r\n");
      out.write("              \t<div class=\"form-group\">\r\n");
      out.write("                \t<input type=\"text\" class=\"form-control form-control-user\" id=\"name\" name=\"userName\" placeholder=\"이름\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                \t<input type=\"text\" class=\"form-control form-control-user\" id=\"phone\" name=\"userPhone\" placeholder=\"휴대폰 번호\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                \t<input type=\"button\" class=\"btn btn-primary btn-user btn-block\" id=\"pCheck\" value=\"휴대폰 번호 중복확인\">\r\n");
      out.write("                \t<input type=\"hidden\" id=\"conf\" value=\"0\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <input type=\"text\" class=\"form-control form-control-user\" id=\"email\" name=\"userEmail\" placeholder=\"이메일 주소\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                \t<input type=\"button\" class=\"btn btn-primary btn-user btn-block\" id=\"eCheck\" value=\"이메일 중복확인\">\r\n");
      out.write("                \t<input type=\"hidden\" id=\"conf1\" value=\"0\">\t\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                <input type=\"hidden\" class='alert alert-success' id=\"showreq\" value=\"인증번호 요청\" style=\"text-align: center;width:100%\" >\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                \t<input type=\"text\" class=\"form-control form-control-user\" id=\"ib\" name=\"\" placeholder=\"인증번호 6자리 입력\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                \t<input type=\"button\" class=\"btn btn-primary btn-user btn-block\" id=\"\" value=\"인증번호 확인\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\" style=\"text-align: center;\">\r\n");
      out.write("                \t\t생년월일\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                \t<input type=\"date\" class=\"form-control form-control-user\" id=\"birth\" name=\"userBirth\">\r\n");
      out.write("                </div>\r\n");
      out.write("                \t<div style=\"display:flex\">\r\n");
      out.write("                \t\r\n");
      out.write("               \t\t<select class=\"form-control\" id=\"sel1\" name=userGender style=\"width:50%;margin-left: 25%;margin-bottom:7%\">\r\n");
      out.write("               \t\t\t<option value=\"nocheck\" selected>성별</option>\r\n");
      out.write("               \t\t\t<option value=\"남\">남</option>\r\n");
      out.write("               \t\t\t<option value=\"여\">여</option>\r\n");
      out.write("               \t\t</select>\r\n");
      out.write("               \t\t</div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                  <div class=\"col-sm-6 mb-3 mb-sm-0\">\r\n");
      out.write("                    <input type=\"password\" class=\"form-control form-control-user\" id=\"pw\" name=\"userPassword\" placeholder=\"비밀번호\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-sm-6\">\r\n");
      out.write("                    <input type=\"password\" class=\"form-control form-control-user\" id=\"pwc\" placeholder=\"비밀번호 확인\" onkeyup=\"pwCheck()\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"showPwCheck\" style=\"text-align: center;\"></div>\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                  <div class=\"col-sm-6 mb-3 mb-sm-0\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control form-control-user\" id=\"pwq\" name=\"userQuestion\" placeholder=\"비밀번호 찾기 문제\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-sm-6\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control form-control-user\" id=\"pwa\" name=\"userAnswer\" placeholder=\"비밀번호 찾기 답\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              \t\r\n");
      out.write("                <!-- <hr>\r\n");
      out.write("                <a href=\"index.html\" class=\"btn btn-google btn-user btn-block\">\r\n");
      out.write("                  <i class=\"fab fa-google fa-fw\"></i> Register with Google\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"index.html\" class=\"btn btn-facebook btn-user btn-block\">\r\n");
      out.write("                  <i class=\"fab fa-facebook-f fa-fw\"></i> Register with Facebook\r\n");
      out.write("                </a> -->\r\n");
      out.write("                <button id=\"uhs\" class=\"btn btn-primary btn-user btn-block\">회원가입하기 </button>\r\n");
      out.write("              </form>\r\n");
      out.write("              \r\n");
      out.write("              <hr>\r\n");
      out.write("              <div class=\"text-center\">\r\n");
      out.write("                <a class=\"small\" href=\"forgetE.do\">아이디/비밀번호를 잊어버리셨습니까?</a>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"text-center\">\r\n");
      out.write("                <a href=\"index.do\" class=\"small\" >이미 계정이 있으신가요? 로그인!</a>\r\n");
      out.write("              </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  \r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Bootstrap core JavaScript-->\r\n");
      out.write("  <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Core plugin JavaScript-->\r\n");
      out.write("  <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom scripts for all pages-->\r\n");
      out.write("  <script src=\"js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\tvar pCheck=0;\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#pCheck\").click(function(){\r\n");
      out.write("\t\t\tvar phone=$(\"#phone\").val();\r\n");
      out.write("\t\t\tvar re1=/^[0-9]{10,11}$/\r\n");
      out.write("\t\t\tconsole.log(phone);\r\n");
      out.write("\t\t\tif(phone==\"\"){\r\n");
      out.write("\t\t\t\talert(\"휴대폰 번호를 입력해 주세요.\");\r\n");
      out.write("\t\t\t\t$(\"#phone\").focus();\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl : \"/pCheck.do\",\r\n");
      out.write("\t\t\t\ttype : 'POST',\r\n");
      out.write("\t\t\t\tdata : {'phone':phone},\r\n");
      out.write("\t\t\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t\t\tconsole.log(data);\r\n");
      out.write("\t\t\t\t\tif(!re1.test(phone)) {\r\n");
      out.write("\t\t\t\t\t\talert(\"휴대폰 번호 형식을 확인해주세요.\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#phone\").focus();\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tif(data == 0){\r\n");
      out.write("\t\t\t\t\t\t\talert(\"사용 가능한 휴대폰 번호 입니다.\");\r\n");
      out.write("\t\t\t\t\t\t\t$('#conf').val(\"1\");\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#email\").focus();\r\n");
      out.write("\t\t\t\t\t\t\tpCheck=1;\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\talert(\"이미 사용중인 휴대폰 번호 입니다.\");\r\n");
      out.write("\t\t\t\t\t\t\t$('#conf').val(\"0\");\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#phone\").focus();\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\terror : function(error){\r\n");
      out.write("\t\t\t\t\t\talert(\"error : \" + error);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t}});\r\n");
      out.write("\t});\r\n");
      out.write("\tvar eCheck=0;\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#eCheck\").click(function(){\r\n");
      out.write("\t\t\tvar email=$(\"#email\").val();\r\n");
      out.write("\t\t\tvar eCheck=$(\"#eCheck\").val();\r\n");
      out.write("\t\t\tvar re2 =/^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tconsole.log(email);\r\n");
      out.write("\t\t\tif(email==\"\"){\r\n");
      out.write("\t\t\t\talert(\"이메일을 입력해 주세요.\");\r\n");
      out.write("\t\t\t\t$(\"#email\").focus();\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl : \"/eCheck.do\",\r\n");
      out.write("\t\t\t\ttype : 'POST',\r\n");
      out.write("\t\t\t\tdata : {'email':email},\r\n");
      out.write("\t\t\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t\t\tconsole.log(data);\r\n");
      out.write("\t\t\t\t\tif(!re2.test(email)) {\r\n");
      out.write("\t\t\t\t\t\talert(\"이메일 형식을 확인해주세요.\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#email\").focus();\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\tif(data == 0){\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"사용 가능한 이메일 입니다.\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#conf1').val(\"1\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#ib\").focus();\r\n");
      out.write("\t\t\t\t\t\t\t\tpCheck=1;\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#showreq').attr('type','button')\r\n");
      out.write("\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"이미 사용중인 이메일 입니다.\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#conf1').val(\"0\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#email\").focus();\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror : function(error){\r\n");
      out.write("\t\t\t\t\t\talert(\"error : \" + error);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t}});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$(\"#uhs\").click(function(){\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//$('#name')   value  // val()\r\n");
      out.write("\t\t\tvar  name = document.getElementById(\"name\");\r\n");
      out.write("\t\t\tvar  phone = document.getElementById(\"phone\");\r\n");
      out.write("\t\t\tvar  birth = document.getElementById(\"birth\");\t\t\t\r\n");
      out.write("\t\t\tvar  sel1 = $('#sel1 option:selected');\r\n");
      out.write("\t\t\tvar  email = document.getElementById(\"email\");\r\n");
      out.write("\t\t\tvar  pw = document.getElementById(\"pw\");\t\t\t\r\n");
      out.write("\t\t\tvar  pwc = document.getElementById(\"pwc\");\r\n");
      out.write("\t\t\tvar  pwq = document.getElementById(\"pwq\");\t\t\t\r\n");
      out.write("\t\t\tvar  pwa = document.getElementById(\"pwa\");\r\n");
      out.write("\t\t\tvar  conf= document.getElementById(\"conf\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t \tif(name.value==\"\"){\r\n");
      out.write("\t\t\t\talert(\"이름을 입력해 주세요.\")\r\n");
      out.write("\t\t\t\tname.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t \t\r\n");
      out.write("\t\t\tif(phone.value==\"\"){\r\n");
      out.write("\t\t\t\talert(\"휴대폰 번호를 입력해 주세요.\")\r\n");
      out.write("\t\t\t\tphone.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(email.value==\"\"){\r\n");
      out.write("\t\t\t\talert(\"이메일을 입력해 주세요.\")\r\n");
      out.write("\t\t\t\temail.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(birth.value==\"\"){\r\n");
      out.write("\t\t\t\talert(\"생년월일을 입력해 주세요.\")\r\n");
      out.write("\t\t\t\tbirth.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(sel1.val()===\"nocheck\"){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\talert(\"성별을 선택해 주세요.\")\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t if(pw.value==\"\"){\r\n");
      out.write("\t\t\t\talert(\"비밀번호를 입력해 주세요.\")\r\n");
      out.write("\t\t\t\tpw.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(pwc.value==\"\"){\r\n");
      out.write("\t\t\t\talert(\"비밀번호 확인을 입력해 주세요.\")\r\n");
      out.write("\t\t\t\tpwc.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(pwc.value!=pw.value){\r\n");
      out.write("\t\t\t\talert(\"비밀번호와 똑같이 입력해 주세요.\")\r\n");
      out.write("\t\t\t\tpwc.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(pwq.value==\"\"){\r\n");
      out.write("\t\t\t\talert(\"비밀번호 찾기 문제를 입력해 주세요.\")\r\n");
      out.write("\t\t\t\tpwq.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(pwa.value==\"\"){\r\n");
      out.write("\t\t\t\talert(\"비밀번호 찾기 답을 입력해 주세요.\")\r\n");
      out.write("\t\t\t\tpwa.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(conf.value==0){\r\n");
      out.write("\t\t\t\talert(\"휴대폰 중복확인을 해주세요.\")\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(conf1.value==0){\r\n");
      out.write("\t\t\t\talert(\"이메일 중복확인을 해주세요.\")\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$(\"#userReg\").submit()\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write(" /* function check(re, what, message) {\r\n");
      out.write("       if(re.test(what.value)) {\r\n");
      out.write("           return true;\r\n");
      out.write("       }else\r\n");
      out.write("       alert(message);\r\n");
      out.write("       what.focus();\r\n");
      out.write("       return false;\r\n");
      out.write("   } */\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
