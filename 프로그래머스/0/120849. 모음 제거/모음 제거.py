def solution(my_string):
    vowels = "aeiou"
    answer = ''
    for char in my_string:
        if char not in vowels:
            answer += char
    return answer