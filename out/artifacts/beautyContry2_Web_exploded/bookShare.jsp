<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css" />
<script src="bootstrap-3.3.7-dist/jquery-3.1.1.min.js"></script>
<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<!-- include the RTL css files-->
<link rel="stylesheet" href="alertify.js-0.3.11/themes/alertify.core.css">
<link rel="stylesheet" href="alertify.js-0.3.11/themes/alertify.default.css">

<!-- include alertify script -->
<script src="alertify.js-0.3.11/lib/alertify.min.js"></script>
<title>笔墨相处啊</title>
<style type="text/css">
body{
	background-image:url(picture/6.jpg);
	background-size:cover;
	background-attachment: fixed;
	width:100%;
	height:100%;
    background-repeat:no-repeat;
}
.footer{
	clear:both;
	margin-top:5%;
	background:#222;
	height: 60px;
	width: 100%;
	left: 0px;
    bottom: 0px;
	}
</style>
<script type="text/javascript">

$(function () {
  $('[data-toggle="popover"]').popover()
})
	
$(function (){
	$("#uploadBookButton").click(function (e) {
		$('#uploadBook').modal('show');
          alertify.alert("待会儿分享完之后记得要刷新重新进入此页面才能看见刚刚上传的内容哦~~~" ); //alertify中点击确定后的函数结束		
 
	});
})

$(function (){
	$("#submitBook").click(function (e) {
		alert("分享完之后记得要刷新重新进入此页面才能看见刚刚上传的内容哦~~~");
	});
})
	
	
</script>

</head>

<body>
<!-- 导航条 -->
<div style="width:100%; height:60px;" >
	<jsp:include page="navbar.jsp" />  
</div>
<!-- 导航条 结束-->

<!--好书分享大标题开始-->
 <div class="page-header col-lg-4 col-lg-offset-4  col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2" style="clear:both;margin-top:10%;">
      <h1 style="color:#000;">墨香依旧，笔墨相传</h1>
      <p style="text-indent:80px;"><small style="color: #333;font-size:20px;">书中的临安是否如眼前的泉水般凛冽</small>
      <button type="button" class="btn btn-primary" style="text-indent:0px;opacity:0.8;
filter:alpha(opacity=40);"id="uploadBookButton">点击上传分享</button>
      </p>

</div>
<!--好书分享大标题结束 data-toggle="modal" data-target="#uploadBook" -->

<!--好书分享上传模态框开始-->
<div class="modal fade" id="uploadBook" tabindex="-1" role="dialog" aria-labelledby="gridSystemModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="uploadModelLabel">好书分享楼</h4>
      </div>
      
      <div class="modal-body">
             <form class="form-horizontal" id="edit_form">  
                 <h3 class="form-title" style="text-align:center">分享内容上传</h3> <br /> 
                 
                    <div class="" style="margin-left:20px; margin-right:20px;">  
                            <div class="form-group">  
                                <i class="fa fa-user fa-lg"></i>  
                                用户名称：<input class="form-control required" type="text" placeholder="Username" name="username" autofocus="autofocus" maxlength="20" style="padding-left:26px;"/>  
                            </div>  
                            <br />
                            
                            <div class="form-group">  
                                    <i class="fa fa-lock fa-lg"></i>  
                                    分享书名：<input class="form-control required" type="text" placeholder="bookName" name="bookName" autofocus="autofocus" maxlength="30" style="padding-left:26px;"/>    
                            </div>  
                            
                            <div class="form-group">  
                                     分享内容：<textarea class="form-control"  style="height:200px; overflow-x:auto" placeholder="在这里写下这本书值得推荐的理由或者简短简述你读完这本书的感悟，不要超过1000字哦~~~"></textarea>
                                    </div>  
                
                        </div>  <!--calss=""结束-->
                    </form>   <!--好书上传表单结束--> 
      </div>
      
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="submit" class="btn btn-primary" id="submitBook" data-dismiss="modal" >确定上传</button>
      </div>
      
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<!--好书分享上传模态框结束-->

<!--页面左半边已上传的好书介绍文字显示开始-->
<div class="left col-sm-7 col-sm-offset-1 col-xs-12">
<ul class="media-list">
<!--第一个li-->
  <li class="media" style="margin-bottom:100px;">
    <div class="media-left">
       <a href="#">
        <img class="media-object img-thumbnail" style="height:120px;width:120px;"src="picture\shuomo.jpg" alt="...">
      </a>
       <p style="text-align:center; font-size:16px;">清风自来</p>
    </div>
    <div class="media-body">
      <h4 class="media-heading">《临安文化志》</h4>
<p style="text-indent:50px;min-height:200px; overflow-x:auto">作　　者：《临安市文化志》编纂委员会 编出 <br />
版 社：方志出版社<br />
出版时间：2008-10-1<br />
自东汉史学家班固首创中国“文化志”（《汉书·艺文志》后，历代方志亦取其体，设置“艺文篇（卷）”。清人傅玉露总纂《浙江通，志》，凡208卷，平列门类54个，“艺文”为其一。当今，盛世修志，志苑中各种地方志、专业志宛若雨后春笋、烂漫山花，在经济社会发展中，发挥着“存史、资治、教化”功能。所观当代方志，一般多传承旧体，在其中设“文化编”以记述文化发展脉络和成果，并辅以“丛录”，收入具重要历史价值的艺文。而专以一域之人文历史和文化建设而成志，尚属罕见。临安市文化行政主管部门在市委、市政府支持下，艰辛劳作逾四年，编成《临安市文化，勘，洋洋48万言，上自秦汉置县，下迄改革开放，通贯二千余年，将临安文化发展史迹粹集一书，纵横兼备，图文并茂，实为一大功德无量的美举。</p>
    </div>
  </li>
  
  
  <!--第二个li-->
  <li class="media" style="margin-bottom:100px;">
    <div class="media-left">
   <a href="#">
        <img class="media-object img-thumbnail" style="height:120px;width:120px;"src="picture\shuomo.jpg" alt="...">
      </a>
       <p style="text-align:center; font-size:16px;">清风自来</p>
    </div>
    <div class="media-body">
      <h4 class="media-heading">《南宋史研究丛书·南宋与杭州:南宋临安文化》</h4>
<p style="text-indent:50px;min-height:200px; overflow-x:auto">出版社: 杭州出版社; <br />
第1版 (2010年12月1日)<br />
丛书名: 浙江文化研究工程成果文库<br />
《南宋史研究丛书·南宋与杭州:南宋临安文化》以临安三志为基础，以翔实的史料，介绍了南宋都城临安的各类文化情况及其成就。全书分朝廷的文化机关——秘书省、南宋朝廷的图书馆、朝廷的天文、医药机构、国子监与三学、朝廷的修史机构、朝廷的架阁档案、朝廷乐舞机构、临安籍的科技文化名家、临安的餐饮文化、临安的西湖与游乐、临安的文化娱乐、临安的体育与杂技、临安的道教、临安的佛寺、临安的祠庙、临安地方文献等篇章。</p>
    </div>
  </li>
  
  <!--第三个li-->
  <li class="media" style="margin-bottom:100px;">
    <div class="media-left">
    <a href="#">
        <img class="media-object img-thumbnail" style="height:120px;width:120px;"src="picture\shuomo.jpg" alt="...">
      </a>
       <p style="text-align:center; font-size:16px;">清风自来</p>
    </div>
    <div class="media-body">
      <h4 class="media-heading">《南宋名人与临安》</h4>
<p style="text-indent:50px;min-height:200px; overflow-x:auto">出版社: 杭州出版社;<br />
第1版 (2010年12月1日)<br />
丛书名: 南宋史研究丛书<br />
《南宋名人与临安》是一部关于南宋名人与临安的书。南宋、临安、名人，构成了《南宋名人与临安》的三个关键词。《南宋名人与临安》以《南宋名人与临安》为题，固然要尽可能考订人物生平及其与临安的种种关系，但除此之外，笔者更希望将人物还原到复杂的历史过程中，尽可能对相关背景做出细致的描述，这种宽泛呈现（不可能做到全景呈现）的企图，或许能方便我们更真切地体会人物的命运和都市的发展。</p>
    </div>
  </li>
  
</ul>

</div>
<!--页面左半边已上传的好书介绍文字显示结束-->

<!--用户上传须知开始-->
   <div class="col-sm-3 col-sm-offset-1 hidden-xs blog-sidebar" style="background:#999;">
          <div class="sidebar-module sidebar-module-inset">
            <h4>About</h4>
            <p>Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.</p>
          </div>
          
            <button type="button" class="btn btn-primary" style="text-indent:0px;opacity:0.8;
filter:alpha(opacity=40);" data-toggle="modal" data-target="#uploadBook">点击上传你的分享1</button>    
  </div>        
          
   <div class="col-sm-3 col-sm-offset-1 hidden-xs sidebar-module" style="margin-top:150px;">
            <h4>Archives</h4>
            <ol class="list-unstyled">
              <li><a href="#">March 2014</a></li>
              <li><a href="#">February 2014</a></li>
              <li><a href="#">January 2014</a></li>
              <li><a href="#">December 2013</a></li>
              <li><a href="#">November 2013</a></li>
              <li><a href="#">October 2013</a></li>
              <li><a href="#">September 2013</a></li>
              <li><a href="#">August 2013</a></li>
              <li><a href="#">July 2013</a></li>
              <li><a href="#">June 2013</a></li>
              <li><a href="#">May 2013</a></li>
              <li><a href="#">April 2013</a></li>
            </ol>
   </div>    
<!--用户上传须知结束-->
<!--首页末页开始-->
<nav aria-label="..." style="clear:both;">
  <ul class="pager">
    <li><a href="#">首页</a></li>
    <li><a href="#">前一页</a></li>
    <li><a href="#">后一页</a></li>
    <li><a href="#">末页</a></li>
  </ul>
</nav>
<!--首页末页结束-->
<!-- 页脚开始-->
<div class="footer">
	<jsp:include page="footer.jsp" />  
 </div>
<!-- 页脚结束-->
</body>
</html>
