package practice;

public class Maxofarray {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,12,6,7};
		int n=array.length;
		int max=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]  >max)
				max=array[i];
				
		}
		System.out.println("Max element is :"+" "+max);

	}

}
