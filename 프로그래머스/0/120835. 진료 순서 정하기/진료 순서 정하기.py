def solution(emergency):
    answer = []
    
    for i in emergency:
        c = 0
        for j in emergency:
            if i < j:
                c += 1
        answer.append(c + 1)
        
    return answer