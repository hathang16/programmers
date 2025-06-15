def solution(num, k):
    answer = -1
    s = str(num)
    
    for i in range(len(s)):
        if s[i] == str(k):
            answer = i + 1
            break
    
    return answer