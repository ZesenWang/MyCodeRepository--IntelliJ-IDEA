<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css" />
<script src="bootstrap-3.3.7-dist/jquery-3.1.1.min.js"></script>
<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<title>寒灯纸上书</title>
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
</head>

<body>
<!-- 导航条 -->
<div style="width:100%; height:60px;" >
	<jsp:include page="navbar.jsp" />  
</div>
<!-- 导航条 结束-->

<!--好书分享大标题开始-->
 <div class="page-header col-lg-4 col-lg-offset-4  col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2" style="clear:both;margin-top:10%;">
      <h1 style="color:#000;">我心中最特别的临安</h1>
      <p style="text-indent:80px;"><small style="color: #333;font-size:20px;">一百个读者有一百个哈姆雷特，一百个人有一百种临安</small>
      <button type="button" class="btn btn-primary" style="text-indent:0px;opacity:0.8;
filter:alpha(opacity=40);">点击上传</button><small style="color: #333;font-size:20px;">你的临安故事</small>
      </p>
</div>
<!--好书分享大标题结束-->

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
      <h4 class="media-heading">我的临安资源</h4>
<span style="font-size:18px">故事简介（200字左右）</span></br><p style="text-indent:50px;min-height:200px; overflow-x:auto">临安矿产资源丰富，著名的是昌化鸡血石。境内矿产资源有30余种，分四大类：金属矿有钨、铍、锑、铅、锌、钼、锰、铁、镍、铜、铌（钽）铁、独居石和金矿；非金属矿有膨润土、萤石、重晶石、鸡血石、白云石、石灰石、磷、花岗岩、方解石、高岭土矿等；燃料矿有烟煤、沥青煤和石煤等；天然矿泉水主要分布在湍口镇湍口村（温泉）和青山湖街道研里村。除钨、膨润土、萤石、石灰石和鸡血石外，其余矿床品位欠佳或储量较少，开采价值较低。</br>
<a href="UserStoryDetailed.jsp"><button class="btn btn-info btn-sm pull-right" type="submit" style="opacity:0.8;filter:alpha(opacity=40);">详细故事内容</button></a>
</p>
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
      <h4 class="media-heading">临安植物资源</h4>
<span style="font-size:18px">故事简介（200字左右）</span><p style="text-indent:50px;min-height:200px; overflow-x:auto">植物资源
临安市有国家一级保护植物5种：银杏（银杏科）、天目铁木（桦木科）、南方红豆杉（红豆杉科）、银缕梅（金缕梅科）、中华水韭（水韭科）；国家二级保护植物22种：金钱松（松科）、华东黄杉（松科）、羊角槭（槭树科）、七子花（忍冬科）、连香树（连香树科）、樟树（樟科）、浙江楠（樟科）、野大豆（豆科）、鹅掌楸（木兰科）、凹叶厚朴（木兰科）、厚朴（木兰科）、香果树（茜草科）、黄山梅（虎耳草科）、长序榆（榆科）、榉树（榆科）、榧（红豆杉科）、台湾水青冈（壳斗科）、长叶榧（红豆杉科）、花榈木（豆科）、秤锤树（安息香科）、野菱（菱科）、金荞麦（蓼科）。</p>
<a href="UserStoryDetailed.jsp"><button class="btn btn-info btn-sm pull-right" type="submit" style="opacity:0.8;filter:alpha(opacity=40);">详细故事内容</button></a>
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
      <h4 class="media-heading">我的家乡临安</h4>
<span style="font-size:18px">故事简介（200字左右）</span><p style="text-indent:50px;min-height:200px; overflow-x:auto">在我的家乡临安，一条日夜流淌着的河将南北两岸的临安人联系在了一起，这就是苕溪河。    <br />
春天，苕溪两岸开满了纯洁淡雅的樱花，微风拂过，片片花瓣当到水平如镜的河面上，便打破了苕溪的沉寂。比起羞涩的樱花，迎春倒是开得热烈，开得豪放，金黄的迎春在碧绿的树叶中，格外显眼，不时传来阵阵芳香。再看迎春花丛后面，那些红色的小花不正是腊梅吗？尽管冬天过去了，它们还是坚强得开放着，这火红的颜色似乎能沁出血来，给光秃秃的枝干上添上了一抹生机，用毛主席的《卜算子·咏梅》来形容这些梅花是再适合不过的了。“一行白鹭上青天”，果然不错，苕溪河上空，时不时会飞来一些白鹭，那些白鹭有的展翅高飞；有的平稳地降落在笤溪的石头上捕鱼吃；还有的站在石头上悠闲地四处张望。 <br />
早晨，一些爷爷奶奶很早就起来在苕溪边做运动了。瞧，他们有的在三五成群地散步；有的在健身器材上做着运动；还有的在苕溪附近打太极，别看他们头发已经雪白了，但身体硬朗着呢！溪边的马路上，那可亲可敬的父母们，也即将开始全新的一天：有的开着那帅气的宝马急着上班去；有的骑着自行车送孩子上学去，构成了一幅温馨的画面，使苕溪又添加了一道亮丽的风景。</p>
<a href="UserStoryDetailed.jsp"><button class="btn btn-info btn-sm pull-right" type="submit" style="opacity:0.8;filter:alpha(opacity=40);">详细故事内容</button></a>
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
