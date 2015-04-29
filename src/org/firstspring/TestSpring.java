package org.firstspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringConfig.xml");

		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean");
		restaurant.setName("Akhil");
		restaurant.welcomeCustomer();

		// bean scope(singleton, prototype)
		Restaurant restaurant1 = (Restaurant) context.getBean("restaurantBean");
		// restaurant1.setName("Akhil");
		restaurant1.welcomeCustomer();

		// Dependency Injection with a Setter property
		restaurant.prepareTea();

		// Dependency Injection with a Collection property
		Waiters waiters = (Waiters) context.getBean("waiterBean");
		waiters.displayWaiterName();
	}

}
