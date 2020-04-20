package kr.co.softcampus.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class TestBean1 {
	private int data1;
	private DataBean1 data2;

	// 자동주입을 변수에 설정한다.
	// 자동으로 setter method가 추가되어 setter method를 통해 주입받게 된다.
	@Autowired
	private DataBean1 data3;

	@Autowired
	@Qualifier("obj4")
	private DataBean2 data4;
	@Autowired
	@Qualifier("obj5")
	private DataBean2 data5;

	@Autowired(required = false)
	@Qualifier("obj6")
	private DataBean2 data6;
	
	
	public DataBean2 getData6() {
		return data6;
	}

	public DataBean1 getData2() {
		return data2;
	}

	// 자동주입(타입)
	@Autowired
	public void setData2(DataBean1 data2) {
		this.data2 = data2;
	}

	public int getData1() {
		return data1;
	}

	// 필수 주입 프로퍼티(스프링 5.1 or JAVA file로 bean을 등록했을 경우 무시된다.)
	@Required
	public void setData1(int data1) {
		this.data1 = data1;
	}

	public DataBean1 getData3() {
		return data3;
	}

	public DataBean2 getData4() {
		return data4;
	}

	public DataBean2 getData5() {
		return data5;
	}

	
}
