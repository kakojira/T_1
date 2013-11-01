<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
<!--
.style2 {font-family: "Comic Sans MS"}
.style3 {
	font-size: 36px;
	font-family: "Comic Sans MS";
	color: #990000;
}
.style4 {font-family: "Comic Sans MS"; font-weight: bold; }
-->
</style>
</head>
<body>
<%@ page import="edu.progra.bean.Bibliografia" %>

<%
	Bibliografia bibliosInfo=(Bibliografia)request.getAttribute("bibliografia");
%>
<form name="form1" method="post" action="">
  <table width="635" height="596" border="0" bgcolor="#000000">
    <tr>
      <td height="96" colspan="2" bgcolor="#FFFFFF"><div align="justify">
        <table width="583" height="92" border="0" bgcolor="#FFFFFF">
          <tr>
            <td width="385"><div align="center"><span class="style3">E - Learning USMP</span> </div></td>
            <td width="188"><img src="images/libro principal.png" width="155" height="115"></td>
          </tr>
        </table>
      </div></td>
      <td width="741" bgcolor="#FFFFFF"><table width="243" height="91" border="0" bgcolor="#FFFFFF">
        <tr>
          <td width="96"><span class="style2">Usuario:</span></td>
          <td width="215"><label>
            <input name="txt_usuario" type="text" id="txt_usuario">
          </label></td>
        </tr>
        <tr>
          <td><span class="style2">Contrase&ntilde;a:</span></td>
          <td><label>
            <input name="txt_contrase&ntilde;a" type="text" id="txt_contrase&ntilde;a">
          </label></td>
        </tr>
        <tr>
          <td colspan="2"><label>
            <div align="center">
              <input name="btn_ingresar" type="submit" class="style2" id="btn_ingresar" value="Ingresar">
              </div>
          </label></td>
          </tr>
      </table></td>
    </tr>
    <tr>
      <td width="222" bgcolor="#FFFFFF"><ul>
        <li class="style2"><a href="InformacionServlet">Informacion de Curso</a></li>
        </ul>
        <ul class="style2">
          <li><a href="ContenidoServlet?cod=1">Contenido del Curso</a> </li>
        </ul>
        <ul>
          <li class="style2"><a href="BibliografiaServlet?cod=1">Bibliografia</a></li>
        </ul>
        <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p></td>
      <td  height="365" colspan="2" bgcolor="#FFFFFF"><table width="509" height="366" border="0" bgcolor="#000000">
        <tr>
          <td width="115" height="43" bgcolor="#CCCCCC"><div align="center" class="style2"><a href="BibliografiaServlet?cod=1">Libro 1 </a></div></td>
          <td width="111" bgcolor="#CCCCCC"><div align="center" class="style2"><a href="BibliografiaServlet?cod=2">Libro 2</a> </div></td>
          <td width="110" bgcolor="#CCCCCC"><div align="center" class="style2"><a href="BibliografiaServlet?cod=3">Libro3</a></div></td>
          <td width="111" bgcolor="#FFFFFF"><div align="center" class="style2">Libro 4 </div></td>
          <td width="302" bgcolor="#FFFFFF">&nbsp;</td>
        </tr>
        <tr>
          <td height="317" colspan="5" bgcolor="#FFFFFF"><table width="509" border="0">
            <tr>
              <td width="258" height="271"><img src="images/libro.png" width="255" height="245"></td>
              <td width="360"><table width="500" height="259" border="0">
                <tr>
                  <td height="34"><div align="center" class="style4">Libro4:<%=bibliosInfo.getLibro4()%> </div></td>
                </tr>
                <tr>
                  <td><p class="style2">Descripcion</p>
                    <p class="style2">SWEBOK significa Software Engineering Body of Knowledge. </p>
                    <p class="style2">SWEBOK un libro que es de mucha ayuda si un alumno de la carrera de ingenieria de Sistemas decide desarrollar un software.. </p>
                    <p class="style2">Es muy util para poder desarrollar un software optimo. </p>
                    <p class="style2">&nbsp; </p></td>

                </tr>
              </table></td>
            </tr>
            <tr>
              <td colspan="2"><div align="center" class="style2"><a href="https://www.dropbox.com/sh/a43f5hzkgzd36h0/8buiuetKmd/SWEBOK.pdf" target="_blank">ver l</a><a href="https://www.dropbox.com/sh/a43f5hzkgzd36h0/8buiuetKmd/SWEBOK.pdf" target="_blank">ibro </a></div></td>
              </tr>
          </table></td>
          </tr>
      </table></td>
    </tr>
    <tr>
      <td height="112" colspan="3" bgcolor="#FFFFFF"><div align="center"><img src="images/logoo.png" width="408" height="90"></div></td>
    </tr>
  </table>
</form>
</body>
</html>