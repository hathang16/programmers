def solution(s):
    tokens = s.split()
    answer = 0
    stack = []

    for token in tokens:
        if token == "Z":
            if stack:
                answer -= stack.pop()
        else:
            num = int(token)
            answer += num
            stack.append(num)

    return answer