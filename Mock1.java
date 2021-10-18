import java.util.HashSet;
/*
We want to know who knows the news at the end of the day

We are given a 2d array, and each inner array represents a meeting
between two persons, and each meeting has the purpose of 
informing the news of the day,the persons attending the meeting
are located in the first two spots of the
inner array, the third spot contains the time of the meeting.

The only number that knows the news at the start of the day is 1.
And we want to know who are the people that recived the news
at the end of the day.

Example:

input
{{1,7,300}, {3,7,700}, {1,2,100}, {5,3,800}}

output
[1,7,3,5]


*/

class Mock1 {
	public static void main(String[] args) {
		int[][] arr = {{1,7,300}, {3,6,700}, {1,2,100}, {5,4,0}};

		System.out.println(whoKnowsTheNews(arr));
	}
	static HashSet<Integer> whoKnowsTheNews(int[][] meetings) {
		//we create a hash set which will contain the people who
		//know the news
		HashSet<Integer> whoKnows = new HashSet<Integer>();
		//we add 1, because 1 always knows the news
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
		//once the 2d array is ordered by times all we want to check
		//is where is the first time one appears

		//once we find this spot we add the other person to the hashset
		//then for the times after, we only check if 
		//each meeting contains a person that knows the news,
		//and we add this person to the hashset
		for(int k = 0; k<meetings.length;k++) {
			if(whoKnows.contains(meetings[k][1])) {
				whoKnows.add(meetings[k][0]);
			}else if(whoKnows.contains(meetings[k][0])){
				whoKnows.add(meetings[k][1]);
			}
		}
		//we return the hash set
		return whoKnows;

	}
}