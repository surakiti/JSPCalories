<%-- 
    Document   : TestRegister
    Created on : 12 ต.ค. 2559, 0:00:37
    Author     : surakitisopontanapat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

        <link rel="shortcut icon" href="">
    </head>

    <body id="page-top" class="index">
    	<nav id="mainNav" class="navbar navbar-default navbar-custom navbar-fixed-top">
	        <div class="container">
	            <div class="navbar-header page-scroll">
	                <a class="navbar-calcories page-scroll" href="index.html">Calcories</a>
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
                        <a class="page-scroll" href="index.html#portfolio">Voucher</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="index.html#team">Team</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#">Log in</a>
                    </li>
                </ul>
            </div>
            
        </div>
        	</div>
        </nav>

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
				                    <form role="form" action="" method="post" class="login-form">
				                    	<div class="form-group">
				                    		<label class="sr-only" for="form-username">Username</label>
				                        	<input type="text" name="form-username" placeholder="Username" class="form-username form-control" id="form-username" required/>
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-password">Password</label>
				                        	<input type="password" name="form-password" placeholder="Password" class="form-password form-control" id="form-password" required/>
				                        </div>
				                        <button type="submit" class="btn">Log in</button>
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
	                            <div class="form-bottom">
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
				                        	<input type="date" name="form-date" class="form-date form-control" id="form-date"/>
				                        </div>
										<div class="form-group">
				                        	<label class="sr-only" for="form-age">Age</label>
				                        	<input type="number" name="form-age" class="form-age form-control" id="form-age" placeholder="Age" />
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
				                        <button type="submit" class="btn">Sign up</button>
				                    </form>
			                    </div>
                        	</div>
                        	
                        </div>
                    </div>
                    
                </div>
            </div>
            
        </div>

        <!-- Footer -->
        <footer>
        	<div class="container">
        		<div class="row">
        			
        			<div class="col-sm-8 col-sm-offset-2">
        				<div class="footer-border"></div>
        				<p>Create with love in INT303. <i class="fa fa-heart"></i></p>
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

    </body>

</html>
