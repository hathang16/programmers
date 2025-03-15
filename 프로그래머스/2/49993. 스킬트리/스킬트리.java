class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for (int i = 0; i < skill_trees.length; i++) {
            String filtered = skill_trees[i].replaceAll("[^" + skill + "]", "");
            
            if (skill.startsWith(filtered)) {
                answer++;
            }
        }
        
        return answer;
    }
}