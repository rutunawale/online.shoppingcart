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
			/*if(menu == "Home") break;*/
			
			$('#listProduct').addClass('active');
	        $('#a_' + menu).addClass('active');
		break;
		
	
	
	
	}
	
	//code for jquery dataTable
	//create a dataset
	/*var product = [
	                ['1','ABC'],
	                ['2','hyd'],
	                ['3','gfy'],
	                ['4','loh'],
	                ['5','poy'],
	                ['6','rty'],
	                ['7','rty'],
	                ['8','tyd'],
	               
	               ]
	*/
	
	var $table = $('#productListTable');
	//execute the below code only where we have this table
	
	
	if($table.length){
		//console.log('Inside the table!');
		console.log($table);
		var jsonUrl = '';
		if(window.categoryId == ''){
			jsonUrl = window.contextRoot + '/json/data/all/product';
		}
		else{
			jsonUrl = window.contextRoot + '/json/data/category/'+ window.categoryId + '/product';
		}	
		
		
		console.log(window.categoryId);
		
		$table.DataTable( {
		
		
			
			
			lengthMenu: [[3,5,10,-1],['3 Records', '5 Records','10 Records','ALL']],
			pageLength: 5,
			ajax: {
			url:jsonUrl,
			dataSrc: ''
	
			},
		
		columns: [
		         
		          {
		        	  data:'name'
		          },
		          
		          {
		        	  data:'brand'
		          },
		          {
		        	  data:'unitPrice',
		        	  mRender: function(data, type, row) {
		        		  return '&#8377; ' + data
		        	  }
		          },
		          {
		        	  data:'quantity'
		          },
		          {
		        	  data:'id',
		        	  bSortable:false,
		        	  mRender: function(data, type, row) {
		        		  
		        		  var str = '';
		        		  str += '<a href="'+window.contextRoot+ '/show/'+data+'/product" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a> &#160;';
		        		  str += '<a href="'+window.contextRoot+ '/cart/add/'+data+'/product" class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></span></a>';
		        		  return str;
		        	  }
		          }
		          
		          
		          ]
		
		
		
		
		
			
		});
		
		}
	
	
	
	
	//
	
	
	
	});
		
	
	
	
	




