def solution(array, n):
    array.sort()
    answer = array[0]

    for num in array:
        if abs(num - n) < abs(answer - n):
            answer = num
        elif abs(num - n) == abs(answer - n) and num < answer:
            answer = num

    return answer