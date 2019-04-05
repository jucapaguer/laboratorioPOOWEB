<%-- 
    Document   : tabla
    Created on : 21/03/2019, 07:30:23 PM
    Author     : JUANK
--%>
<%@page import="com.adsi.modelo.Curso"%>
<%@page import="java.util.List"%>
<%@page import="com.adsi.modelo.Aprendiz"%>
<%@page import="com.adsi.control.Controlador"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">

    <head>

        <meta charset="ISO-8859-1">
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

    <!--Este codigo nos permite utilizar la conexion que fue almacenada dentro de la sesion,
        proceso que fue realizado anteriormente en la pagina index.jsp-->
    
    <%
        
        Controlador repo = (Controlador) session.getAttribute("repo");

        List<Aprendiz> lista = repo.findAllAprendices();

    %>

    <div id="content-wrapper" class="d-flex flex-column">
        <div class="container-fluid">
            <br>
            <!-- Page Heading -->
            <h1 class="h3 mb-2 text-gray-800" align="center">TABLA</h1>
            <br>
            <!-- DataTales Example -->
            <div class="card shadow mb-4">
                <div class="card-header py-3">
                    <h6 class="m-0 font-weight-bold text-primary" >Aprendiz</h6>
                </div>
                <div class="card-body">
                    <div class="table-responsive">
                        <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Documento</th>
                                    <th>Nombres</th>
                                    <th>Apellidos</th>
                                    <th>Edad</th>
                                    <th>Genero</th>
                                    <th>#Curso</th>
                                    <th>Curso</th>
                                    <th>Acciones</th>
                                </tr>
                            </thead>
                            <tbody>
                            <form >
                                <!--El ciclo for es utlizado para crear todas las filas y campos correspondientes 
                                al numero de registros contenidos en la tabla Aprendices de la base de datos-->
                                <%                        for (Aprendiz item : lista) {
                                %>   
                                <tr>
                                    <td > <%=item.getId_aprendices()%> </td>

                                    <td > <%=item.getDocumento()%> </td>

                                    <td > <%=item.getNombres()%> </td>

                                    <td > <%=item.getApellidos()%>  </td>

                                    <td > <%=item.getEdad()%> </td>

                                    <td > <%=item.getSexo()%> </td>

                                    <td > <%=item.getFk_curso()%> </td>

                                    <td > <%
                                        List<Curso> lista2 = repo.findCursoByIdCurso(item.getFk_curso());
                                        for (Curso item2 : lista2) {
                                        %>
                                        <%= item2.getNombre_curso() + "(" + item2.getJornada() + ")"%>
                                        <%
                                            }
                                        %> </td>
                                    <td>
                                        <!--Enlace de referencia hacia la tabla updateAprendiz,
                                        Ademas se utiliza para hacer la transferencia de datos de esta pagina a la otra-->
                                        <a href="updateAprendiz.jsp?ID=<%=item.getId_aprendices()%>&Documento=<%=item.getDocumento()%>&Nombre=<%=item.getNombres()%>&Apellido=<%=item.getApellidos()%>
                                           &Edad=<%=item.getEdad()%>&Genero=<%=item.getSexo()%>&Fkcurso=<%=item.getFk_curso()%>" class="btn btn-info btn-circle btn-sm" >
                                            <i class="fas fa-edit "></i>
                                        </a>

                                         <!--En este enlace solo se hace la tranferencia del codigo del Aprendiz 
                                                que va a hacer eliminado-->
                                        <a href="datosDeleteAprendiz.jsp?cod=<%=item.getId_aprendices()%>" class="btn btn-danger btn-circle btn-sm">
                                            <i class="fas fa-trash"></i>
                                        </a>

                                    </td>

                                    <%
                                        }
                                    %>
                                </tr>     
                            </form>

                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>


        <!--Esta parte son para los mensajes o ventanas de confirmacion para
        las opciones o acciones de editar y eliminar--> 

        <div class="modal modal-success fade" id="editar" tabindex="1" role="dialog" aria-labelledby="mensajeConfirmacion">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" id="mensajeConfirmacion"> EDICION DE DATOS</h4>
                    </div>
                    <div class="modal-body">
                        <p>Esta seguro/a que quiere Editar este Aprendiz ??</p>
                    </div>
                    <div class="modal-footer">
                        <a class="btn btn-success">Si</a>
                        <a class="btn btn-danger" data-dismiss="modal">No</a>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal modal-danger fade" id="borrar" tabindex="1" role="dialog" aria-labelledby="mensajeConfirmacion">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" id="mensajeConfirmacion"> ELIMINACION DE DATOS</h4>
                    </div>
                    <div class="modal-body">
                        <p>Esta seguro/a que quiere ELIMINAR este Aprendiz ??</p>
                    </div>
                    <div class="modal-footer">
                        <a href="" class="btn btn-success">Si</a>
                        <a class="btn btn-danger" data-dismiss="modal">No</a>
                    </div>
                </div>
            </div>
        </div>

        <!-- /.container-fluid -->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>
    </div>
    <!-- End of Main Content -->
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
