def solution(age):
    answer = ''
    while age > 0:
        d = age % 10
        a = chr(d + ord('a'))
        answer = a + answer
        age //= 10
    return answer