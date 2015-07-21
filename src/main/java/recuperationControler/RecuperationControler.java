package recuperationControler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RecuperationControler {

	public RecuperationControler() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 ApplicationContext context = 
	             new ClassPathXmlApplicationContext("beans.xml");
		 App app = (App) context.getBean("Application");
		 app.run();


	}

}
