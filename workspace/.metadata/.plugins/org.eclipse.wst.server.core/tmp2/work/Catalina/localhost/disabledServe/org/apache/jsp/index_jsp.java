/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.20
 * Generated at: 2018-10-09 12:26:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/eclipse/jee-oxygen/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/disabledServe/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1538743568887L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>残疾人服务中心</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("<script src=\"js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("//图片滚动 调用方法 imgscroll({speed: 30,amount: 1,dir: \"up\"});\r\n");
      out.write("$.fn.imgscroll = function(o){\r\n");
      out.write("\tvar defaults = {\r\n");
      out.write("\t\tspeed: 40,\r\n");
      out.write("\t\tamount: 0,\r\n");
      out.write("\t\twidth: 1,\r\n");
      out.write("\t\tdir: \"left\"\r\n");
      out.write("\t};\r\n");
      out.write("\to = $.extend(defaults, o);\r\n");
      out.write("\t\r\n");
      out.write("\treturn this.each(function(){\r\n");
      out.write("\t\tvar _li = $(\"li\", this);\r\n");
      out.write("\t\t_li.parent().parent().css({overflow: \"hidden\", position: \"relative\"}); //div\r\n");
      out.write("\t\t_li.parent().css({margin: \"0\", padding: \"0\", overflow: \"hidden\", position: \"relative\", \"list-style\": \"none\"}); //ul\r\n");
      out.write("\t\t_li.css({position: \"relative\", overflow: \"hidden\"}); //li\r\n");
      out.write("\t\tif(o.dir == \"left\") _li.css({float: \"left\"});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//初始大小\r\n");
      out.write("\t\tvar _li_size = 0;\r\n");
      out.write("\t\tfor(var i=0; i<_li.size(); i++)\r\n");
      out.write("\t\t\t_li_size += o.dir == \"left\" ? _li.eq(i).outerWidth(true) : _li.eq(i).outerHeight(true);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//循环所需要的元素\r\n");
      out.write("\t\tif(o.dir == \"left\") _li.parent().css({width: (_li_size*3)+\"px\"});\r\n");
      out.write("\t\t_li.parent().empty().append(_li.clone()).append(_li.clone()).append(_li.clone());\r\n");
      out.write("\t\t_li = $(\"li\", this);\r\n");
      out.write("\r\n");
      out.write("\t\t//滚动\r\n");
      out.write("\t\tvar _li_scroll = 0;\r\n");
      out.write("\t\tfunction goto(){\r\n");
      out.write("\t\t\t_li_scroll += o.width;\r\n");
      out.write("\t\t\tif(_li_scroll > _li_size)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\t_li_scroll = 0;\r\n");
      out.write("\t\t\t\t_li.parent().css(o.dir == \"left\" ? { left : -_li_scroll } : { top : -_li_scroll });\r\n");
      out.write("\t\t\t\t_li_scroll += o.width;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\t_li.parent().animate(o.dir == \"left\" ? { left : -_li_scroll } : { top : -_li_scroll }, o.amount);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//开始\r\n");
      out.write("\t\tvar move = setInterval(function(){ goto(); }, o.speed);\r\n");
      out.write("\t\t_li.parent().hover(function(){\r\n");
      out.write("\t\t\tclearInterval(move);\r\n");
      out.write("\t\t},function(){\r\n");
      out.write("\t\t\tclearInterval(move);\r\n");
      out.write("\t\t\tmove = setInterval(function(){ goto(); }, o.speed);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("};\r\n");
      out.write("//友情链接下拉框跳转弹出新窗口\r\n");
      out.write("function frlink(selObj){\r\n");
      out.write("window.open(selObj.options[selObj.selectedIndex].value);}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"hearder2\" class=\"clearfix\">\r\n");
      out.write("\t<div class=\"logo\">\r\n");
      out.write("   \t  <img src=\"images/logo.jpg\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"logo-name\">残疾人服务平台</div>\r\n");
      out.write("    <div class=\"form-tools\">\r\n");
      out.write("   \t  <form id=\"search\" name=\"search\" action=\"SerchResult\" method=\"post\">\r\n");
      out.write("   \t    <div class=\"tools-link\">\r\n");
      out.write("   \t    \r\n");
      out.write("   \t    ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("       ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("        \r\n");
      out.write("        \t&nbsp;&nbsp;|\r\n");
      out.write("        \t<a href=\"form.jsp\" target=\"_blank\"><font size=\"2px\">我要报名</font></a>\r\n");
      out.write("        </div>\t\r\n");
      out.write("        <div class=\"search-box\">\r\n");
      out.write("            <input type=\"text\" name=\"key\" id=\"textfield\" class=\"input-text\" placeholder=\"请输入搜索关键词\">\r\n");
      out.write("            <input type=\"image\" src=\"images/search.png\" class=\"input-submit\" />\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"tools-link\">\r\n");
      out.write("             热搜：&nbsp;&nbsp;");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("  \t  </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"slider-box\" style=\"background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${BG.picaddress}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(") center center;\"></div>\r\n");
      out.write("<!-- div2 -->\r\n");
      out.write("<div id=\"div2\" class=\"clearfix\">\r\n");
      out.write("\t<div class=\"left260\">\r\n");
      out.write("    \t<div class=\"title-box\">精彩推荐</div>\r\n");
      out.write("            <ul>\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"center450\">\r\n");
      out.write("        <div class=\"tabbox\">\r\n");
      out.write("            <div class=\"title-box\">残疾人优惠政策</div>\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("                    <div style=\"display:block;\" class=\"tb\">\r\n");
      out.write("                    \t<ul>\r\n");
      out.write("                    \t");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("                      \t\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\".tabbox .tab a\").mouseover(function(){\r\n");
      out.write("\t\t$(this).addClass('on').siblings().removeClass('on');\r\n");
      out.write("\t\tvar index = $(this).index();\r\n");
      out.write("\t\tnumber = index;\r\n");
      out.write("\t\t$('.tabbox .content .tb').hide();\r\n");
      out.write("\t\t$('.tabbox .content .tb:eq('+index+')').show();\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tvar auto = 1;  //等于1则自动切换，其他任意数字则不自动切换\r\n");
      out.write("\tif(auto ==1){\r\n");
      out.write("\t\tvar number = 0;\r\n");
      out.write("\t\tvar maxNumber = $('.tabbox .tab a').length;\r\n");
      out.write("\t\tfunction autotab(){\r\n");
      out.write("\t\t\tnumber++;\r\n");
      out.write("\t\t\tnumber == maxNumber? number = 0 : number;\r\n");
      out.write("\t\t\t$('.tabbox .tab a:eq('+number+')').addClass('on').siblings().removeClass('on');\r\n");
      out.write("\t\t\t$('.tabbox .content .tb:eq('+number+')').show().siblings().hide();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar tabChange = setInterval(autotab,3000);\r\n");
      out.write("\t\t//鼠标悬停暂停切换\r\n");
      out.write("\t\t$('.tabbox').mouseover(function(){\r\n");
      out.write("\t\t\tclearInterval(tabChange);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('.tabbox').mouseout(function(){\r\n");
      out.write("\t\t\ttabChange = setInterval(autotab,3000);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t  }\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div id=\"div4\">\r\n");
      out.write("\t<div class=\"title-box\">最新信息</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"scrollleft clearfix\">\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fforEach_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\r\n");
      out.write("\t$(\".scrollleft\").imgscroll({\r\n");
      out.write("\t\tspeed: 40,    //图片滚动速度\r\n");
      out.write("\t\tamount: 0,    //图片滚动过渡时间\r\n");
      out.write("\t\twidth: 1,     //图片滚动步数\r\n");
      out.write("\t\tdir: \"left\"   // \"left\" 或 \"up\" 向左或向上滚动\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("</script> \r\n");
      out.write("<div id=\"div6\">Copyright &copy; 2018 残疾人服务中心 All rights reserved.</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /index.jsp(78,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${USERNAME==null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("        \t<a href=\"login.jsp\" target=\"_blank\"><font size=\"2px\">登&nbsp;录</font></a>&nbsp;&nbsp;|\r\n");
          out.write("        \t<a href=\"register.jsp\" target=\"_blank\"><font size=\"2px\">注&nbsp;册</font></a>\r\n");
          out.write("        \t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /index.jsp(82,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${USERNAME!=null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \r\n");
          out.write("            <a href=\"#\" target=\"_blank\" onclick=\"return false;\"><font size=\"2px\" color=\"black\">用户：");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${USERNAME}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</font></a>\r\n");
          out.write("            &nbsp;&nbsp;|\r\n");
          out.write("            <a href=\"QuitSession\" target=\"_blank\"><font size=\"2px\" color=\"black\">退出</font></a>\r\n");
          out.write("           ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /index.jsp(96,28) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/index.jsp(96,28) '${KEY }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${KEY }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /index.jsp(96,28) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("k");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("        \t<a href=\"SerchResult?key=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${k.keyword }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" target=\"_blank\"><font color=\"red\" size=\"2px\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${k.keyword }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</font></a>&nbsp;&nbsp;\r\n");
            out.write("        \t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f1_reused = false;
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent(null);
      // /index.jsp(109,16) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/index.jsp(109,16) '${LISTC }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${LISTC }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /index.jsp(109,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("listc");
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                <li><a href=\"ShowDetail?id=commends&name=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listc.comname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listc.comname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a></li>\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
      _jspx_th_c_005fforEach_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f2_reused = false;
    try {
      _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f2.setParent(null);
      // /index.jsp(120,21) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/index.jsp(120,21) '${LISTPO }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${LISTPO }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /index.jsp(120,21) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f2.setVar("listpo");
      int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
        if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    \t<li><a href=\"ShowDetail?id=policys&name=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listpo.polname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listpo.polname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a></li>\r\n");
            out.write("                    \t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
      _jspx_th_c_005fforEach_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f3_reused = false;
    try {
      _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f3.setParent(null);
      // /index.jsp(166,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/index.jsp(166,1) '${LISTPI }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${LISTPI }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /index.jsp(166,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f3.setVar("listpi");
      int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
        if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t    <li>\r\n");
            out.write("\t\t\t<a href=\"#\" onclick=\"return false\"><img src=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listpi.picaddress }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"/></a>\r\n");
            out.write("\t\t\t<span>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listpi.picname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span>\r\n");
            out.write("\t\t</li>\t\r\n");
            out.write("\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f3.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
      _jspx_th_c_005fforEach_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f3_reused);
    }
    return false;
  }
}
