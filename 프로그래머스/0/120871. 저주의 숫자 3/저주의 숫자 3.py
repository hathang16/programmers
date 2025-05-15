def solution(n):
    answer = 1
    count = 0

    while count < n:
        if answer % 3 != 0 and '3' not in str(answer):
            count += 1
        answer += 1

    return answer - 1