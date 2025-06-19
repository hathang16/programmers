def solution(babbling):
    valid = ["aya", "ye", "woo", "ma"]
    answer = 0

    for word in babbling:
        for v in valid:
            word = word.replace(v, ' ')
        if word.strip() == '':
            answer += 1

    return answer