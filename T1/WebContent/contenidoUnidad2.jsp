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
.style5 {font-size: 36px; font-weight: bold; font-family: "Comic Sans MS"; }
.style7 {font-family: "Comic Sans MS"; font-weight: bold; }
-->
</style>
</head>
<body>
<%@ page import="edu.progra.bean.Contenido" %>

<%
	Contenido temasInfo=(Contenido)request.getAttribute("tema");
%>
<form name="form1" method="post" action="">
  <table width="861" height="596" border="0" bgcolor="#000000">
    <tr>
      <td height="96" colspan="2" bgcolor="#FFFFFF"><div align="justify">
        <table width="583" height="92" border="0" bgcolor="#FFFFFF">
          <tr>
            <td width="385"><div align="center"><span class="style3">E - Learning USMP</span> </div></td>
            <td width="188"><img src="images/libro principal.png" width="155" height="115"></td>
          </tr>
        </table>
      </div></td>
      <td width="260" bgcolor="#FFFFFF"><table width="243" height="91" border="0" bgcolor="#FFFFFF">
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
     
      <td  height="365" colspan="2" bgcolor="#FFFFFF"><table width="635" height="365" border="0" bgcolor="#000000">
        <tr>
          <td width="94" height="25" bgcolor="#CCCCCC"><span class="style2"><a href="ContenidoServlet?cod=1">Unidad 1 </a></span></td>
          <td width="161" rowspan="5" bgcolor="#FFFFFF"><table width="509" height="328" border="0" bgcolor="#FFFFFF">
             <tr>
              <td width="50" height="91"><span class="style5">&gt;</span></td>
              <td width="434"><p class="style2">Semana 4: </p>
                <p class="style2"><%=temasInfo.getTema4()%></p></td>
            </tr>
            <tr>
              <td height="111"><span class="style2"><span class="style5">&gt;</span></span></td>
              <td><p class="style2">Semana 5: </p>
                <p class="style2"><%=temasInfo.getTema5()%></p></td>
            </tr>
           

            <tr>
              <td height="105"><span class="style2"><span class="style5">&gt;</span></span></td>
              <td><p>Semana 6:</p>
                <p><span class="style2"><%=temasInfo.getTema6()%></span> </p></td>
              </tr>
            
          </table>   
            <label></label></td>
        </tr>
        <tr bgcolor="#CCCCCC">
          <td bgcolor="#FFFFFF"><span class="style2">Unidad 2 </span></td>
          </tr>
        <tr bgcolor="#CCCCCC">
          <td><span class="style2"><a href="ContenidoServlet?cod=3">Unidad 3</a> </span></td>
          </tr>
        <tr bgcolor="#CCCCCC">
          <td><span class="style2"><a href="ContenidoServlet?cod=4">Unidad 4</a> </span></td>
          </tr>
          
        <tr>
          <td height="93" bgcolor="#FFFFFF">&nbsp;</td>
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