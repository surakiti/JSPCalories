<%-- 
    Document   : Profiles
    Created on : Nov 17, 2016, 4:37:25 AM
    Author     : surakitisopontanapat
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Profile</title>

        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="vendor/font-awesome/css/font-awesome.min.css">
        <link href="css/agency.min.css" rel="stylesheet">
        <link rel="stylesheet" href="vendor/others/profile.css">
        <link rel="stylesheet" href="vendor/others/photo.css">

        <link rel="shortcut icon" href="">
    </head>

    <body id="page-top" class="index">
		<nav id="mainNav" class="navbar navbar-default navbar-custom navbar-fixed-top">
		      	<div class="container">
		            <div class="navbar-header page-scroll">
		                <a class="navbar-calcories page-scroll" href="index.html" style="color:#F27935;">Calcories</a>
		            </div>
		            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		                <ul class="nav navbar-nav navbar-right">
		                    <li class="hidden">
		                        <a href="#page-top"></a>
		                    </li>
		                    <li>
		                        <a class="page-scroll" href="index.html#about" style="color:#F27935;">About</a>
		                    </li>
		                    <li>
		                        <a class="page-scroll" href="index.html#portfolio" style="color:#F27935;">Voucher</a>
		                    </li>
		                    <li>
		                        <a class="page-scroll" href="index.html#team" style="color:#F27935;">Team</a>
		                    </li>
		                    <li>
		                        <a class="page-scroll" href="Login.html" style="color:#F27935;">Log in</a>
		                    </li>
		                </ul>
		            </div>  
		        </div> 
		</nav>

		<div class="paddingprofile">
			<div class="container">
	            <div class="row">
					<div class="col-lg-12 col-sm-12">
					    <div class="card hovercard">
					        <div class="card-background">
					            <img class="card-bkimg" alt="" src="http://i2.cdscdn.com/pdt2/2/0/0/1/700x700/auc5060219944200/rw/figurine-geante-mickey-mouse.jpg">
					        </div>
					        <div class="useravatar">
                                                    <!-------->

                                          <img src="http://i2.cdscdn.com/pdt2/2/0/0/1/700x700/auc5060219944200/rw/figurine-geante-mickey-mouse.jpg">
					        
                                                </div>

					        <div class="card-info"> <span class="card-title"><a href="Profile.html">${name}</a></span>
					        </div>
					    </div>
					    <div class="btn-pref btn-group btn-group-justified btn-group-lg" role="group" aria-label="...">
					        <div class="btn-group" role="group">
					            <button type="button" id="stars" class="btn btn-default" href="#about" data-toggle="tab"><span class="fa fa-user" aria-hidden="true"></span>
					                <div class="hidden-xs">About</div>
					            </button>
					        </div>
					        <div class="btn-group" role="group">
					            <button type="button" id="following" class="btn btn-default" href="#coins" data-toggle="tab"><span class="fa fa-money" aria-hidden="true"></span>
					                <div class="hidden-xs">Coins</div>
					            </button>
					        </div>
					        <div class="btn-group" role="group">
					            <button type="button" id="favorites" class="btn btn-default" href="#tab2" data-toggle="tab"><span class="fa fa-cutlery" aria-hidden="true"></span>
					                <div class="hidden-xs">Calrories</div>
					            </button>
					        </div>
					    </div>

					        <div class="well">
					      <div class="tab-content">
					        <div class="tab-pane fade in active" id="about">
					        	<div class="row">
					        		<div class="col-sm-8">
							        	<div class="table-responsive">
							        		<table class="table" style="border:0;">
									        	<tr>
									        		<td><strong>Gender</strong></td>
									        		<td>${sex}</td>
									        	</tr>
									        	<tr>
									        		<td><strong>Age</strong></td>
									        		<td>${age}</td>
									        	</tr>
									        	<tr>
									        		<td><strong>Height</strong></td>
									        		<td>${height}</td>
									        	</tr>
									        	<tr>
									        		<td><strong>Weight</strong></td>
									        		<td>${weight}</td>
									        	</tr>
									        	<tr>
									        		<td><strong>BMI</strong></td>
                                                                                                <td>${bmi}</td>
									        	</tr>
									        	<tr>
									        		<td><strong>Cal per day</strong></td>
									        		<td>${calperday}</td>
									        	</tr>
                                                                                        
									        </table>
							        	</div>
					        		</div>
					        	</div>
                                                    
						        	<div class="col-sm-4">
						        	</div>
					        </div>
					        <div class="tab-pane fade in active" id="coins">
					        	<div class="row">
					        		<div class="col-sm-8">
							        	<div class="table-responsive">
							        		<table class="table" style="border:0;">
							        		<tr>
							        			<td><img src="http://image.flaticon.com/icons/svg/138/138292.svg" height="20%"><h4>Your coins:</h4></td>
                                                                                        <td><h2 style="color:black">${coin} COIN</h2></td>
							        		</tr>
							        		<tr>
							        			<td><a href="rewards.html"><h6>Rewards</h6></a></td>
							        		</tr>
							        		</table>
							        	</div>
					        		</div>
					        	</div>
					        </div>
					        <div class="tab-pane fade in" id="tab3">
					          <h3>This is tab 3</h3>
					        </div>
					      </div>
					    </div>
					</div>
				</div>
			</div>
		</div>
			    <!-- jQuery -->
    <script src="vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

    <!-- Contact Form JavaScript -->
    <script src="js/jqBootstrapValidation.js"></script>
    <script src="js/contact_me.js"></script>

    <!-- Theme JavaScript -->
    <script src="js/agency.min.js"></script>
	</body>

	<footer>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <span class="copyright">2016 JSP Project "Calcories"</span>
                </div>
                <div class="col-md-4"><!--
                    <ul class="list-inline social-buttons">
                        <li><a href="#"><i class="fa fa-twitter"></i></a>
                        </li>
                        <li><a href="#"><i class="fa fa-facebook"></i></a>
                        </li>
                        <li><a href="#"><i class="fa fa-linkedin"></i></a>
                        </li>
                    </ul>-->
                </div>
                <div class="col-md-4">
                    <ul class="list-inline quicklinks">
                        <li><a href="https://www.sit.kmutt.ac.th/">SIT</a>
                        </li>
                        <li><a href="http://www.kmutt.ac.th/">KMUTT</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </footer>
</html>
