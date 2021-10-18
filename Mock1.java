import java.util.HashSet;

class Mock1 {
	public static void main(String[] args) {
		int[][] arr = {{1,7,300}, {3,6,700}, {1,2,100}, {5,4,0}};

		System.out.println(whoKnowsTheNews(arr));
	}
	static HashSet<Integer> whoKnowsTheNews(int[][] meetings) {
		
		HashSet<Integer> whoKnows = new HashSet<Integer>();
		whoKnows.add(1);

		//sorting the array to order the times
		//doing it this way is easier to know who knows the news
		for(int i = 0; i<meetings.length;i++) {
			int minIndex = i;
			for(int j = i+1; j<meetings.length;j++) {
				if(meetings[minIndex][2]>meetings[j][2]) {
					minIndex = j;
				}
			}
			if(minIndex!=i) {
				int[] temp = meetings[i];
				meetings[i] = meetings[minIndex];
				meetings[minIndex] = temp;
			}
		}

		for(int k = 0; k<meetings.length;k++) {
			if(whoKnows.contains(meetings[k][1])) {
				whoKnows.add(meetings[k][0]);
			}else if(whoKnows.contains(meetings[k][0])){
				whoKnows.add(meetings[k][1]);
			}
		}
		return whoKnows;

	}
}