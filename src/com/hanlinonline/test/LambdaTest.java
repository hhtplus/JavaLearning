/**
 * 
 */
package com.hanlinonline.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * 学习使用lambda表达式 Java8lambda表示式使用按照个人理解从易到难进行排序主要涉及到以下几个方面：
 * 1）集合的迭代
 * 2）stream的使用
 * 3）FunctionInterface
 * 
 * @author lazier
 */
public class LambdaTest {

	public static void main(String[] args) {
		testLambdaForeach();
		testStream();
		testFunctionalInterface();
	}

	/**
	 * 集合新的迭代写法,forEach接受一个Consumer进行内容的消费
	 */
	private static void testLambdaForeach() {
		List<String> testList = new ArrayList<>();
		testList.add("one");
		testList.add("two");
		testList.add("three");

		// 传统写法
		for (int i = 0; i < testList.size(); i++) {
			System.out.println(testList.get(i));
		}

		for (String str : testList) {
			System.out.println(str);
		}
		// 函数式写法
		testList.forEach((str)->{System.out.println(str);});
		
		testList.forEach((str) -> System.out.println(str));
		
		//分开写
		Consumer<String> consumer = System.out::println;
		testList.forEach(consumer);
	}

	/**
	 * stream的使用
	 * 主要涉及到java.util.steam包
	 * stream知识可以参考https://www.ibm.com/developerworks/cn/java/j-lo-java8streamapi/
	 */
	private static void testStream() {
		Stream.of("one","two","three").filter(str->str.startsWith("t")).map(String::toUpperCase).forEach(System.out::println);
	}
	
	/**
	 * 测试函数式接口，主要涉及到java.util.function包
	 * 
	 * 详情参考链接：http://colobu.com/2014/10/28/secrets-of-java-8-functional-interface/
	 */
	private static void testFunctionalInterface(){
		//传统写法
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("传统线程匿名类实现");
			}
		}).start();
		// 函数式写法
		new Thread(()->System.out.println("函数式实现")).start();
		MyFunctionInteface myFunctionInteface = ()->System.out.println("my function Interface");
		myFunctionInteface.foo();
	}
	
	@FunctionalInterface
	private interface MyFunctionInteface{
		void foo();
	}
}
