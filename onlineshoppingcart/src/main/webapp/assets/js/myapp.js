$(function() {
	
	//solving the active menu problem
	switch(menu) {
	
	case 'About Us':
		$('#about').addClass('active');
		break;
		
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
		
		
	case 'All products':
		$('#listProduct').addClass('active');
		break;
		default:
			$('#listProduct').addClass('active');
		break;
		
	
	
	
	}
	
	
	
	
});


