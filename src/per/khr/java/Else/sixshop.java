package per.khr.java.Else;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class sixshop {
    public int test1(int[] estimates, int k) {
        int bestSum = Integer.MIN_VALUE;
        int curSum = 0;

        for (int i = 0; i <= estimates.length - k; ++i) {
            int nowKSum = 0;

            for (int j = i; j < i + k; ++j) {
                nowKSum += estimates[j];
            }

            curSum = Math.max(curSum, nowKSum);
            bestSum = Math.max(bestSum, curSum);
        }
        // currentMax 현재 idx의 숫자와 지금까지 더해왔던 것 중 가장 큰 값을 비교
        // globalMax는 "지금까지 더해왔던 것 중 가장 큰 값" 과 "지금까지 더해왔던 것 중 가장 큰 값에 현재 idx를 더한 값을 비교"

        return bestSum;
    }

    public int test2(int K, String[] user_scores) {
        TreeMap<Integer, String> user_scores_map = new TreeMap<>();
        HashMap<String, Integer> lankUserMap = new HashMap<>();

        int answer = 0;
        for (String user_score : user_scores) {
            String[] userTempArr = user_score.split(" ");

            // 랭킹 사이즈 체크
            if (user_scores_map.size() < K) {
                user_scores_map.put(Integer.valueOf(userTempArr[1]), userTempArr[0]);
                lankUserMap.put(userTempArr[0], Integer.valueOf(userTempArr[1]));
                answer++;
            } else {
                // user_scores_map에 이미 값이 있다면!
                if (lankUserMap.get(userTempArr[0]) != null) {
                    int targetInt = lankUserMap.get(userTempArr[0]);

                    HashMap<String, Integer> before = (HashMap<String, Integer>) lankUserMap.clone();

                    lankUserMap.put(userTempArr[0], Integer.valueOf(userTempArr[1]));

                    if (!before.equals(lankUserMap)) {
                        answer++;
                        user_scores_map.remove(targetInt);
                    }

                } else { // 기존에 user_scores_map에 값이 없을 때 얘기!!
                    Map.Entry<Integer, String> target = user_scores_map.firstEntry();
                    if (target.getKey() < Integer.valueOf(userTempArr[1])) {
                        user_scores_map.pollFirstEntry();
                        lankUserMap.remove(target.getValue());

                        user_scores_map.put(Integer.valueOf(userTempArr[1]), userTempArr[0]);
                        lankUserMap.put(userTempArr[0], Integer.valueOf(userTempArr[1]));
                        answer++;
                    }
                }

            }
        }

        return answer;
    }

//    public int[] test3(int N, int[] coffee_times) {
//        PriorityQueue<HashMap<Integer, Integer>> result = new PriorityQueue<HashMap<Integer, Integer>>();
//        for (int i = 0; i < coffee_times.length; ++i) {
//            if (result.size() < N) {
//                HashMap<Integer, Integer> tempMap = new HashMap<>();
//                tempMap.put(i, coffee_times[i]);
//
//                result.offer(tempMap);
//            }
//        }
//        return null;
//    }
}
