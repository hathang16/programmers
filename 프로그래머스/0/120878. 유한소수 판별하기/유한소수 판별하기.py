def solution(a, b):
    answer = 1
    m = 1
    
    for i in range(1, a+1):
        if a % i == 0 and b % i == 0:
            m = i
    b //= m
    
    while b % 2 == 0:
        b /= 2
            
    while b % 5 == 0:
        b /= 5
        
    if b != 1:
        answer = 2
    
    return answer