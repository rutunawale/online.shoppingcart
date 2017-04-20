package com.niit.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shoppingbackend.dao.CategoryDAO;
import com.niit.shoppingbackend.dto.Category;

@Repository ("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	
	
	static {
		   
		  Category category = new Category();
		  
		  // adding first category
		   category.setId(1);
		   category.setName("womens");
		   category.setDescription("This is some description for womens !");
		   category.setImageURL("CAT_1.png");
		   
		   categories.add(category);
		   
		   //second category
		   
		     category = new Category();
		       category.setId(2);
			   category.setName("Mens");
			   category.setDescription("This is some description for Mens!");
			   category.setImageURL("CAT_2.png");
			   
			   categories.add(category);
			   
			 //  third category
			   
			   category = new Category();
		       category.setId(1);
			   category.setName("kids");
			   category.setDescription("This is some description for kids !");
			   category.setImageURL("CAT_3.png");
			   
			   categories.add(category);
			   
		   
	}
	
	
	
	
	

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
