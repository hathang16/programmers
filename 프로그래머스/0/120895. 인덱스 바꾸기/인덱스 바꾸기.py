def solution(my_string, num1, num2):
    str_list = list(my_string)
    str_list[num1], str_list[num2] = str_list[num2], str_list[num1]

    answer = ''
    for ch in str_list:
        answer += ch

    return answer