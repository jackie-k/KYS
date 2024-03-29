<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userName=(String)session.getAttribute("userName");
	String userEmail=(String)session.getAttribute("userEmail");
	String userPhone=(String)session.getAttribute("userPhone");
	String userQuestion=(String)session.getAttribute("userQuestion");
	String userAnswer=(String)session.getAttribute("userAnswer");
	String userGender=(String)session.getAttribute("userGender");
	String userBirth=(String)session.getAttribute("userBirth");
%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>회원정보 상세</title>

  <!-- Custom fonts for this template-->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
  
  <!-- Custom styles for this template-->
  <link href="css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body id="page-top" class="sidebar-toggled">

  <!-- Page Wrapper -->
  <div id="wrapper">

    <!-- 사이드 바 -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion toggled" id="accordionSidebar">

     <!-- 사이드바-마이페이지 -->
      <li class="nav-item active">
      
			 <div class="rotate-n-15" style="font-size: 2rem!important;">
          		<a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#mypage" aria-expanded="true" aria-controls="collapsePages">
          		<i class="fas fa-piggy-bank"></i>
        		
              </a>
              </div>
              <div id="mypage" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
          		<div class="bg-white py-2 collapse-inner rounded">
                <a class="dropdown-item" href="mpa1.do">
                  <i class="fas fa-user-check fa-fw mr-2 text-gray-400"style="color: blue!important;"></i>
                  	회원정보 상세
                </a>
                <a class="dropdown-item" href="mpb1.do">
                  <i class="fas fa-user-edit fa-fw mr-2 text-gray-400"></i>
                  	회원정보 수정
                </a>
                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#deleteModal">
                  <i class="fas fa-user-times fa-fw mr-2 text-gray-400"></i>
                  	회원 탈퇴
                </a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                  <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                  	로그아웃
                </a>
              </div>
              </div>
            </li>
      

      <!-- 사이드바 - 메인화면 -->
      <li class="nav-item active">
        <a class="nav-link" href="mainA.do">
          3S
          <span>메인 화면</span></a>
		 <hr class="sidebar-divider" /> 
      </li>

      <!-- 사이드바 -챗봇 -->
      <li class="nav-item">
      <div class="sidebar-heading">
      Chat Bot
      </div>
        <a class="nav-link" href="">
          <i class="far fa-comments"></i>
          <span>챗봇</span>
        </a>
         <hr class="sidebar-divider">
      </li>

      
      

      <!-- 사이드바-입출금 내역 -->
      <li class="nav-item">
      <div class="sidebar-heading">
        Deposit &amp; withdrawal
      </div>
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages" aria-expanded="true" aria-controls="collapsePages">
          <i class="fas fa-dollar-sign"></i>
          <span>입출금 내역</span>
        </a>
        <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <h3 class="collapse-header">●</h3>
            <a class="collapse-item" href="">계좌 추가</a>
            <a class="collapse-item" href="">계좌 수정</a>
            <a class="collapse-item" href="">계좌 삭제</a>
            <a class="collapse-item" href="">계좌 조회</a>
            
          </div>
        </div>
        <hr class="sidebar-divider">
      </li>
		
		
	  
		
      <!-- 사이드바 - 가계부 -->
      <li class="nav-item">
      <div class="sidebar-heading">
        account book
      </div>
        <a class="nav-link" href="">
          <i class="far fa-calendar-alt"></i>
          <span>가계부<br/>(날짜 별)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="">
          <i class="fas fa-fw fa-table"></i>
          <span>가계부<br/>(카테고리 별)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#recent" aria-expanded="true" aria-controls="collapsePages">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>최근 날짜순</span>
        </a>
        <div id="recent" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <h3 class="collapse-header">●</h3>
            <a class="collapse-item" href="">소득 내역</a>
            <a class="collapse-item" href="">소비 내역</a>
           
          </div>
        </div>
        
      </li>
      
      

      
      
	<!-- 상단바 -->
    </ul>
    <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

        <!-- Topbar -->

          <!-- Sidebar Toggle (Topbar) -->
          <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
            <i class="fa fa-bars"style="width: 2.75rem;height: 2.75rem;color: white;background: #4e73df;line-height: 46px;border-radius: 100px;margin-bottom:1rem;"></i>
          </button>

        <!--컨텐츠 -->

        <div class="container-fluid">
			<div style="font-size: 2rem; font-weight: bold;">회원정보 상세</div>
			<div class="col-sm-6 mb-3 mb-sm-0" style="margin-top: 15%;">
			<div class="form-group" 
					style="margin-left: 10%;margin-bottom: 3%;">
                		이름
                </div>
			<div class="form-group">
                	<input type="text" class="form-control form-control-user" id="name" name="userName" placeholder="<%=userName%>" readonly
                			style="font-size:.8rem;border-radius: 10rem;padding: 1.5rem 1rem;">
                </div>
                <div class="form-group" 
					style="margin-left: 10%;margin-bottom: 3%;">
                		휴대폰 번호
                </div>
                <div class="form-group">
                	<input type="text" class="form-control form-control-user pch" id="phone" name="userPhone" placeholder="<%=userPhone%>" readonly
                			style="font-size:.8rem;border-radius: 10rem;padding: 1.5rem 1rem;">
                </div>
                <div class="form-group" 
					style="margin-left: 10%;margin-bottom: 3%;">
                		이메일 주소
                </div>
                <div class="form-group">
                  <input type="text" class="form-control form-control-user" id="email" name="userEmail" placeholder="<%=userEmail%>" readonly
                  			style="font-size:.8rem;border-radius: 10rem;padding: 1.5rem 1rem;">
                </div>
          
                <div class="form-group" 
					style="margin-left: 10%;margin-bottom: 3%;">
                		생년월일
                </div>
                <div class="form-group">
                	<input type="date" class="form-control form-control-user" id="birth" name="userBirth" value="<%=userBirth%>"readonly
                			style="font-size:.8rem;border-radius: 10rem;padding: 1.5rem 1rem;">
                </div>
                	<div style="display:flex">
                	<div class="form-group" 
					style="margin-left: 15%;margin-top: 8%;">
                		성별
                </div>
               		<input type="text" class="form-control form-control-user" id="" name="userGender" placeholder="<%=userGender%>" readonly
                    		style="text-align:center; width:40%;font-size:.8rem;border-radius: 10rem;padding: 1.5rem 1rem;margin-bottom:7%;margin-left:25%">
               		</div>
             
               
                <div class="form-group" 
					style="margin-left: 10%;margin-bottom: 3%;">
                		비밀번호 찾기 문제
                </div>
                  
                    <input type="text" class="form-control form-control-user" id="pwq" name="userQuestion" placeholder="<%=userQuestion %>" readonly
                    		style="font-size:.8rem;border-radius: 10rem;padding: 1.5rem 1rem;">
            
                  <div class="form-group" 
					style="margin-left: 10%;margin-bottom: 3%;">
                		비밀번호 찾기 답
                </div>
                  
                    <input type="text" class="form-control form-control-user" id="pwa" name="userAnswer" placeholder="<%=userAnswer%>" readonly
                    		style="font-size:.8rem;border-radius: 10rem;padding: 1.5rem 1rem;">
                
              </div>
			
			
        </div>
        <!-- /.container-fluid -->

      </div>
      <!-- End of Main Content -->

      <!-- Footer -->
      <footer class="sticky-footer bg-white">
        <div class="container my-auto">
          <div class="copyright text-center my-auto">
            <span>Copyright &copy; Your Website 2019</span>
          </div>
        </div>
      </footer>

    </div>

  </div>

  <!--위로가는 버튼 -->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!--로그아웃 창-->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">로그아웃을 하시겠습니까?</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">"로그아웃" 버튼을 누르셨습니다. 로그아웃을 하시려면 로그아웃 버튼을 눌러주세요.</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">취소</button>
          <button class="btn btn-primary" type="button" onclick="location.href='/logout.do'">로그아웃</button>
        </div>
      </div>
    </div>
  </div>

 <!--회원 탈퇴 창-->
  <div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">회원탈퇴를 하시겠습니까?</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">"회원탈퇴" 버튼을 누르셨습니다. 회원탈퇴를 하시려면 회원탈퇴 버튼을 눌러주세요.</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">취소</button>
          <button class="btn btn-primary" type="button" onclick="location.href='/userDelete.do'">회원탈퇴</button>
        </div>
      </div>
    </div>
  </div>
  <!-- Bootstrap core JavaScript-->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="js/sb-admin-2.min.js"></script>



</body>

</html>
