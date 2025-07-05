def solution(score):
    answer = [0] * len(score)
    avg = [0] * len(score)
    
    for i in range(len(score)):
        avg[i] = (score[i][0] + score[i][1]) / 2
    
    for i in range(len(score)):
        order = 1
        for j in range(len(score)):
            if avg[i] < avg[j]:
                order += 1
            answer[i] = order
            
    return answer