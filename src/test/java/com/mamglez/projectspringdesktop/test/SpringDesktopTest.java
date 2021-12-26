/**
 * 
 */
package com.mamglez.projectspringdesktop.test;

import static org.junit.Assert.assertNotNull;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mamglez.projectspringdesktop.dao.DisqueraDAO;
import com.mamglez.projectspringdesktop.dao.impl.DisqueraDAOImpl;

/**
 * @author skype
 *
 */
class SpringDesktopTest {

	@Test
	void testContext() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		assertNotNull(context);
		DisqueraDAO disqueraDAO = (DisqueraDAO) context.getBean("disqueraDAO");
		assertNotNull(disqueraDAO);
		
		DisqueraDAO disqueraDAONueva = (DisqueraDAO) context.getBean("disqueraDAO");
		
		DisqueraDAO dis = new DisqueraDAOImpl();
		System.out.println("contexto cargado.");
		System.out.println(disqueraDAO);
		System.out.println(disqueraDAONueva);
		System.out.println(dis);
		
		//properties
		Properties properties = (Properties) context.getBean("properties");
		System.out.println(properties.get("spring-username"));
	}

}
