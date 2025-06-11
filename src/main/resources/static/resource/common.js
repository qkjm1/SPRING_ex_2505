$('select[data-value]').each(function(index, el) {
	const $el = $(el);

	defaultValue = $el.attr('data-value').trim();

	if (defaultValue.length > 0) {
		$el.val(defaultValue);
	}
});



const params = {};
params.memberId = parseInt('${param.memberId }');
params.articleId = parseInt('${param.articleId }');

function ArticleDetail__doIncreaseHeartCount() {
	$.get('../article/doIncHeartCountRd', {
		id: params.id,
		ajaxMode: 'Y'
	}, function(data) {
		console.log(data);
		console.log(data.data1);
		console.log(data.msg);
		$('.article-detail__article').html(data.data1);
	}, 'json');
}

$(function() {
	ArticleDetail__doIncreaseHeartCount();
})





function checkRP() {
	if (isAlreadyAddGoodRp == true) {
		$('#likeButton').toggleClass('btn-outline');
	} else if (isAlreadyAddBadRp == true) {
		$('#DislikeButton').toggleClass('btn-outline');
	} else {
		return;
	}
}

function doGoodReaction(articleId) {

	$.ajax({
		url: '/usr/reactionPoint/doGoodReaction',
		type: 'POST',
		data: {
			relTypeCode: 'article',
			relId: articleId
		},
		dataType: 'json',
		success: function(data) {
			console.log(data);
			console.log('data.data1Name : ' + data.data1Name);
			console.log('data.data1 : ' + data.data1);
			console.log('data.data2Name : ' + data.data2Name);
			console.log('data.data2 : ' + data.data2);
			if (data.resultCode.startsWith('S-')) {
				var likeButton = $('#likeButton');
				var likeCount = $('#likeCount');
				var likeCountC = $('.likeCount');
				var DislikeButton = $('#DislikeButton');
				var DislikeCount = $('#DislikeCount');
				var DislikeCountC = $('.DislikeCount');

				if (data.resultCode == 'S-1') {
					likeButton.toggleClass('btn-outline');
					likeCount.text(data.data1);
					likeCountC.text(data.data1);
				} else if (data.resultCode == 'S-2') {
					DislikeButton.toggleClass('btn-outline');
					DislikeCount.text(data.data2);
					DislikeCountC.text(data.data2);
					likeButton.toggleClass('btn-outline');
					likeCount.text(data.data1);
					likeCountC.text(data.data1);
				} else {
					likeButton.toggleClass('btn-outline');
					likeCount.text(data.data1);
					likeCountC.text(data.data1);
				}

			} else {
				alert(data.msg);
			}

		},
		error: function(jqXHR, textStatus, errorThrown) {
			alert('좋아요 오류 발생 : ' + textStatus);

		}

	});
}





function doBadReaction(articleId) {

	$.ajax({
		url: '/usr/reactionPoint/doBadReaction',
		type: 'POST',
		data: {
			relTypeCode: 'article',
			relId: articleId
		},
		dataType: 'json',
		success: function(data) {
			console.log(data);
			console.log('data.data1Name : ' + data.data1Name);
			console.log('data.data1 : ' + data.data1);
			console.log('data.data2Name : ' + data.data2Name);
			console.log('data.data2 : ' + data.data2);
			if (data.resultCode.startsWith('S-')) {
				var likeButton = $('#likeButton');
				var likeCount = $('#likeCount');
				var likeCountC = $('.likeCount');
				var DislikeButton = $('#DislikeButton');
				var DislikeCount = $('#DislikeCount');
				var DislikeCountC = $('.DislikeCount');

				if (data.resultCode == 'S-1') {
					DislikeButton.toggleClass('btn-outline');
					DislikeCount.text(data.data2);
					DislikeCountC.text(data.data2);
				} else if (data.resultCode == 'S-2') {
					likeButton.toggleClass('btn-outline');
					likeCount.text(data.data1);
					likeCountC.text(data.data1);
					DislikeButton.toggleClass('btn-outline');
					DislikeCount.text(data.data2);
					DislikeCountC.text(data.data2);

				} else {
					DislikeButton.toggleClass('btn-outline');
					DislikeCount.text(data.data2);
					DislikeCountC.text(data.data2);
				}

			} else {
				alert(data.msg);
			}
		},
		error: function(jqXHR, textStatus, errorThrown) {
			alert('싫어요 오류 발생 : ' + textStatus);
		}

	});
}


function doBadReaction(articleId) {

	$.ajax({
		url: '/usr/rpley/doReplyAction',
		type: 'POST',
		data: {
			relTypeCode: 'article',
			relId: articleId
		},
		dataType: 'json',
		success: function(data) {
			console.log(data);
			console.log('data.data1Name : ' + data.data1Name);
			console.log('data.data1 : ' + data.data1);
			console.log('data.data2Name : ' + data.data2Name);
			console.log('data.data2 : ' + data.data2);
			if (data.resultCode.startsWith('S-')) {
				var likeButton = $('#likeButton');
				var likeCount = $('#likeCount');
				var likeCountC = $('.likeCount');
				var DislikeButton = $('#DislikeButton');
				var DislikeCount = $('#DislikeCount');
				var DislikeCountC = $('.DislikeCount');

				if (data.resultCode == 'S-1') {
					DislikeButton.toggleClass('btn-outline');
					DislikeCount.text(data.data2);
					DislikeCountC.text(data.data2);
				} else if (data.resultCode == 'S-2') {
					likeButton.toggleClass('btn-outline');
					likeCount.text(data.data1);
					likeCountC.text(data.data1);
					DislikeButton.toggleClass('btn-outline');
					DislikeCount.text(data.data2);
					DislikeCountC.text(data.data2);

				} else {
					DislikeButton.toggleClass('btn-outline');
					DislikeCount.text(data.data2);
					DislikeCountC.text(data.data2);
				}

			} else {
				alert(data.msg);
			}
		},
		error: function(jqXHR, textStatus, errorThrown) {
			alert('싫어요 오류 발생 : ' + textStatus);
		}

	});
}

