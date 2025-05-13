<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="ARTICLE MODIFY"></c:set>
<%@ include file="../common/head.jspf"%>


<section class="mt-8 text-xl px-4">
	<div class="mx-auto">
		<form action="../member/doMofdify" method="POST">
			<table border="1" cellspacing="0" cellpadding="5" style="width: 100%; border-collapse: collapse;">
				<tbody>
					<tr>
						<th>제목</th>
						<td style="text-align: center;">
							<input name="title" autocomplete="off" type="text" placeholder="제목" />
						</td>
					</tr>
					<tr>
						<th>내용</th>
						<td style="text-align: center;">
							<textarea name="body" autocomplete="off" type="text" placeholder="내용" />
						</td>
					</tr>

					<tr>
						<th></th>
						<td style="text-align: center;">
							<input value="수정" type="submit" />
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