package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.adsi.control.Controlador;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <title>Prototipo Web BD</title>\r\n");
      out.write("\r\n");
      out.write("        <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <link href=\"css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/sb-admin-2.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <link href=\"vendor/datatables/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body id=\"page-top\">\r\n");
      out.write("        ");

            //SE realiza la conexion con la base de datos
            Controlador controlador = new Controlador();
            controlador.conectar();

            //LA conexion es guardada dentro de una sesion para poder ser utilizada en otras paginas
            session.setAttribute("repo", controlador);


        
      out.write("\r\n");
      out.write("        <!-- Page Wrapper -->\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Sidebar -->\r\n");
      out.write("            <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("\r\n");
      out.write("                <!-- Sidebar - Brand -->\r\n");
      out.write("                <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"index.jsp\">\r\n");
      out.write("                    <div class=\"sidebar-brand-icon rotate-n-15\">\r\n");
      out.write("                        <i class=\"fas fa-laugh-wink\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"sidebar-brand-text mx-3\">POO ADSI <sup>BD</sup></div>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <!-- Divider -->\r\n");
      out.write("                <hr class=\"sidebar-divider my-0\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- Divider -->\r\n");
      out.write("                <hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Heading -->\r\n");
      out.write("                <div class=\"sidebar-heading\">\r\n");
      out.write("                    Contenido\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Nav Item - Pages Collapse Menu -->\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseTwo\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-table\"></i>\r\n");
      out.write("                        <span>Tablas</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("                        <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("\r\n");
      out.write("                            <!-- Enlaces de referencia a las paginas donde estan las tablas con la informacion-->\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"tabla.jsp\">Aprendiz</a>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"tablacursos.jsp\">Cursos</a>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"tablaMaterias.jsp\">Materias</a>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"tablaMateriaCurso.jsp\">Materias x Curso</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <!-- Nav Item - Pages Collapse Menu -->\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapsePages\" aria-expanded=\"true\" aria-controls=\"collapsePages\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-folder\"></i>\r\n");
      out.write("                        <span>Registros</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div id=\"collapsePages\" class=\"collapse\" aria-labelledby=\"headingPages\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("                        <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("\r\n");
      out.write("                            <!-- Enlaces de referencia a las paginas de registro-->\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"registroAprendiz.jsp\">Aprendiz</a>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"registroCurso.jsp\">Cursos</a>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"registroMateria.jsp\">Materias</a>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"registroMateriaCurso.jsp\">Materias x Curso</a>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <!-- Divider -->\r\n");
      out.write("                <hr class=\"sidebar-divider d-none d-md-block\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Sidebar Toggler (Sidebar) -->\r\n");
      out.write("                <div class=\"text-center d-none d-md-inline\">\r\n");
      out.write("                    <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- End of Sidebar -->\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"d-sm-flex align-items-center justify-content-between mb-4\" >\r\n");
      out.write("            <h1 class=\"h3 mb-0 text-gray-800\" >Resumen</h1>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-xl-4 col-lg-5\">\r\n");
      out.write("                <div class=\"card border-left-primary shadow h-100 py-2\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <h6 class=\"m-0 font-weight-bold text-primary\">prototipos</h6>\r\n");
      out.write("                        <div class=\"table-responsive\">\r\n");
      out.write("                            <table class=\"table table-bordered\" width=\"100%\" cellspacing=\"0\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th >Name</th>\r\n");
      out.write("                                        <th>Position</th>\r\n");
      out.write("\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
      out.write("            <div class=\"col-xl-4 col-lg-5\">\r\n");
      out.write("                <div class=\"card border-left-success shadow h-100 py-2\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <h6 class=\"m-0 font-weight-bold text-success\">prototipos</h6>\r\n");
      out.write("                        <div class=\"table-responsive\">\r\n");
      out.write("                            <table class=\"table table-bordered\" width=\"100%\" cellspacing=\"0\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th >Name</th>\r\n");
      out.write("                                        <th>Position</th>\r\n");
      out.write("\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
      out.write("            <div class=\"col-xl-4 col-lg-5\">\r\n");
      out.write("                <div class=\"card border-left-info shadow h-100 py-2\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <h6 class=\"m-0 font-weight-bold text-info\">prototipos</h6>\r\n");
      out.write("                        <div class=\"table-responsive\">\r\n");
      out.write("                            <table class=\"table table-bordered\" width=\"100%\" cellspacing=\"0\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th >Name</th>\r\n");
      out.write("                                        <th>Position</th>\r\n");
      out.write("\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-xl-4 col-lg-5\">\r\n");
      out.write("                <div class=\"card border-left-warning shadow h-100 py-2\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <h6 class=\"m-0 font-weight-bold text-warning\">prototipos</h6>\r\n");
      out.write("                        <div class=\"table-responsive\">\r\n");
      out.write("                            <table class=\"table table-bordered\" width=\"100%\" cellspacing=\"0\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th >Name</th>\r\n");
      out.write("                                        <th>Position</th>\r\n");
      out.write("\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-xl-4 col-lg-5\">\r\n");
      out.write("                <div class=\"card border-left-danger shadow h-100 py-2\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <h6 class=\"m-0 font-weight-bold text-danger\">prototipos</h6>\r\n");
      out.write("                        <div class=\"table-responsive\">\r\n");
      out.write("                            <table class=\"table table-bordered\" width=\"100%\" cellspacing=\"0\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th >Name</th>\r\n");
      out.write("                                        <th>Position</th>\r\n");
      out.write("\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-xl-4 col-lg-5\">\r\n");
      out.write("                <div class=\"card border-left-primary shadow h-100 py-2\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <h6 class=\"m-0 font-weight-bold text-primary\">prototipos</h6>\r\n");
      out.write("                        <div class=\"table-responsive\">\r\n");
      out.write("                            <table class=\"table table-bordered\" width=\"100%\" cellspacing=\"0\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th >Name</th>\r\n");
      out.write("                                        <th>Position</th>\r\n");
      out.write("\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\r\n");
      out.write("        <i class=\"fas fa-angle-up\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("    <!-- End of Main Content -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Bootstrap core JavaScript-->\r\n");
      out.write("<script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Core plugin JavaScript-->\r\n");
      out.write("<script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Custom scripts for all pages-->\r\n");
      out.write("<script src=\"js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Page level plugins -->\r\n");
      out.write("<script src=\"vendor/datatables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script src=\"vendor/datatables/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Page level custom scripts -->\r\n");
      out.write("<script src=\"js/demo/datatables-demo.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
