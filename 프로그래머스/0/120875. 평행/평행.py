def solution(dots):
    answer = 0
    
    slope1 = (dots[1][1] - dots[0][1]) / (dots[1][0] - dots[0][0])
    slope2 = (dots[3][1] - dots[2][1]) / (dots[3][0] - dots[2][0])

    if slope1 == slope2:
        answer = 1

    slope1 = (dots[2][1] - dots[0][1]) / (dots[2][0] - dots[0][0])
    slope2 = (dots[3][1] - dots[1][1]) / (dots[3][0] - dots[1][0])

    if slope1 == slope2:
        answer = 1

    slope1 = (dots[1][1] - dots[0][1]) / (dots[1][0] - dots[0][0])
    slope2 = (dots[2][1] - dots[3][1]) / (dots[2][0] - dots[3][0])

    if slope1 == slope2:
        answer = 1
        
    return answer