def solution(s):
    answer = ''
    
    for i in sorted(s):
        if s.count(i) == 1:
            answer += i
            
    return answer