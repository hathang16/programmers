def solution(dots):
    answer = 0
    
    min_x = dots[0][0]
    min_y = dots[0][1]
    max_x = dots[0][0]
    max_y = dots[0][1]
    
    for i in range(1, len(dots)):
        min_x = min(min_x, dots[i][0])
        min_y = min(min_y, dots[i][1])
        max_x = max(max_x, dots[i][0])
        max_y = max(max_y, dots[i][1])
    
    answer = (max_x - min_x) * (max_y - min_y)
    return answer