<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="ARTICLE LIST"></c:set>
<%@ include file="../common/head.jspf"%>

<section class="mt-8 text-xl px-4">


	<div class="mx-auto flex flex-col w-full h-full">
		<table border="1" cellspacing="0" cellpadding="5" style="width: 100%; border-collapse: collapse;">

			<thead>
				<tr>
					<th style="text-align: center;">BOARD</th>
					<th style="text-align: center;">ID</th>
					<th style="text-align: center;">Registration Date</th>
					<th style="text-align: center;">Title</th>
					<th style="text-align: center;">Writer</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="article" items="${articles}">
					<tr>
						<td style="text-align: center;">${article.extra__board}</td>
						<td style="text-align: center;">${article.id}</td>
						<td style="text-align: center;">${article.regDate.substring(0,10)}</td>
						<td style="text-align: center;">
							<a class="hover:underline" href="detail?id=${article.id}">${article.title }</a>
						</td>
						<td style="text-align: center;">${article.extra__writer }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="mx-auto w-full flex flex-col">
			<c:if test="${empty articles }">
				<div class="flex bg-indigo-500 w-full text-center h-40 justify-center align-center">
					<tr>
						<td style="text-align: center;">해당 게시글은 존재하지않습니다</td>
					</tr>
				</div>
			</c:if>
			<c:if test="${empty articles==false}">
				<c:forEach var="Page" begin="1" end="${totalBdPage}" step="1">
					<a href="list?boardId=${board.id}&page=${Page}">${Page}</a>
				</c:forEach>
			</c:if>
		</div>
	</div>
</section>
<div class="mx-auto flex">
	<div class="mx-auto">
		<%@ include file="../common/reserch.jspf"%>
	</div>
</div>

<%@ include file="../common/foot.jspf"%>