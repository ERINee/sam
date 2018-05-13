package sam;

import java.util.Scanner;

public class Solution_3363 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int tcNum = sc.nextInt();

		for (int i = 0; i < tcNum; i++) {
			
			int row = sc.nextInt();
			Pair[] data = new Pair[row];
			for(int j=0 ; j<row ; j++)
			{
				int start = sc.nextInt();
				int end = sc.nextInt();
				int step = sc.nextInt();
				
				Pair temp = new Pair(start,end,step);
				data[j]=temp;
			}
			
			int count = 0;
			for(int j=0 ; j<row ; j++)
			{
				int target = data[j].start;
				
				for(int k=0 ; k<row ; k++)
				{
					int start = data[k].start;
					int end = data[k].end;
					int step = data[k].step;
					
					if(target == start || target == end)
						count++;
					
					if(target > start && target<end)
					{
						if((target - start) % step==0)
						{
							count++;
						}
					}
				}
				
				if(count%2 !=0 )
				{
					System.out.println("#" + (i + 1) + " " + target+ " " + count);
					break;
				}
				else
				{
					count = 0;
				}
				
				if(j==row-1)
					System.out.println("#" + (i + 1) + " no corruption");
			}

			
		}
	}
	
	static class Pair{
		int start;
		int end;
		int step;
		
		public Pair(int start, int end, int step){
			this.start = start;
			this.end = end;
			this.step = step;
		}
	}

}
