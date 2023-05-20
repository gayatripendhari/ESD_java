class Customer
{    
	int amount=10000;    
    
	synchronized void withdraw(int a)
	{    
		System.out.println("going to withdraw...");    
    
		if(amount<a)
		{    
			System.out.println("Less balance; waiting for deposit...");    
			
		}    
		amount=amount-a;
		System.out.println("After withdraw amount = "+amount);
		System.out.println("withdraw completed...");    
	}    
    
	synchronized void deposit(int b)
	{    
		System.out.println("going to deposit...");    
		amount=amount+b;
		System.out.println("After deposit amount = "+amount);
		System.out.println("deposit completed... ");    
		
	}    
}    
 class Candidate1 extends Thread
{
	Customer cust;
	Candidate1(Customer x)
	{
		cust=x;
		start();
	}	
	public void run()
	{
		cust.withdraw(15000);
	}
}   
 class Candidate2 extends Thread
{
	Customer cust;
	Candidate2(Customer x)
	{
		cust=x;
		start();
	}	
	public void run()
	{
		cust.deposit(10000);
	}
}   
class Interthread_Communication1
{    
	public static void main(String args[ ])
	{
		Customer c=new Customer();
		Candidate1 c1=new Candidate1(c);
		Candidate2 c2=new Candidate2(c);
	}
}    