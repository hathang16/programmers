import re

def solution(my_string):
    answer = 0
    arr = re.findall(r'\d+', my_string)

    for num in arr:
        answer += int(num)

    return answer
