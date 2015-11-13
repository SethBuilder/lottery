import java.util.Random;

public class Number {
	int[] num = new int[6];
	Random ran = new Random();
	int temp;
	
	//return an array on integers
	public int[] generate(){
	
		for(int i = 0; i<6; i++)
		{
			num[i] = ran.nextInt(10);
				//checks if there's less significant yet greater values
				for(int k = 0; k<i; k++)
					if(num[k]>num[i])
					{	//replaces two values to keep ascending order
						temp = num[i];
						num[i]=num[k];
						num[k] = temp;
					}
					//if values are similar go back and generate a new value
					else if(num[k]==num[i])
						i--;
		}//end of for loop
		
			return num;
	
	}//end of method
}//end of class

