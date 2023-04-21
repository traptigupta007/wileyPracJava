package FirstPack;



	public class StaticBlock {

		static {
			System.out.println("static block");
		}
		StaticBlock(){

			System.out.println("Constructor");
		}
		{
			
			System.out.println("Instance initializer block");
		}
		public static void main(String[] args) {
			StaticBlock obj=new StaticBlock();
			StaticBlock obj1=new StaticBlock();
			StaticBlock obj2=new StaticBlock();
		
		
	}

}
