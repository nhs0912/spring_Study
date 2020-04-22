package kr.co.softcampus.beans;

import javax.annotation.Resource;

public class TestBean6 {
	
	//변수 이름과 빈의 이름이 다를 경우 
	@Resource(name="data1")
	private DataBean1 data100;
	
	@Resource(name="data2")
	private DataBean2 data200;

	public DataBean1 getData100() {
		return data100;
	}

	public DataBean2 getData200() {
		return data200;
	}
	
	
}
