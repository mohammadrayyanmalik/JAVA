package Abstraction;

public class BusinessLogic2 {
	public static void main(String[] args) {
		BusinessLogic weekend=new BusinessLogic()
		{
			void coupons()
			{
				System.out.println("weekend coupon");
			}
		};
		
		weekend.coupons();
		
		BusinessLogic weekdays=new BusinessLogic()
		{
			void coupons()
			{
				System.out.println("weekdays coupon");
			}
		};
		weekdays.coupons();
	}
}
