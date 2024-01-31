import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        // 준호의 처음 병사 수 n
        // 사용 가능한 무적권의 횟수 k
        // 공격 병사 수 배열 enemy
        // 최대 몇라운드까지 방어 가능한지 구하기
        int answer = enemy.length;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<enemy.length; i++) {
            n -= enemy[i];
            pq.add(enemy[i]);
            
            if(n < 0) {
                if(k > 0 && !pq.isEmpty()) {
                    n += pq.poll();
                    k--;
                }
                else {
                    answer = i;
                    break;
                }
            }
        }
        return answer;
        
    }
}