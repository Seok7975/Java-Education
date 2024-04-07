import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> giftCounts = new HashMap<>();

        // 선물 지수 계산
        for (String gift : gifts) {
            String[] tokens = gift.split(" ");
            String giver = tokens[0];
            String receiver = tokens[1];

            giftCounts.put(giver, giftCounts.getOrDefault(giver, 0) + 1);
            giftCounts.put(receiver, giftCounts.getOrDefault(receiver, 0) - 1);
        }

        int maxGiftCount = 0;
        int maxGiftReceiverCount = 0;

        // 최대 선물 지수와 받는 친구 수 계산
        for (String friend : friends) {
            int giftCount = giftCounts.getOrDefault(friend, 0);
            if (giftCount > maxGiftCount) {
                maxGiftCount = giftCount;
                maxGiftReceiverCount = 1;
            } else if (giftCount == maxGiftCount) {
                maxGiftReceiverCount++;
            }
        }

        return maxGiftReceiverCount;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 예시 테스트
        String[] friends = {"A", "B", "C", "D"};
        String[] gifts = {"A B", "B C", "C A", "D B"};
        int result = solution.solution(friends, gifts);
        System.out.println(result); // 출력: 1
    }
}