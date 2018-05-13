package sam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Solution_2948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int tcNum = sc.nextInt();
		
		for(int i=0 ; i<tcNum ; i++)
		{
			int aSize = sc.nextInt();
			int bSize = sc.nextInt();
			
			String[] a = new String[aSize];
			String[] b = new String[bSize];
			
			int count=0;
			
			HashMap<Integer,List<String>> hm = new HashMap<Integer,List<String>>();
			
			for(int j=0 ; j<aSize ; j++)
			{
				String temp = sc.next();
				
				int hashCode = temp.hashCode();
				List<String> t = hm.get(hashCode);
				if(t==null)
					t = new ArrayList<String>();
				t.add(temp);
				
				hm.put(hashCode, t);
			}
			
			for(int j=0 ; j<bSize ; j++)
			{
				String temp = sc.next();
				
				int hashCode = temp.hashCode();
				if(hm.get(hashCode) != null){
					List<String> t = hm.get(hashCode);
					if(t.contains(temp))
						count++;
				}
			}
			
			System.out.println("#"+(i+1)+" "+count);
		}
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Scanner sc = new Scanner(System.in);
//		
//		int tcNum = sc.nextInt();
//		
//		for(int i=0 ; i<tcNum ; i++)
//		{
//			int aSize = sc.nextInt();
//			int bSize = sc.nextInt();
//			
//			String[] a = new String[aSize];
//			String[] b = new String[bSize];
//			
//			for(int j=0 ; j<aSize ; j++)
//			{
//				a[j] = sc.next();
//			}
//			
//			for(int j=0 ; j<bSize ; j++)
//			{
//				b[j] = sc.next();
//			}
//			
////			for(int j=0 ; j<aSize ; j++)
////			{
////				System.out.print(a[j]+" ");
////			}
////			System.out.println();
////			for(int j=0 ; j<bSize ; j++)
////			{
////				System.out.print(b[j]+" ");
////			}
//			
//			Arrays.sort(a);
//			Arrays.sort(b);
//			
//			int count = 0;
//			int sameIdx = 0;
//			for(int j=0 ; j<aSize ; j++)
//			{
//				for(int k=sameIdx; k<bSize ; k++)
//				{
//					if(a[j].equals(b[k]))
//					{
//						count++;
//						sameIdx = k+1;
//						break; // 안쪽 for문을 탈출
//					}
//				}
//			}
//
//			System.out.println("#"+(i+1)+" "+count);
//		}
//	}

}
