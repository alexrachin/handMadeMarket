<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/bootstrap/css/mdb.min.css" rel="stylesheet">
    <link href="resources/bootstrap/css/style.css" rel="stylesheet">
    <link href="resources/css/styles.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath}../../resources/bootstrap/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="resources/bootstrap/js/popper.min.js"></script>
    <script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="resources/bootstrap/js/mdb.min.js"></script>
    <script type="text/javascript" src="resources/js/scripts.js"></script>
    <title>HandMadeMarket</title>
</head>
<body>
    <header>
        <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-transparent scrolling-navbar">
            <a class="navbar-brand" href="#"><strong>Navbar</strong></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Features</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Pricing</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Opinions</a>
                    </li>
                </ul>
                <form class="form-inline">
                    <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
                </form>
            </div>
        </nav>
        <%--<div id="intro" class="view hm-black-strong">--%>
            <%--<div class="full-bg-img flex-center"></div>--%>
        <%--</div>--%>
    </header>

    <main>
        <div id="intro" class="container view hm-black-strong">
            <div class="full-bg-img flex-center"></div>
            <div class="container mt-">
                <div class="row">
                    <div class="col-md-7 mb-4">
                        <div class="view overlay hm-white-light z-depth-1-half">
                            <img src="https://mdbootstrap.com/img/Photos/Slides/img%20(70).jpg" class="img-fluid " alt="">
                            <div class="mask"></div>
                        </div>
                    </div>

                    <div class="col-md-5 mb-4">
                        <h2>Some awesome heading</h2>
                        <hr>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Blanditiis pariatur quod ipsum atque quam dolorem
                            voluptate officia sunt placeat consectetur alias fugit cum praesentium ratione sint mollitia, perferendis
                            natus quaerat!</p>
                        <a href="https://mdbootstrap.com/" class="btn btn-indigo">Get it now!</a>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4 col-md-12 mb-4">
                        <div class="card">
                            <div class="view overlay hm-white-slight">
                                <img src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(72).jpg" class="img-fluid" alt="">
                                <a href="#">
                                    <div class="mask"></div>
                                </a>
                            </div>
                            <div class="card-body">
                                <h4 class="card-title">Card title</h4>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                <a href="#" class="btn btn-indigo">Button</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 mb-4">
                        <div class="card">
                            <div class="view overlay hm-white-slight">
                                <img src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(74).jpg" class="img-fluid" alt="">
                                <a href="#">
                                    <div class="mask"></div>
                                </a>
                            </div>
                            <div class="card-body">
                                <h4 class="card-title">Card title</h4>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                <a href="#" class="btn btn-indigo">Button</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 mb-4">
                        <div class="card">
                            <div class="view overlay hm-white-slight">
                                <img src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(75).jpg" class="img-fluid" alt="">
                                <a href="#">
                                    <div class="mask"></div>
                                </a>
                            </div>
                            <div class="card-body">
                                <h4 class="card-title">Card title</h4>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                <a href="#" class="btn btn-indigo">Button</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </main>

    <footer>

    </footer>
</body>
</html>