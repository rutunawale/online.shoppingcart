package com.niit.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingbackend.dao.ProductDAO;
import com.niit.shoppingbackend.dto.Product;

public class ProductTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	
	private static ProductDAO productDAO;
	
	
	
	private Product product;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingbackend");
		context.refresh();
		productDAO = (ProductDAO)context.getBean("productDAO");
		
	}
//	@Test
//	public void testCRUDProduct()  {
//		
//		//create operation
//		product = new Product();
//		
//		product.setName("oppo selfie S53");
//		product.setBrand("oppo");
//		product.setDescription("This is some description for oopo mobile phones!");
//		product.setUnitPrice(250000);
//		product.setActive(true);
//		product.setCategoryID(3);
//		product.setSupplierId(3);
//		
//		assertEquals("something went wrong while inserting a new product!",
//				  true,productDAO.add(product));
//		
//		
//		//reading and updating the category
//		product = productDAO.get(2);
//		product.setName("Samsung Galaxy s7 ");
//		assertEquals("Something went wrong while updating the existing record!",
//				 true,productDAO.update(product));
//		
//		assertEquals("Something went wrong while deleting the existhing record!",
//				 true,productDAO.delete(product));
//		
//		
//		//list
//		assertEquals("Something went wrong while fetching the list of products!",
//				6,productDAO.list().size());
//		
//		
//		
//	}

@Test
public void testListActiveProductsByCategory() {
	assertEquals("Something went wrong while fetching the list of products!",
			1,productDAO.listActiveProductsByCategory(3).size());
}
	
//@Test
//public void testListActiveProductsBycategory() {
//	assertEquals("Something went wrong while fetching the list of products!",
//			1,productDAO.ListActiveProductsByCategory(3).size());
//
//}
/*@Test
public void testGetlatestActiveProduct() {
	assertEquals("Something went wrong while fetching the list of products!",
			1,productDAO.getLatestActiveProducts(1).size());
}
	*/
	
	
	
	
	
}
