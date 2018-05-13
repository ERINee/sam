//package sam;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Solution_1795 {
//
//final static int MAX = 1000001;
//	
//	public static int[] Dijkstra(int home, int[][] map)
//	{
//		int[] result = new int[map.length];
//		Arrays.fill(result, MAX);
//		
//		Boolean[] visited = new Boolean[map.length];
//		Arrays.fill(visited, false);
//		
//		int minIndex = -1;
//		//�츮��-> �츮�� ���°� ����ϱ� 0
//		result[home]=0;
//		
//		for(int i=0 ; i<map.length ; i++)
//		{
//			int minValue = MAX;
//			
//			//result���� �ּҰ��� ã�´�.
//			for(int j=0; j<map.length ; j++)
//			{
//				if(result[j]<minValue && !visited[j])
//				{
//					minIndex = j;
//					minValue = result[j];
//				}
//			}
//			
//			visited[minIndex] = true;
//			
//			for(int j=0; j<map.length ; j++)
//			{
//				if(result[j] > result[minIndex] + map[minIndex][j])
//					result[j] = result[minIndex] + map[minIndex][j];
//			}
//			
//		}
//		
//		return result;
//	}
//	public static int[] Dijkstra_inverse(int home, int[][] map)
//	{
//		int[] result = new int[map.length];
//		Arrays.fill(result, MAX);
//		
//		Boolean[] visited = new Boolean[map.length];
//		Arrays.fill(visited, false);
//		
//		int minIndex = -1;
//		//�츮��-> �츮�� ���°� ����ϱ� 0
//		result[home]=0;
//		
//		for(int i=0 ; i<map.length ; i++)
//		{
//			int minValue = MAX;
//			
//			//result���� �ּҰ��� ã�´�.
//			for(int j=0; j<map.length ; j++)
//			{
//				if(result[j]<minValue && !visited[j])
//				{
//					minIndex = j;
//					minValue = result[j];
//				}
//			}
//			
//			visited[minIndex] = true;
//			
//			for(int j=0; j<map.length ; j++)
//			{
//				if(result[j] > result[minIndex] + map[j][minIndex])
//					result[j] = result[minIndex] + map[j][minIndex];
//			}
//			
//		}
//		
//		return result;
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//				Scanner sc = new Scanner(System.in);
//				
//				int tcNum = sc.nextInt();
//				
//				for(int i=0 ; i<tcNum ; i++)
//				{
//					int node = sc.nextInt();
//					int line = sc.nextInt();
//					int home = sc.nextInt();
//					
//					int[][] map = new int[node][node];
//					
//					//�켱 �ִ�� ū ������  array�� ä���ְ�
//					for(int j=0 ; j<node ; j++)
//					{
//						Arrays.fill(map[j], MAX);
//					}
//					
//					// ���� input�� �޴´�
//					for(int j=0; j<line ; j++)
//					{
//						int from = sc.nextInt();
//						int to = sc.nextInt();
//						int score = sc.nextInt();
//						
//						map[from-1][to-1] = score;
//					}
//					
////					for(int j=0; j<node ; j++)
////					{
////						for(int k=0; k<node ; k++)
////						{
////							System.out.print(map[j][k]+" ");
////						}
////						System.out.println();
////					}
//					
//					//�μ��� ������ �� ������ ���� �ִܰŸ��� ����.
//					int[] result = Dijkstra(home-1,map);
//					
//					//�� ������ �μ��� ������ ���� �ִ� �Ÿ��� ����.
//					int[] result_inverse = Dijkstra_inverse(home-1, map); 
//					
//					int maxValue = -1;
//					for(int j=0 ; j<node ; j++)
//					{
//						if(maxValue < result[j]+result_inverse[j])
//							maxValue = result[j]+result_inverse[j];
//					}
//					
//					System.out.println("#"+(i+1)+" "+maxValue);
//				}
//
//	}
//
//}
