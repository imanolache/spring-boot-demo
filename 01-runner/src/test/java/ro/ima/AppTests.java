package ro.ima;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
public class AppTests {
	
	@Autowired
	ApplicationContext ctx;

	@Test
	public void textContextLoads() {
		assertNotNull(this.ctx);
	}

	@Test
	public void testBeans() {
		assertTrue(this.ctx.containsBean("app"));
		assertTrue(this.ctx.containsBean("appRunner"));
	}

}
