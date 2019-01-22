<%@ include file="/WEB-INF/views/includes/includes.jsp" %>
<div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li class="sidebar-search">
                            <div class="input-group custom-search-form">
                                <input type="text" class="form-control" placeholder="Search...">
                                <span class="input-group-btn">
                                    <button class="btn btn-default" type="button">
                                        <i class="fa fa-search"></i>
                                    </button>
                                </span>
                            </div>
                            <!-- /input-group -->
                        </li>
                        <li>
                        <c:url value="/home/" var="home" />
                            <a href="${home}"><i class="fa fa-dashboard fa-fw"></i><fmt:message key="common.dashboard" /> </a>
                        </li>
                        <li>
                        <c:url value="/article/" var="article" />
                            <a href="${article}"><i class="fa fa-dashboard fa-fw"></i><fmt:message key="common.article" /> </a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> <fmt:message key="common.client" /><span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                <c:url value="/client/" var="client" />
                                    <a href="${client }"><fmt:message key="common.client" /></a>
                                </li>
                                <li>
                                <c:url value="/commandeclient/" var="commandeclient" />
                                    <a href="${commandeclient}"><fmt:message key="common.commandeclient" /></a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> <fmt:message key="common.fournisseur" /><span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                <c:url value="/fournisseur/" var="fournisseur" />
                                    <a href="${fournisseur}"><fmt:message key="common.fournisseur" /></a>
                                </li>
                                <li>
                                <c:url value="/commandefournisseur/" var="commandefournisseur" />
                                    <a href="${commandefournisseur}"><fmt:message key="common.fournisseur.commande" /></a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                        <c:url value="/vente/" var="vente" />
                            <a href="${vente}"><i class="fa fa-table fa-fw"></i><fmt:message key="common.vente" /></a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> <fmt:message key="common.parametrage" /><span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                <<c:url value="/utilisateur/" var="utilisateur" />
                                    <a href="${utilisateur}"><fmt:message key="common.parametrage.utilisateur" /></a>
                                </li>
                                <li>
                                <c:url value="/categorie/" var="categorie" />
                                    <a href="${categorie}"><fmt:message key="common.parametrage.categorie" /></a>
                                </li>
                            </ul>
                       
                            
                            <!-- /.nav-second-level -->
                        </li>
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>