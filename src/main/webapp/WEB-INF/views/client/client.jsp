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

    <!-- DataTables CSS -->
    <link href="<%=request.getContextPath()%>/resources/vendor/datatables-plugins/dataTables.bootstrap.css" rel="stylesheet">

    <!-- DataTables Responsive CSS -->
    <link href="<%=request.getContextPath()%>/resources/vendor/datatables-responsive/dataTables.responsive.css" rel="stylesheet">
    
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
                        <h1 class="page-header"><fmt:message key="common.client" /></h1>
                    </div>
                    <div class="row">
               <div class="col-lg-12">
               <nav aria-label="breadcrumb">
			    <ol class="breadcrumb">
			    <c:url value="/client/nouveau" var="nouveau" />
			     <li class="breadcrumb-item"><a href="${nouveau}"><i class="fa fa-plus"><fmt:message key="common.ajouter" /></i></a></li>
			     <li class="breadcrumb-item"><a href="#"><i class="fa fa-download "><fmt:message key="common.exporter" /></i></a></li>
			     <li class="breadcrumb-item"><a href="#"><i class="fa fa-upload"><fmt:message key="common.importer" /></i></a></li>
			    
			
			   </ol>
			</nav>
               </div>
               </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <fmt:message key="common.client.liste" />
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                    <tr>
                                    	<th><fmt:message key="common.client.photo" /></th>
                                        <th><fmt:message key="common.client.nom" /></th>
                                        <th><fmt:message key="common.client.prenom" /></th>
                                        <th><fmt:message key="common.client.email" /></th>
                                        <th><fmt:message key="common.client.addresse" /></th>
                                        <th><fmt:message key="common.client.action" /></th>
                                    </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${clients}" var="client">
                                
                                
                                    <tr class="odd gradeX">
                                        <td><img alt="" src="${client.getPhoto() }" width="40px" height="40px" >   </td>
                                        <td>${client.getNom() }</td>
                                        <td>${client.getPrenom() }</td>
                                        <td class="center">${client.getMail() }</td>
                                        <td class="center">${client.getAddresse() }</td>
                                        <td class="center">
                                        <c:url value="/client/modifier/${client.getIdClient() }" var="modi" />
                                         <a href="${modi}"><i class="fa fa-edit"><fmt:message key="common.modifier" /></i></a>
			     						 <br>
			     						 <c:url value="/client/supprimer/${client.getIdClient() }/" var="supp" />
			     						 <a href="${supp}"><i class="fa fa-trash"><fmt:message key="common.supprimer" /></i></a>
                                        </td>
                                    </tr>
                               </c:forEach>     
                                    
                                </tbody>
                            </table>
                            <!-- /.table-responsive -->
                            
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                    
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
	 <!-- DataTables JavaScript -->
    <script src="<%=request.getContextPath()%>/resources/vendor/datatables/js/jquery.dataTables.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources/vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources/vendor/datatables-responsive/dataTables.responsive.js"></script>
	 <!-- Custom Theme JavaScript -->
    <script src="<%=request.getContextPath()%>/resources/dist/js/sb-admin-2.js"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
            responsive: true
        });
    });
    </script>
</body>

</html>
