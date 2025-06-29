def solution(numbers, k):
    answer = 0
    
    for i in range(1, k):
        answer += 2
        answer %= len(numbers)
    
    return numbers[answer]