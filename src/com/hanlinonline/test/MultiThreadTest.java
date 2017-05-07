/**
 * 
 */
package com.hanlinonline.test;

/**
 * 测试JAVA对多线程的使用，按照Java版本逐步依赖的顺序，测试步骤如下：
 * 1）1.0-1.4 中的 java.lang.Thread
 * 2）5.0 中的 java.util.concurrent
 * 3）6.0 中的 Phasers 等
 * 4）7.0 中的 Fork/Join 框架
 * 5）8.0 中的 Lambda
 * 
 * @author lazier
 */
public class MultiThreadTest {
	
	public static void main(String[] args) {
		
		//TODO:实现相关方法
		testThead();
		testExecutor();
		testPhasers();
		testForkJoin();
	}

	/**
	 * 1.0->1.4测试线程实现 
	 */
	private static void testThead(){
		
	}
	
	/**
	 * java1.5 测试concurrent executors等实现
	 */
	private static void testExecutor(){
		
	}
	
	/**
	 * java1.6引入
	 */
	private static void testPhasers(){
		
	}
	
	/**
	 * java1.7引入
	 */
	private static void testForkJoin(){
		
	}
}
