package com.c40.jump.action;

/**
 * @author Administrator
 * 跳转测试action
 *
 */
public class JumpAction {
	private int state;
	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}
	public String jump40(){
		System.out.println("=========================");
		if(state==1){
		System.out.println("jumpok--->dispatcher我是跳转~~~~");
		return "jumpok";//跳转到index.jsp
	}else if(state==2){
		System.out.println("jump2ok--->redirect我是重定向~~~~");
		return "jump2ok";//重定向index.jsp
	}else if(state==3){
		System.out.println("jump3ok--->chain~我是重定向~~~~");
		return "jump3ok";//转发到jumpaction2
	}else{
		System.out.println("jump5ok--->redirectAction~我是重定向~~~~");
		return "jump5ok";//重定向到jumpaction2
		
	}
	
}
}
