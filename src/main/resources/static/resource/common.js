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
		// 		setTimeout(ArticleDetail__doIncreaseHitCount, 2000);
	})
	