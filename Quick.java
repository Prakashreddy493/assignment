package quick;
import java.util.*;
class Qs{
	public void swap(int[] ar,int index1,int index2)
	{
		int temp=ar[index1];
		ar[index1]=ar[index2];
		ar[index2]=temp;
	}
	public void quick(int[] ar,int lowIndex,int highIndex)
	{
		if(lowIndex>=highIndex)
		{
			return;
		}
		int pivot=ar[highIndex];
		int leftPointer=lowIndex;
		int rightPointer=highIndex;
		while(leftPointer<rightPointer)
		{
			while(ar[leftPointer]<=pivot && leftPointer<rightPointer)
			{
				leftPointer++;
			}
			while(ar[rightPointer]>=pivot && leftPointer<rightPointer)
			{
				rightPointer--;
			}
			swap(ar,leftPointer,rightPointer);
		}
		swap(ar,leftPointer,highIndex);
		quick(ar,lowIndex,leftPointer-1);
		quick(ar,leftPointer+1,highIndex);
		
	}
}

public class Quick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the length of the array");
		int le=scan.nextInt();
		int[] ar=new int[le];
		int n=ar.length;
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the "+i+" element");
			ar[i]=scan.nextInt();
		}
		Qs sort=new Qs();
		sort.quick(ar,0,n-1);
		for(int el:ar)
		{
			System.out.println(el+" ");
		}
		
	}

}
