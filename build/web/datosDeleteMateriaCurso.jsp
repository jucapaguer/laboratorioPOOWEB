<%-- 
    Document   : datosNewAprendiz
    Created on : 26/03/2019, 03:29:51 PM
    Author     : JUANK
--%>

<%@page import="com.adsi.modelo.MateriaCurso"%>
<%@page import="com.adsi.modelo.Materia"%>
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

        <link href="vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

    </head>

    <body id="page-top">
        <!-- Page Wrapper -->
         <!--
            Dentro de este segmento es recivido el codigo enviado de la pagina "tablaMateriaCurso" dentro del cual
            se encuentra el datos correspondiente al registro que se va a eliminar.
            luego es enviado atraves de los SETs a un metodo que ya ha sido declarado en la clase controlador.
            Terminado este proceso la pagina se cerrar y pasara a la pagina tablaMateriaCurso
        -->
         <%
            Controlador repo = (Controlador) session.getAttribute("repo");

            Integer codigo;

            codigo = Integer.parseInt(request.getParameter("ID"));

            MateriaCurso deleteMateriaCurso = new MateriaCurso ();

            deleteMateriaCurso.setId_materias_curso(codigo);

            repo.eliminarMateriaCurso(deleteMateriaCurso);

            request.getRequestDispatcher("tablaMateriaCurso.jsp").forward(request, response);

        %>
        
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

