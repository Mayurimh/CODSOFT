import java.text.DecimalFormat;
import java.util.Scanner;
class Currency{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double rupee,dollar,kuwaiti_dinar,rial,pound,riyal,euro;
        while(true)
        {
		System.out.println("1.CURRENCY CONVERTER");
		System.out.println("2.EXIT");
		System.out.println("Enter your choice : ");
		int c= sc.nextInt();

		switch (c){
		case 1:
		System.out.println();
		System.out.println("**************************WELCOME IN CURRENCY CONVERT***********************************");
		System.out.println("  1.RUPEE");
		System.out.println("  2.DOLLAR");
		System.out.println("  3.KUWAITI DINAR");
		System.out.println("  4.RIAL");
		System.out.println("  5.POUND");
		System.out.println("  6.EURO");
		System.out.println("  7.RIYAL");
		System.out.println();
		System.out.print("CHOOSE YOUR BASE CURRENCY : ");
		int base =sc.nextInt();
		System.out.print("CHOOSE YOUR TARGET CURRENCY : ");
		int target =sc.nextInt();
		System.out.print("ENTER THE AMOUNT WANT TO CONVERT : ");
		double amount =sc.nextDouble();
		System.out.println();
		DecimalFormat f=new DecimalFormat("########.#####");
		//sc.close();
		switch(base)
		{
			case 1:
			
			if(target==1)
			{
				rupee = (float)amount*1;
				System.out.println(amount + " rupee: "+f.format(rupee)+" rupee");
			}
			if(target==2)
			{
				dollar = (float)amount*0.012f;
				System.out.println(amount + " rupee: "+f.format(dollar)+" Dollar");
			}
			if(target==3)
			{
				kuwaiti_dinar = (float)amount*0.0037f;
				System.out.println(amount + " rupee: "+f.format(kuwaiti_dinar)+" KWD");	
			}
			if(target==4)
			{
				rial = (float)amount*508.54f;
					System.out.println(amount + " rupee: "+f.format(rial)+" IRR");
			}
			if(target==5)
			{
				pound = (float)amount*0.0094f;
				System.out.println(amount + " rupee: "+f.format(pound)+" pound");
			}
			if(target==6)
			{
				euro= (float)amount*0.011f;
				System.out.println(amount + " rupee: "+f.format(euro)+" Euro");
			}
			if(target==7)
			{
				riyal= (float)amount*0.045f;
				System.out.println(amount + " rupee: "+f.format(riyal)+" SR");
			}
			break;
			case 2:
			
			if(target==1)
			{
				rupee= (float)amount*83.16f;
				System.out.println(amount + " dollar: "+f.format(rupee)+" rupee");
			}
			if(target==2)
			{
				dollar = (float)amount*1;
				System.out.println(amount + " dollar: "+f.format(dollar)+" Dollar");
			}
			if(target==3)
			{
				kuwaiti_dinar = (float)amount*0.31f;
				System.out.println(amount + " dollar: "+f.format(kuwaiti_dinar)+" KWD");	
			}
			if(target==4)
			{
				rial = (float)amount*42275.00f;
					System.out.println(amount + " dollar: "+f.format(rial)+" IRR");
			}
			if(target==5)
			{
				pound = (float)amount*0.79f;
				System.out.println(amount + " dollar: "+f.format(pound)+" pound");
			}
			if(target==6)
			{
				euro= (float)amount*0.92f;
				System.out.println(amount + " dollar: "+f.format(euro)+" Euro");
			}
			if(target==7)
			{
				riyal= (float)amount*3.75f;
				System.out.println(amount + " dollar: "+f.format(riyal)+" SR");
			}
			break;
			case 3:
			
			if(target==1)
			{
				rupee = (float)amount*270.98f;
				System.out.println(amount + " KWD: "+f.format(rupee)+" rupee");
			}
			if(target==2)
			{
				dollar = (float)amount*3.26f;
				System.out.println(amount + " KWD: "+f.format(dollar)+" Dollar");
			}
			if(target==3)
			{
				kuwaiti_dinar = (float)amount*1;
				System.out.println(amount + " KWD: "+f.format(kuwaiti_dinar)+" KWD");	
			}
			if(target==4)
			{
				rial = (float)amount*137757.40f;
					System.out.println(amount + " KWD: "+f.format(rial)+" IRR");
			}
			if(target==5)
			{
				pound = (float)amount*2.56f;
				System.out.println(amount + " KWD: "+f.format(pound)+" pound");
			}
			if(target==6)
			{
				euro= (float)amount*2.99f;
				System.out.println(amount + " KWD: "+f.format(euro)+" Euro");
			}
			if(target==7)
			{
				riyal= (float)amount*12.22f;
				System.out.println(amount + " KWD: "+f.format(riyal)+" SR");
			}
			break;
			case 4:
			
			if(target==1)
			{
				rupee = (float)amount*0.0020f;
				System.out.println(amount + " IRR: "+f.format(rupee)+" rupee");
			}
			if(target==2)
			{
				dollar = (float)amount*0.000024f;
				System.out.println(amount + " IRR: "+f.format(dollar)+" Dollar");
			}
			if(target==3)
			{
				kuwaiti_dinar = (float)amount*0.0000073f;
				System.out.println(amount + " IRR: "+f.format(kuwaiti_dinar)+" KWD");	
			}
			if(target==4)
			{
				rial = (float)amount*1;
					System.out.println(amount + " IRR: "+f.format(rial)+" IRR");
			}
			if(target==5)
			{
				pound = (float)amount*0.000019f;
				System.out.println(amount + " IRR: "+f.format(pound)+" pound");
			}
			if(target==6)
			{
				euro= (float)amount*0.000022f;
				System.out.println(amount + " IRR: "+f.format(euro)+" Euro");
			}
			if(target==7)
			{
				riyal= (float)amount*0.000089f;
				System.out.println(amount + " IRR: "+f.format(riyal)+" SR");
			}
			break;
			case 5:
			
			if(target==1)
			{
				rupee = (float)amount*105.90f;
				System.out.println(amount + " POUND "+f.format(rupee)+" rupee");
			}
			if(target==2)
			{
				dollar = (float)amount*1.27f;
				System.out.println(amount + " POUND: "+f.format(dollar)+" Dollar");
			}
			if(target==3)
			{
				kuwaiti_dinar = (float)amount*0.39f;
				System.out.println(amount + " POUND: "+f.format(kuwaiti_dinar)+" KWD");	
			}
			if(target==4)
			{
				rial = (float)amount*105.90f;
					System.out.println(amount + " POUND: "+f.format(rial)+" IRR");
			}
			if(target==5)
			{
				pound = (float)amount*1;
				System.out.println(amount + " POUND: "+f.format(pound)+" pound");
			}
			if(target==6)
			{
				euro= (float)amount*1.17f;
				System.out.println(amount + " POUND: "+f.format(euro)+" Euro");
			}
			if(target==7)
			{
				riyal= (float)amount*4.78f;
				System.out.println(amount + " POUND: "+f.format(riyal)+" SR");
			}
			break;
			case 6:
			
			if(target==1)
			{
				rupee = (float)amount*90.57f;
				System.out.println(amount + " EURO: "+f.format(rupee)+" rupee");
			}
			if(target==2)
			{
				dollar = (float)amount*1.09f;
				System.out.println(amount + " EURO: "+f.format(dollar)+" Dollar");
			}
			if(target==3)
			{
				kuwaiti_dinar = (float)amount*0.34f;
				System.out.println(amount + " EURO: "+f.format(kuwaiti_dinar)+" KWD");	
			}
			if(target==4)
			{
				rial = (float)amount*46043.82f;
					System.out.println(amount + " EURO: "+f.format(rial)+" IRR");
			}
			if(target==5)
			{
				pound = (float)amount*0.86f;
				System.out.println(amount + " EURO: "+f.format(pound)+" pound");
			}
			if(target==6)
			{
				euro= (float)amount*1;
				System.out.println(amount + " EURO: "+f.format(euro)+" Euro");
			}
			if(target==7)
			{
				riyal= (float)amount*4.08f;
				System.out.println(amount + " EURO: "+f.format(riyal)+" SR");
			}
			break;
			case 7:
			
			if(target==1)
			{
				rupee = (float)amount*22.17f;
				System.out.println(amount + " SR: "+f.format(rupee)+" rupee");
			}
			if(target==2)
			{
				dollar = (float)amount*0.27f;
				System.out.println(amount + " SR: "+f.format(dollar)+" Dollar");
			}
			if(target==3)
			{
				kuwaiti_dinar = (float)amount*0.082f;
				System.out.println(amount + " SR: "+f.format(kuwaiti_dinar)+" KWD");	
			}
			if(target==4)
			{
				rial = (float)amount*11272.48f;
					System.out.println(amount + " SR: "+f.format(rial)+" IRR");
			}
			if(target==5)
			{
				pound = (float)amount*0.21f;
				System.out.println(amount + " SR: "+f.format(pound)+" pound");
			}
			if(target==6)
			{
				euro= (float)amount*0.045f;
				System.out.println(amount + " SR: "+f.format(euro)+" Euro");
			}
			if(target==7)
			{
				riyal= (float)amount*1;
				System.out.println(amount + " SR: "+f.format(riyal)+" SR");
			}
			break;
			default:
			System.out.println("Enter correct choice.........");
		}
        break;
        case 2:
        System.out.println("THANK YOU..........");
		System.exit(0);
		break;
        default:
        System.out.println("enter correct choice.........");
    	}
    }
	}
}
