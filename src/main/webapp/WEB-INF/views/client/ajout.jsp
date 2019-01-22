<%@ include file="/WEB-INF/views/includes/includes.jsp" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Bootstrap Admin Theme</title>

    <!-- Bootstrap Core CSS -->
    <link href="<%=request.getContextPath()%>/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="<%=request.getContextPath()%>/resources/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<%=request.getContextPath()%>/resources/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<%=request.getContextPath()%>/resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">
		<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
       
		<%@ include file="/WEB-INF/views/menu_top/top.jsp" %>
		<%@ include file="/WEB-INF/views/menu_left/left.jsp" %>
            
           
        </nav>

        <!-- Page Content -->
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Nouveau Client</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                  <div class="row">
                    <div class="col-lg-12">
                    <c:url value="/client/nouveau" var="nouveau" />
                        <f:form modelAttribute="client" action="${nouveau}" method="POST" enctype="multipart/form-data" >
							<div class="form-group">
                                <label><fmt:message key="common.client.nom" /></label>
                                <f:input path="nom" class="form-control" placeholder="Entrer le nom " />
                            </div>
                            <div class="form-group">
                                <label><fmt:message key="common.client.prenom" /></label>
                                <f:input path="prenom"  class="form-control" placeholder="Entrer le prenom " />
                            </div>
                            <div class="form-group">
                                <label><fmt:message key="common.client.addresse" /></label>
								<f:input path="addresse" class="form-control" placeholder="Entrer l'addresse" />
							</div>
                            <div class="form-group">
                                <label><fmt:message key="common.client.email" /></label>
                                <f:input path="email" class="form-control" placeholder="Entrer l'email "/>
                            </div> 
                            <div class="form-group">
                              <label><fmt:message key="common.client.photo" /></label>
                              <input type="file" name="file">
                            </div>
                            <button type="submit" class="btn btn-default">Valider</button>
                            <button type="reset" class="btn btn-default">Annuler</button>                       
                        </f:form>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="<%=request.getContextPath()%>/resources/vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<%=request.getContextPath()%>/resources/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="<%=request.getContextPath()%>/resources/vendor/metisMenu/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="<%=request.getContextPath()%>/resources/dist/js/sb-admin-2.js"></script>

</body>

</html>
