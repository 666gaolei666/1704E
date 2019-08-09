<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index_work.css">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function(){
		//全选
		$("input[name='chackall']").click(function(){
			$("input[name='zid']").each(function(){
				this.checked = true;
			})
		})

		//添加
		$("input[value='添加']").click(function(){
			location = "add.do"
		})

		//查看
		$("input[value='查看']").click(function(){
			var zid = $(this).prev().val()
			location = "look.do?zid="+zid
		})

		//修改
		$("input[value='修改']").click(function(){
			var zid = $(this).prev().prev().val()
			location = "update.do?zid="+zid
		})

		//批量删除
		$("input[value='批量删除']").click(function(){
			var ids = "";
			$("[name=check]:checked").each(function(){
				ids +=","+this.value;
			})
			ids = ids.substring(1)
			alert(ids)
			if(confirm("确定要删除"+ids+"吗")){
				$.post("pldel.do",{"ids":ids},function(flag){
					if(flag){
						alert("删除成功")
						location = "list.do"
					}else{
						alert("删除失败")
					}
				},"json")
			}
		})

		//删除
		$("input[value='删除']").click(function(){
			var zid = $(this).prev().prev().prev().val()
			$.post("del.do",{"zid":zid},function(flag){
				if(flag){
					alert("删除成功")
					location = "list.do"
				}else{
					alert("登录失败")
				}
			},"json")
		})
	})
</script>
</head>
<body>
	<table>
		<tr>
			<td>
				<input type="button" value="添加">
			</td>
			<td colspan="10">
				<form action="list.do" method="post">
					查询内容&nbsp;<input type="text" name="name" value="${zv.name }">
					<input type="submit" value="搜索">
				</form>
			</td>
		</tr>
		<tr>
			<th>
				<input type="checkbox" name="chackall">全选
			</th>
			<th>序号</th>
			<th>植物名称</th>
			<th>描述</th>
			<th>类别</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${list }" var="b" varStatus="count">
			<tr>
				<td>
					<input type="checkbox" name="check" id="zid" value="${b.zid }">
				</td>
				<td>${count.count }</td>
				<td>${b.zname }</td>
				<td>${b.zmiao }</td>
				<td>${b.lei.lname }</td>
				<td>
					<input type="hidden" name="zid" id="zid" value="${b.zid }">
					<input type="button" value="查看">
					<input type="button" value="修改">
					<input type="button" value="删除">
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td>
				<input type="button" value="批量删除">
			</td>
			<td colspan="10">
<%-- 				<a href="list.do?pageNum=${pageInfo.firstPage }">首页</a> --%>
<%-- 				<a href="list.do?pageNum=${pageInfo.prePage }">上一页</a> --%>
<%-- 				<a href="list.do?pageNum=${pageInfo.nextPage }">下一页</a> --%>
<%-- 				<a href="list.do?pageNum=${pageInfo.lastPage }">尾页</a> --%>
<%-- 				当前是第${pageInfo.pageNum}页&nbsp;共${pageInfo.pages}页&nbsp;共${pageInfo.total}条记录 --%>

					${page }
			</td>
		</tr>
	</table>
</body>
</html>