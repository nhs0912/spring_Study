package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.DataBean;
import kr.co.softcampus.beans.TestBean;
import kr.co.softcampus.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------------t1------------------------");
		TestBean t1 = new TestBean();
		t1.printData();	
		
		
		System.out.println("----------------------t2------------------------");
		TestBean t2 = new TestBean(100);
		t2.printData();
		
		System.out.println("----------------------t3------------------------");
		TestBean t3 = new TestBean(12.34);
		t3.printData();
		
		System.out.println("----------------------t4------------------------");
		TestBean t4 = new TestBean("t4 문자열");
		t4.printData();
		
		System.out.println("----------------------t5------------------------");
		TestBean t5 = new TestBean(200,2.2,"t5 문자열");
		t5.printData();
		System.out.println("----------------------t6------------------------");
//		TestBean t6 = new TestBean("하이",200,3.1);
		
		
		System.out.println("----------------------t7------------------------");
		DataBean d1 = new DataBean();
		DataBean d2 = new DataBean();
		TestBean2 t200 = new TestBean2(d1,d2);
		t200.printData();
		
		
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		System.out.println("----------------------obj1------------------------");
		TestBean obj1 = ctx.getBean("obj1",TestBean.class);
		obj1.printData();
		
		System.out.println("-----------------------obj2-----------------------");
		TestBean obj2 = ctx.getBean("obj2",TestBean.class);
		obj2.printData();
		
		System.out.println("-----------------------obj3-----------------------");
		TestBean obj3 = ctx.getBean("obj3",TestBean.class);
		obj3.printData();
		
		System.out.println("-----------------------obj4-----------------------");
		TestBean obj4 = ctx.getBean("obj4",TestBean.class);
		obj4.printData();
		
		System.out.println("-----------------------obj5-----------------------");
		TestBean obj5 = ctx.getBean("obj5",TestBean.class);
		obj5.printData();
		

		System.out.println("-----------------------obj6-----------------------");
		TestBean obj6 = ctx.getBean("obj6",TestBean.class);
		obj6.printData();
		
		System.out.println("-----------------------obj7-----------------------");
		TestBean obj7 = ctx.getBean("obj7",TestBean.class);
		obj7.printData();
		
		
		System.out.println("-----------------------obj8-----------------------");
		TestBean2 obj8 = ctx.getBean("obj8",TestBean2.class);
		obj8.printData();
		
		System.out.println("-----------------------obj9-----------------------");
		TestBean2 obj9 = ctx.getBean("obj9",TestBean2.class);
		obj9.printData();
		
		
		
		ctx.close();
	}

}
