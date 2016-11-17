<%-- 
    Document   : LoginUser
    Created on : Nov 17, 2016, 4:17:11 AM
    Author     : surakitisopontanapat
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="model.ConnectionBuilder"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Login</title>

        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="vendor/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="css/form-elements.css">
        <link rel="stylesheet" href="css/form-style.css">
        <link href="css/agency.min.css" rel="stylesheet">
        <link rel="stylesheet" href="vendor/others/profile.css">
        <link rel="stylesheet" href="css/Calcories.css">

        <link rel="shortcut icon" href="">
        <script src="js/jquery-3.11.min.js"></script>
        <script src="js/angular.min.js"></script>
    </head>

    <body id="page-top" class="index" ng-app="app">
		<nav id="mainNav" class="navbar navbar-default navbar-custom navbar-fixed-top">
		      	<div class="container">
		            <div class="navbar-header page-scroll">
		                <a class="navbar-calcories page-scroll" href="index.html#page-top">Calcories</a>
		            </div>
		            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		                <ul class="nav navbar-nav navbar-right">
		                    <li class="hidden">
		                        <a href="#page-top"></a>
		                    </li>
		                    <li>
		                        <a class="page-scroll" href="index.html#about">About</a>
		                    </li>
		                    <li>
		                        <a class="page-scroll" href="index.html#voucher">Voucher</a>
		                    </li>
		                    <li>
		                        <a class="page-scroll" href="index.html#team">Team</a>
		                    </li>
		                    <li>
		                        <a class="page-scroll" href="#" style="color:#333333;">Log in</a>
		                    </li>
		                </ul>
		            </div>  
		        </div> 
		</nav>

		<div class="paddingprofile">
	        <div class="top-content">
	            <div class="inner-bg">
	                <div class="container">
	                    <div class="row">
	                        <div class="col-sm-8 col-sm-offset-2 text">
	                            <h1><strong>Login</strong> to make your life better.</h1>
	                        </div>
	                    </div>
	                    
	                    <div class="row">
	                        <div class="col-sm-5">
	                        	<div class="form-box">
		                        	<div class="form-top">
		                        		<div class="form-top-left">
		                        			<h3>Log in</h3>
		                            		<p>Enter username and password</p>
		                        		</div>
		                        		<div class="form-top-right">
		                        			<i class="fa fa-lock"></i>
		                        		</div>
		                            </div>
		                            <div class="form-bottom">
                                                            <form role="form" action="Login"  method="post" class="login-form ">
                                                                    <div class="form-group">
                                                                        <p style="color:red" >${message}</p>
					                    		<label class="sr-only" for="form-username">Username</label>
					                        	<input type="text" name="form-username" placeholder="Username" class="form-username form-control" id="form-username" required/>
					                        </div>
					                        <div class="form-group">
					                        	<label class="sr-only" for="form-password">Password</label>
					                        	<input type="password" name="form-password" placeholder="Password" class="form-password form-control" id="form-password" required/>
					                        </div>
					                        <button type="submit" class="btn btn-warning" value="Login" >Log in</button>
					                        <center><a href="resetpassword.html" style="font-size: small">Forget Password?</a></center>
                                                            </form>
				                    </div>
			                    </div>
		                        
	                        </div>
	                        
	                        <div class="col-sm-1 middle-border"></div>
	                        <div class="col-sm-1"></div>
	                        	
	                        <div class="col-sm-5">
	                        	
	                        	<div class="form-box">
	                        		<div class="form-top">
		                        		<div class="form-top-left">
		                        			<p>Don't have an account?</p>
		                        			<h3>Sign up now</h3>
		                        		</div>
		                        		<div class="form-top-right">
		                        			<i class="fa fa-pencil"></i>
		                        		</div>
		                            </div>
                                            <div class="form-bottom" ng-controller="ageController">
					                    <form role="form" action="RegisterServlet" method="post" class="registration-form">
					                    	<div class="form-group">
                                                                    
					                    		<label class="sr-only" for="form-username">Username</label>
					                        	<input type="text" name="form-username" placeholder="Username" class="form-username form-control" id="form-username" required/>
					                        </div>
					                        <div class="form-group">
					                    		<label class="sr-only" for="form-password">Password</label>
					                        	<input type="password" name="form-password" placeholder="Password" class="form-password form-control" id="form-password" required/>
					                        </div>
					                    	<div class="form-group">
					                    		<label class="sr-only" for="form-first-name">Full name</label>
					                        	<input type="text" name="form-full-name" placeholder="Full name" class="form-full-name form-control" id="form-full-name" required/>
					                        </div>
					                        <div class="form-group">
					                        	<label class="sr-only" for="form-email">Email</label>
					                        	<input type="email" name="form-email" placeholder="Email" class="form-email form-control" id="form-email" required/>
					                        </div>
					                        <div class="form-group">
					                        	<label class="sr-only" for="form-tel">Telephone Number</label>
					                        	<input type="text" name="form-tel" placeholder="Telephone Number" class="form-tel form-control" id="form-tel" required/>
					                        </div>
					                        <div class="form-group">
					                        	<label class="sr-only" for="form-birthday">Birthday</label>
					                        	<p>Birthday</p>
					                        	<input type="date" id="birthdate" name="form-date" class="form-date form-control" id="dob" onblur="calcAge()" />
					                        </div>
											<div class="form-group">
					                        	<label class="sr-only" for="form-age">Age</label>
                                                                        <input type="number" name="form-age" class="form-age form-control" id="age" placeholder="Age"  />
					                        </div>
					                        <p>Personal Data</p>
					                        <div class="form-group">
					                        	<p>Gender:&nbsp;
					                        	<input type="radio" name="form-gender" placeholder="Male" class="form-gender" id="form-gender-male" value="Male" autofocus />
					                        	<label for="form-gender-male">Male</label>&nbsp;
					                        	<input type="radio" name="form-gender" placeholder="Female" class="form-gender" value="Female" id="form-gender-female"/>
					                        	<label for="form-gender-female">Female</label>&nbsp;
					                        	<input type="radio" name="form-gender" placeholder="Other" class="form-gender" value="Other" id="form-gender-other"/>
					                        	<label for="form-gender-other">Other</label></p>
					                        </div>
					                        <div class="form-group">
					                        	<label class="sr-only" for="form-height">Height</label>
					                        	<input type="text" name="form-height" placeholder="Height" class="form-height form-control" id="form-height" required/>
					                        </div>
					                        <div class="form-group">
					                        	<label class="sr-only" for="form-weight">Weight</label>
					                        	<input type="text" name="form-weight" placeholder="Weight" class="form-weight form-control" id="form-weight" required/>
					                        </div>
					                        <button type="submit" class="btn btn-warning">Sign up</button>
					                    </form>
				                    </div>
	                        	</div>
	                        	
	                        </div>
	                    </div>
	                    
	                </div>
	            </div>
	            
	        </div>
	    </div>
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

        <script src="assets/js/jquery-1.11.1.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.backstretch.min.js"></script>
        <script src="assets/js/scripts.js"></script>
        <script src="vendor/jquery/jquery.min.js"></script>
   		<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
    	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    	<script src="js/jqBootstrapValidation.js"></script>
    	<script src="js/contact_me.js"></script>
    	<script src="js/agency.min.js"></script>
    	<script src="js/agefromdob.js"></script>
    	<script src="vendor/icheck/icheck.js"></script>
        <link href="vendor/icheck/skins/flat/orange.css" rel="stylesheet">
        <script src="vendor/icheck/icheck.js"></script>
        <script>
            $(document).ready(function(){
              $('input').iCheck({
                checkboxClass: 'icheckbox_flat-orange',
                radioClass: 'iradio_flat-orange'
              });
            });
        </script>
        <script src="js/calcories.js"></script>
        <script src="js/agefromdob.js"></script>
        <script src="js/app.js"></script>
    </body>
</html>