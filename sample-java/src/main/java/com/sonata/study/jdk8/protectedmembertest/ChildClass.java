package com.sonata.study.jdk8.protectedmembertest;

import com.sonata.study.jdk8.protectedmembertest.BaseClass;

public class ChildClass extends BaseClass {
	
	
	public static void main(String[] args) {
		ChildClass childInstance = new ChildClass();
		System.out.println(childInstance.$protectedMember);
		BaseClass baseInstance = childInstance;
		System.out.println( baseInstance.$protectedMember);
	}

}
