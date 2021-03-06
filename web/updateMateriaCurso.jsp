<%-- 
    Document   : registroMateria
    Created on : 22/03/2019, 02:38:28 PM
    Author     : SENA2
--%>

<%@page import="com.adsi.modelo.MateriaCurso"%>
<%@page import="com.adsi.modelo.Materia"%>
<%@page import="java.util.List"%>
<%@page import="com.adsi.modelo.Curso"%>
<%@page import="com.adsi.modelo.Curso"%>
<%@page import="com.adsi.control.Controlador"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Prototipo Web BD</title>

        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

        <link href="css/sb-admin-2.min.css" rel="stylesheet">
        <link href="css/sb-admin-2.css" rel="stylesheet">

        <link href="vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

    </head>

    <body id="page-top">
        <!-- Page Wrapper -->
        <div id="wrapper">

            <!-- Sidebar -->
            <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>

                <!-- Sidebar - Brand -->
                <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.jsp">
                    <div class="sidebar-brand-icon rotate-n-15">
                        <i class="fas fa-laugh-wink"></i>
                    </div>
                    <div class="sidebar-brand-text mx-3">POO ADSI <sup>BD</sup></div>
                </a>

                <!-- Divider -->
                <hr class="sidebar-divider my-0">


                <!-- Divider -->
                <hr class="sidebar-divider">

                <!-- Heading -->
                <div class="sidebar-heading">
                    Contenido
                </div>

                <!-- Nav Item - Pages Collapse Menu -->
                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
                        <i class="fas fa-fw fa-table"></i>
                        <span>Tablas</span>
                    </a>
                    <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">

                            <!-- Enlaces de referencia a las paginas donde estan las tablas con la informacion-->
                            <a class="collapse-item" href="tabla.jsp">Aprendiz</a>
                            <a class="collapse-item" href="tablacursos.jsp">Cursos</a>
                            <a class="collapse-item" href="tablaMaterias.jsp">Materias</a>
                            <a class="collapse-item" href="tablaMateriaCurso.jsp">Materias x Curso</a>
                        </div>
                    </div>
                </li>

                <!-- Nav Item - Pages Collapse Menu -->
                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages" aria-expanded="true" aria-controls="collapsePages">
                        <i class="fas fa-fw fa-folder"></i>
                        <span>Registros</span>
                    </a>
                    <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">

                            <!-- Enlaces de referencia a las paginas de registro-->
                            <a class="collapse-item" href="registroAprendiz.jsp">Aprendiz</a>
                            <a class="collapse-item" href="registroCurso.jsp">Cursos</a>
                            <a class="collapse-item" href="registroMateria.jsp">Materias</a>
                            <a class="collapse-item" href="registroMateriaCurso.jsp">Materias x Curso</a>

                        </div>
                    </div>
                </li>

                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities" aria-expanded="true" aria-controls="collapseUtilities">
                        <i class="fas fa-fw fa-search"></i>
                        <span>Consultas</span>
                    </a>
                    <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">

                            <!--Enlaces de referencia para las consultas-->
                            <a class="collapse-item" href="consultaAprendizCurso.jsp">Aprendices x Curso</a>
                            <a class="collapse-item" href="consultaPromedio.jsp">Promedio</a>

                        </div>
                    </div>
                </li>

                <!-- Divider -->
                <hr class="sidebar-divider d-none d-md-block">
                <!-- Sidebar Toggler (Sidebar) -->
                <div class="text-center d-none d-md-inline">
                    <button class="rounded-circle border-0" id="sidebarToggle"></button>
                </div>

            </ul>
            <!-- End of Sidebar -->



        </ul>

    </nav>
    <!--El codigo de nombre "repo" nos permite para utilizar la conexion que fue almacenada dentro de la sesion,
    proceso que fue realizado anteriormente en la pagina index.jsp-->
    <!--Dentro de este segmento es donde son almacenas los datos que fueron tranferidos de la pagina tablaMateriaCurso-->
    <%
        Controlador repo = (Controlador) session.getAttribute("repo");
        String IdMateriaCurso;
        int IdMateria;
        int IdCurso;
        
        IdMateriaCurso = request.getParameter("ID");
        IdMateria = Integer.parseInt(request.getParameter("Materia"));
        IdCurso = Integer.parseInt(request.getParameter("Curso"));

    %>

    <div id="content-wrapper" class="d-flex flex-column">

        <div class="container-fluid">
            <br>
            <!-- Page Heading -->
            <h1 class="h3 mb-2 text-gray-800" align="center">EDICION DE DATOS</h1>
            <br>
            <!-- DataTales Example -->
            <div class="card shadow mb-4">
                <div class="card-header py-3">
                    <h6 class="m-0 font-weight-bold text-primary">MATERIA x CURSO</h6>
                </div>
                <div class="card-body">

                    <form action="datosUpdateMateriasCurso.jsp">
                        <div class="form-row">

                            <div class="form-group col-md-4">
                                <label >ID</label>
                                <input type="Text" class="form-control" name="Id2" value="<%=IdMateriaCurso%>" readonly="readonly">
                            </div>

                            <div class="form-group col-md-4">
                                <label >MATERIA</label>
                                <select class="form-control" name="fk_materia" required="true">
                                    <%
                                        List<Materia> lista = repo.findMateriaByIdMateria(IdMateria);
                                        
                                        for (Materia item : lista) {
                                    %>
                                    <option value="<%=IdMateria%>">
                                        <%=item.getNombre_materia()%> (Actual)
                                    </option>
                                    <% }
                                    %>


                                    <%    
                                        List<Materia> lista2 = repo.findAllMateria();
                                        for (Materia item2 : lista2) {
                                    %>
                                    <option value="<%=item2.getId_materias()%>">
                                        <%= item2.getNombre_materia()%> 
                                    </option>
                                    <%
                                        }
                                    %>
                                </select>
                            </div>

                            <div class="form-group col-md-4">
                                <label >CURSO</label>
                                <select class="form-control" name="fk_curso" required="true">
                                    <%    
                                        List<Curso> lista3 = repo.findCursoByIdCurso(IdCurso);
                                        
                                        for (Curso item3 : lista3) {
                                    %>
                                    <option value="<%=IdCurso%>">
                                        <%=item3.getNombre_curso()%> (Actual)
                                    </option>
                                    <% }
                                    %>


                                    <%    
                                        List<Curso> lista4 = repo.findAllCursos();
                                        for (Curso item4 : lista4) {
                                    %>
                                    <option value="<%=item4.getId_cursos()%>">
                                        <%= item4.getNombre_curso()%> 
                                    </option>
                                    <%
                                        }
                                    %>
                                </select>
                            </div>

                        </div>
                        <button type="submit" name="btnActualizar" class="btn btn-primary">Actualizar</button>
                    </form>
                    
                </div>
            </div>

        </div>
        <!-- /.container-fluid -->

    </div>
    <!-- End of Main Content -->
</div>
<!-- Bootstrap core JavaScript-->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="js/sb-admin-2.min.js"></script>

<!-- Page level plugins -->
<script src="vendor/datatables/jquery.dataTables.min.js"></script>
<script src="vendor/datatables/dataTables.bootstrap4.min.js"></script>

<!-- Page level custom scripts -->
<script src="js/demo/datatables-demo.js"></script>

</body>

</html>
