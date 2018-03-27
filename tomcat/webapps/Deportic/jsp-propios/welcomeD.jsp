<%
String app = request.getParameter("application");
%>
<div class="social">
		<ul>
			<li><a href="#" target="_blank" class="icon-twitter"></a></li>
			<li><a href="#" target="_blank" class="icon-facebook"></a></li>
			<li><a href="#" target="_blank" class="icon-linkedin"></a></li>
			<li><a href="#" target="_blank" class="icon-youtube"></a></li>
			<li><a href="#" target="_blank" class="icon-mail"></a></li>

		</ul>
</div>
<div id="wrapper">
	<div id="menu">
		<ul>
			<li class="current_page_item"><a href="#">Home</a></li>
			<li><a href="#">Blog</a></li>
			<li><a href="#">Photos</a></li>
			<li><a href="#">About</a></li>
			<li><a href="#">Links</a></li>
			<li><a href="#">Contact</a></li>
		</ul>
	</div>
	<!-- end #menu -->
	<div id="header">
		<div id="logo">
			<h1><a href="#">  BIENVENIDOS A DEPORTIC  </a></h1>			
		</div>
	</div>
	<!-- end #header -->
	<div id="page">
	<div id="page-bgtop">
	<div id="page-bgbtm">
		<div id="content">
			<div class="post">
				<h2 class="title"><a href="#">ACA VA EL BANNER DE NOTICIAS   </a></h2>
				<div style="clear: both;">&nbsp;</div>
				<div class="entry">					
					<p class="links"><a href="#">Read More</a>&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">Comments</a></p>
				</div>
			</div>
			<div class="post">
				<h2 class="title"><a href="#">ACA VA EL TABLERO</a></h2>
				<div style="clear: both;">&nbsp;</div>
				<div class="entry">
				</div>
			</div>
			<div class="post">
				<div style="clear: both;">&nbsp;</div>
				<div class="entry">
				</div>
			</div>
		<div style="clear: both;">&nbsp;</div>
		</div>
		<!-- end #content -->
		<div id="sidebar">
			<ul>
				<li>
					<jsp:include page='<%="../xava/module.jsp?application=" + app + "&module=SignIn"%>'/>
					<div style="clear: both;">&nbsp;</div>
				</li>
			</ul>
		</div>
		<!-- end #sidebar -->
		<div style="clear: both;">&nbsp;</div>
	</div>
	</div>
	</div>
	<!-- end #page -->
</div>
	<div id="footer">
		<p><a href="#">***********************</a>.</p>
	</div>
	<!-- end #footer -->
