package dailyLeetCode.maxMatchPlayerTrainer2410;

import java.util.Arrays;

public class Solution {
    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int i = 0;
        int j = 0;
        int ans = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        while(i < players.length && j < trainers.length){
            if (players[i] <= trainers[j]){
                ans++;
                i++;
                j++;
            }
            j++;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[] players = {4,7,9};
        int[] trainers = {8,2,5,8};
        int ans = matchPlayersAndTrainers(players, trainers);
        System.out.println(ans);
        // System.out.println(Arrays.toString(players));
    }
}
