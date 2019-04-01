<%-- 
    Document   : index
    Created on : 22/03/2019, 08:26:18 AM
    Author     : JUANK
--%>

<%@page import="com.adsi.control.Controlador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

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
        <%
            //SE realiza la conexion con la base de datos
            Controlador controlador = new Controlador();
            controlador.conectar();

            //LA conexion es guardada dentro de una sesion para poder ser utilizada en otras paginas
            session.setAttribute("repo", controlador);


        %>
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

    <div class="container-fluid">
        <br>
        <div class="d-sm-flex align-items-center justify-content-between mb-4" >
            <h1 class="h3 mb-0 text-gray-800" >Resumen</h1>

        </div>
        <br>
        <br>
        <div class="row">

            <div class="col-xl-4 col-lg-5">
                <div class="card border-left-primary shadow h-100 py-2">
                    <div class="card-body">
                        <h6 class="m-0 font-weight-bold text-primary">prototipos</h6>
                        <div class="table-responsive">
                            <table class="table table-bordered" width="100%" cellspacing="0">
                                <thead>
                                    <tr>
                                        <th >Name</th>
                                        <th>Position</th>

                                    </tr>
                                </thead>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <br>
            <div class="col-xl-4 col-lg-5">
                <div class="card border-left-success shadow h-100 py-2">
                    <div class="card-body">
                        <h6 class="m-0 font-weight-bold text-success">prototipos</h6>
                        <div class="table-responsive">
                            <table class="table table-bordered" width="100%" cellspacing="0">
                                <thead>
                                    <tr>
                                        <th >Name</th>
                                        <th>Position</th>

                                    </tr>
                                </thead>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <br>
            <div class="col-xl-4 col-lg-5">
                <div class="card border-left-info shadow h-100 py-2">
                    <div class="card-body">
                        <h6 class="m-0 font-weight-bold text-info">prototipos</h6>
                        <div class="table-responsive">
                            <table class="table table-bordered" width="100%" cellspacing="0">
                                <thead>
                                    <tr>
                                        <th >Name</th>
                                        <th>Position</th>

                                    </tr>
                                </thead>
                            </table>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <br>
        <div class="row">

            <div class="col-xl-4 col-lg-5">
                <div class="card border-left-warning shadow h-100 py-2">
                    <div class="card-body">
                        <h6 class="m-0 font-weight-bold text-warning">prototipos</h6>
                        <div class="table-responsive">
                            <table class="table table-bordered" width="100%" cellspacing="0">
                                <thead>
                                    <tr>
                                        <th >Name</th>
                                        <th>Position</th>

                                    </tr>
                                </thead>
                            </table>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-xl-4 col-lg-5">
                <div class="card border-left-danger shadow h-100 py-2">
                    <div class="card-body">
                        <h6 class="m-0 font-weight-bold text-danger">prototipos</h6>
                        <div class="table-responsive">
                            <table class="table table-bordered" width="100%" cellspacing="0">
                                <thead>
                                    <tr>
                                        <th >Name</th>
                                        <th>Position</th>

                                    </tr>
                                </thead>
                            </table>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-xl-4 col-lg-5">
                <div class="card border-left-primary shadow h-100 py-2">
                    <div class="card-body">
                        <h6 class="m-0 font-weight-bold text-primary">prototipos</h6>
                        <div class="table-responsive">
                            <table class="table table-bordered" width="100%" cellspacing="0">
                                <thead>
                                    <tr>
                                        <th >Name</th>
                                        <th>Position</th>

                                    </tr>
                                </thead>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>


    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>
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
