import java.util.Scanner;
public class sorting3
{
	public static void main (String args [])
	{
		int ember;
		
		Scanner panjang=new Scanner(System.in);
		System.out.print("panjang data : ");
		int x=panjang.nextInt();

		int a[]=new int[x];

		for (int b=0; b<x; b++){
			System.out.print("Data ke : "+b);
			a[b]=panjang.nextInt();
		}


		
		for (int z=0; z<a.length-1; z++)
		{
			if(a[z]>a[z+1]){
				ember=a[z];
				a[z]=a[z+1];
				a[z+1]=ember;
			
		}
	}

	for(int z=0; z<a.length; z++){
		System.out.print(a[z]+" ");
	}
	}
}
