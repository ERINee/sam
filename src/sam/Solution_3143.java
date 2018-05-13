package sam;

import java.util.Scanner;

public class Solution_3143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tcNum = sc.nextInt();
		
		for(int i=0 ; i<tcNum ; i++)
		{
			String whole = sc.next();		
			String partial = sc.next();
			
			String temp = whole;
			int count = 0;
			
			while(temp!=null)
			{
				int index = temp.indexOf(partial);
				if(index==-1)
					break;
				
				count++;
				temp = temp.substring(index+partial.length());
			}
			
			int result = whole.length() - partial.length() * count + count;
			
			System.out.println("#"+(i+1)+" "+result);
		}
	}

}
