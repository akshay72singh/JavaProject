package interFace;

 interface InterFace {

	public abstract void m1();
	// we can create 'public abstract' and 'public void' method without body
	// but we can not create a 'public static void' method without body
	
	public static final int a=10;
	// we can create a variable only 'public static final' and it will be default 
	

	private  void m3() {
		// 'private static void' method requires always body
		//  and we can create non-static 'private' method
	}
	
	default void m4(){
		//we can create only non-static default method and with body 
	}
	// interface can not have constructor
	
	// in case of interface we can not create static and non-static block 

 

 }