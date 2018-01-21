<html xmlns:th="http://www.thymeleaf.org">
<head>
    <head>Student Management</head>
    <div th:fragment="header-css">
        <!-- this is header-css -->
        <link rel="stylesheet" type="text/css"
              href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

        <link rel="stylesheet" th:href="@{/css/main.css}"
              href="../../css/main.css" />
    </div>
</head>
<body>
<div th:fragment="header">
    <!-- this is header -->
    <nav class="navbar navbar-inverse">
        <div class="container">
            <div class="navbar-header">
                <a class="navbar-brand" th:href="@{/}">Student Management</a>
            </div>
            <div id="navbar" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a th:href="@{/}">Home</a></li>
                </ul>
            </div>
        </div>
    </nav>
</div>

<div class="container">
    <div class="card">
        <div class="card-block">
            <h2>Welcome to Student Management</h2>
        </div>
    </div>
</div>

<script type="text/javascript" src="/webjars/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript" src="/webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>
</html>