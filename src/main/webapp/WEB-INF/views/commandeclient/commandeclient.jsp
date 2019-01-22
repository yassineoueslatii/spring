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
                           Liste des commandes Client
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                    <tr>
                                    	<th>Code</th>
                                    	<th>Date</th>
                                        <th><fmt:message key="common.client.nom" /></th>
                                        <th>Totale</th>
                                        <th><fmt:message key="common.client.action" /></th>
                                    </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${commandeclient}" var="cde">
                                
                                
                                    <tr class="odd gradeX">
                                     <td>${cde.getCodeCommandeClient() }</td>
                                 
                                     <td>${cde.getDateCommande() }</td>
                                     <td>${cde.getClient().getNom() }</td>
                                     <td>${cde.getTotalCommande() }</td>
                                     
                                     
                                        
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
             <div class="row">
             <div class="col-lg-12">
                     <div class="panel panel-default">
                        <div class="panel-heading">
                           Details:
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                    <tr>
                                    	<th>Article</th>
                                    	<th>Quantite</th>
                                        <th>Prix Unitaire TTC</th>
                                        <th>Total</th>
                                        <th>Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                   
                                    
                                </tbody>
                            </table>
                            <!-- /.table-responsive -->
                            
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                    
             
             </div>
             
             
             </div>
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
