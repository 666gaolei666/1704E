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
		//下拉框
		$.post("xiala.do",function(obj){
			for ( var i in obj) {
				$("select").append("<option value='"+obj[i].lid+"'>"+obj[i].lname+"</option>")
			}
		},"json")
		//回显
		$.post("show.do",{"zid":$("#zid").val()},function(obj){
			$("#zname").val(obj.zname)
			$("#zmiao").val(obj.zmiao)
			$("#lid option[value='"+obj.lei.lid+"']").attr({"selected":true})
		},"json")
		//返回
		$("input[value='返回']").click(function(){
			location = "list.do"
		})
	})
</script>
</head>
<body>
	<h1 style="text-align: center;font-size: 30px">欢迎来到查看页面</h1>
	<form>
		<table>
			<tr>
				<td>植物名称</td>
				<td>
					<input type="hidden" name="zid" id="zid" value="${param.zid }">
					<input type="text" name="zname" id="zname">
				</td>
			</tr>
			<tr>
				<td>描述</td>
				<td>
					<input type="text" name="zmiao" id="zmiao">
				</td>
			</tr>
			<tr>
				<td>类别</td>
				<td>
					<select name="lei.lid" id="lid">
						<option>请选择</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="10">
					<input type="button" value="返回">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>