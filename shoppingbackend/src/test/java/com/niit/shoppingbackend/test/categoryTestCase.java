package com.niit.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingbackend.dao.CategoryDAO;
import com.niit.shoppingbackend.dto.Category;

public class categoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	
	@BeforeClass
	
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingbackend");
		context.refresh();

		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		
		
		
	}
	
//	@Test
//	public void testAddCategory() {
//		
//		category=new Category();
//		
//		category.setName("women");
//		category.setDescription("This is some description for womens");
//		category.setImageURL("CAT_105.png");
//		
//		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
//		
//		
//	}
	
//	
	@Test
	public void testAddCategory() {		
		category=new Category();
		
	category.setName("Kids");
		category.setDescription("This is some description for Kids");
		category.setImageURL("CAT_105.png");		
	assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
		
	}
	
	
//	@Test
//	public void testAddCategory() {
//		
//		category=new Category();
//		
//		category.setName("Kids");
//	category.setDescription("This is some description for Kids");
//		category.setImageURL("CAT_105.png");
//		
//	assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
//	
//		
//	}
	
	
//	@Test
//	public void testAddCategory() {
//		
//		category=new Category();
//		
//		category.setName("baby");
//	category.setDescription("This is some description for Baby");
//		category.setImageURL("CAT_105.png");		
//	assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
//	
//		
//	}
	
	
//	@Test
//	public void testdeletecategory() {
//			category = categoryDAO.get(1);
//	
//	assertEquals("Successfully delete a single  category in side the table!",true,categoryDAO.delete(category));
//	
//	}
//	
	
	
//	
//	@Test
//	public void testListcategory() {
//	
//	assertEquals("Successfully fetched the list of categories from the table!",3,categoryDAO.list().size());
//	
//	}
	
//	
//	@Test
//	public void testCRUDCategory()  {
//		
//		category=new Category();
//		
//		category.setName("women");
//		category.setDescription("This is some description for womens");
//		category.setImageURL("CAT_1.png");
//		
//		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
//	
//       
//		
//		
//		category=new Category();
//		
//		category.setName("Men");
//		category.setDescription("This is some description for Men");
//		category.setImageURL("CAT_2.png");
//		
//		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
//	
//		
//		//fetching and updating the category
//		
//		category = categoryDAO.get(2);
//		
//		category.setName("womensware");
//	
//	assertEquals("Successfully update a single  category in side the table!",true,categoryDAO.update(category));
//	
//	
//	
//	//delete the category
//	assertEquals("Successfully delete a single  category in side the table!",true,categoryDAO.delete(category));
//			
//		
// //fetching the list
//	assertEquals("Successfully fetched the list of categories from the table!",5,categoryDAO.list().size());
//		
//		
//}
//	
	}	
	

	

	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
