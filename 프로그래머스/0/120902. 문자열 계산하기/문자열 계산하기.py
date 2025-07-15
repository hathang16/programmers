def solution(my_string):
    tokens = my_string.split()
    answer = int(tokens[0])
    
    for i in range(1, len(tokens) - 1, 2):
        if tokens[i] == "+":
            answer += int(tokens[i + 1])
        elif tokens[i] == "-":
            answer -= int(tokens[i + 1])
    
    return answer