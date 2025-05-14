<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="ARTICLE MODIFY"></c:set>
<%@ include file="../common/head.jspf"%>


<section class="mt-8 text-xl px-4">
	<div class="mx-auto">
		<form action="../article/doWrite" method="POST">
			<table border="1" cellspacing="0" cellpadding="5" style="width: 100%; border-collapse: collapse;">



				<tbody>

					<tr>
						<th style="text-align: center;">게시판</th>
						<td style="text-align: center;">
							<select name="boardId">
								<option value="" selected disabled>게시판을 선택해주세요</option>
								<option value="1">공지사항</option>
								<option value="2">자유</option>
								<option value="3">QnA</option>
							</select>
						</td>
					</tr>
					<tr>
						<th style="text-align: center;">Writer</th>
						<td style="text-align: center;">${article.extra__writer}</td>
					</tr>
					<tr>
						<th>제목</th>
						<td style="text-align: center;">
							<input name="title" autocomplete="off" type="text" placeholder="제목" />
						</td>
					</tr>
					<tr>
						<th>내용</th>
						<td style="text-align: center;">
							<textarea name="body" autocomplete="off" placeholder="내용"></textarea>
						</td>
					</tr>

					<tr>
						<th></th>
						<td style="text-align: center;">
							<input value="글쓰기" type="submit" />
						</td>
					</tr>

				</tbody>
			</table>
		</form>
		<div class="btns">
			<button type="button" onclick="history.back();">뒤로가기</button>

		</div>
	</div>
</section>



<%@ include file="../common/foot.jspf"%>