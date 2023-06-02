package com.core.java8.functionalProgramming.fault;

public class MultipleInheritanceExample implements InterfaceA,InterfaceB,InterfaceC {
    public static void main(String[] args) {
        MultipleInheritanceExample multipleInheritanceExample = new MultipleInheritanceExample();
        multipleInheritanceExample.sumA(4,8);
        multipleInheritanceExample.sumB(1,2);
        multipleInheritanceExample.sumC(7,9);

    }

	@Override
	public void sumA(int num1, int num2) {
		// TODO Auto-generated method stub
		InterfaceB.super.sumA(num1, num2);
	}
}
