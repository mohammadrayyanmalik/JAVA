package GenericsAndFunctionalInterfaces;

import java.util.function.Consumer;

public class Example4 {


	
		public static void main(String[] args) {
			
			Consumer<Integer> square=new Consumer<Integer>() {

				@Override
				public void accept(Integer t) {
					// TODO Auto-generated method stub
					
					System.out.println(t*t);
					
				}
			};
			
			square.accept(13);
		}
}
