package tapan;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

abstract class Gift
{
	String gift_to;
	double weight;
	static double tot_weight;
	Gift()
	{
	this.gift_to="child";
	this.weight=0;
	}
	Gift(String gift_to,double weight)
	{
		this.gift_to=gift_to;
		this.weight=weight;
		if(this.gift_to.equals("child"))
			Gift.tot_weight=Gift.tot_weight+this.weight;
	}
	abstract void display();
}
class ChocolateComparator implements Comparator<Chocolate>
{
	public int compare(Chocolate choco1,Chocolate choco2) 
	{	 
		return Double.compare(choco1.getprice(), choco2.getprice());
	}
}
class Chocolate extends Gift{
	double price;
	String choc_name;
	String choc_company;
	Chocolate(String gift_to,double weight,double price,String choc_name,String choc_company){
	super(gift_to,weight);
	this.price=price;
	this.choc_name=choc_name;
	this.choc_company=choc_company;
	
	}
	public double getprice()
	{
		return price;
	}
	public String getchoc_name()
	{
		return choc_name;
	}
	public String getchoc_company()
	{
		return choc_company;
	}
	public double getweight()
	{
		return this.weight;
	}
	void display()
	{
		System.out.println("The chocolate price"+this.price);
		System.out.println("The chocolate name"+this.choc_name);
		System.out.println("The chocolate company"+this.choc_company);
		System.out.println("The chocolate weight"+this.weight);
		System.out.println("The chocolate gifted to"+this.gift_to);
		}
}
class SweetsComparator implements Comparator<Sweets>
{
	public int compare(Sweets s1,Sweets s2) 
	{	 
		return Double.compare(s1.getsw_price(), s2.getsw_price());
	}
}
class Sweets extends Gift{
	double sw_price;
	String sweet_name;
	String sweet_company;
	Sweets(String gift_to,double weight,double sw_price,String sweet_name,String sweet_company){
	super(gift_to,weight);
	this.sw_price=sw_price;
	this.sweet_name=sweet_name;
	this.sweet_company=sweet_company;
	
	}
	public double getsw_price()
	{
		return sw_price;
	}
	public String getsweet_name()
	{
		return sweet_name;
	}
	public String getsweet_company()
	{
		return sweet_company;
	}
	public double getweight()
	{
		return this.weight;
	}
	void display()
	{
		System.out.println("The sweet price"+this.sw_price);
		System.out.println("The sweet name"+this.sweet_name);
		System.out.println("The sweet company"+this.sweet_company);
		System.out.println("The sweet weight"+this.weight);
		System.out.println("The sweet gifted to"+this.gift_to);
		}
}
class CandyComparator implements Comparator<Candy>
{
	public int compare(Candy c1,Candy c2)
	{
		return Double.compare(c1.getca_price(), c2.getca_price());
	}
}
class Candy extends Gift{
	double ca_price;
	String candy_name;
	int quantity;
	Candy(String gift_to,double weight,double ca_price,String candy_name,int quantity){
	super(gift_to,weight);
	this.ca_price=ca_price;
	this.candy_name=candy_name;
	this.quantity=quantity;
	
	}
	public double getca_price()
	{
		return ca_price;
	}
	public String getcandy_name()
	{
		return candy_name;
	}
	
	public double getweight()
	{
		return this.weight;
	}
	void display()
	{
		System.out.println("The candy price"+this.ca_price);
		System.out.println("The candy name"+this.candy_name);
		System.out.println("The candy company"+this.quantity);
		System.out.println("The candy weight"+this.weight);
		System.out.println("The candy gifted to"+this.gift_to);
		}
}

public class App {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,j;
		char choice;
		double min,max;
		int ch1=1;
		String gift_to;
		double pri;
		double weight;
		int quant;
		String name;
		String name1;
		do {
			System.out.println("**********EPAM ASSIGNMENT 1*********");
			System.out.println("1. create objects of chocolates and sort them");
			System.out.println("2. create objects of sweets ");
			System.out.println("3. create objects of candies and display the range");
			System.out.println("4. Display total weight of child gift");
			System.out.println("Enter your choice");
			ch1=sc.nextInt();
			switch(ch1)
			{
			case 1: System.out.println("Enter the no of chocolates =");
			        n=sc.nextInt();
			        ArrayList<Chocolate> ob=new ArrayList<Chocolate>();
			        for(int i=0;i<n;i++)
			        {
			        	System.out.print("Enter the price=");
			        	pri=sc.nextDouble();
			        	System.out.print("Enter the name=");
			        	sc.nextLine();
			        	name=sc.nextLine();
			        	System.out.print("Enter the company name=");
			        	name1=sc.nextLine();
			        	System.out.print("Enter the weight=");
			        	weight=sc.nextDouble();
			        	System.out.print("Enter to gift to(child or adult)=");
			        	sc.nextLine();
			        	gift_to=sc.nextLine();
			        	ob.add(new Chocolate(gift_to,weight,pri,name,name1));
			        }
			        for(Chocolate ch: ob)
						ch.display();
			        System.out.println("Sorting the Chocolates according to price");
					Collections.sort(ob,new ChocolateComparator());
					for(Chocolate ch: ob)
						ch.display();
					break;
			        	
			case 2: System.out.println("Enter the no of Sweets =");
	                 n=sc.nextInt();
	                 ArrayList<Sweets> ob1=new ArrayList<Sweets>();
	                 for(int i=0;i<n;i++)
	                  {
	        	      System.out.print("Enter the price=");
	        	       pri=sc.nextDouble();
	        	       System.out.print("Enter the name=");
	        	       sc.nextLine();
	        	       name=sc.nextLine();
	        	       System.out.print("Enter the company name=");
	        	       name1=sc.nextLine();
	        	       System.out.print("Enter the weight=");
	        	       weight=sc.nextDouble();
	        	        System.out.print("Enter to gift to(child or adult)=");
	        	       sc.nextLine();
	        	      gift_to=sc.nextLine();
	        	        ob1.add(new Sweets(gift_to,weight,pri,name,name1));
	                   }
	                for(Sweets sw: ob1)
				     sw.display();
	                break;
			case 3: System.out.println("Enter the no of candies =");
                    n=sc.nextInt();
                    ArrayList<Candy> ob3=new ArrayList<Candy>();
                    for(int i=0;i<n;i++)
                     {
   	                 System.out.print("Enter the price=");
   	                   pri=sc.nextDouble();
   	                   System.out.print("Enter the name=");
   	                    sc.nextLine();
   	                    name=sc.nextLine();
   	                     System.out.print("Enter the Quantity=");
   	                       quant=sc.nextInt();
   	                        System.out.print("Enter the weight=");
   	                         weight=sc.nextDouble();
   	                          System.out.print("Enter to gift to(child or adult)=");
   	                          sc.nextLine();
   	                          gift_to=sc.nextLine();
   	                           ob3.add(new Candy(gift_to,weight,pri,name,quant));
                                }
                             for(Candy can: ob3)
		                      can.display();
                             System.out.print("Enter the max=");
                             max=sc.nextDouble();
                             System.out.print("Enter the min=");
                             min=sc.nextDouble();
                             for(Candy can: ob3)
                             {
                            		if(min<=can.getca_price() && max>=can.getca_price())
            						can.display();
                             }
                             break;
			case 4:   	System.out.println("Total Weight of Gifts "+ Gift.tot_weight);
			            break;
		
	}System.out.println("Do you want to continue (y/n)");
	choice=sc.next().charAt(0);

}while(choice!='n');
		sc.close();
	}
	}
