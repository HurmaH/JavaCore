package day52_InheritanceFinal_InitializerBlock;
/*
 * Override: 
 *          method needs to be in the sub class
 *          cannot override method within class
 *          STATIC METHOD cannot be override, belongs to class
 *          FINAL METHOD cannot be override,
 *          PRIVATE METHOD cannot be overide 
 *          
 */
public class OverrideReveiw extends test1 {
	
	@Override
    public void method1() {
		System.out.println("Overriden method");
	}

}

class test1 {
	
	public void method1() {
		System.out.println("Original method");
	}
}
