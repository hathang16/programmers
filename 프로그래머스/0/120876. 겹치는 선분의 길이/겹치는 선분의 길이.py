def solution(lines):
    answer = 0
    coverage = [0] * 200

    for line in lines:
        start = line[0] + 100
        end = line[1] + 100
        for i in range(start, end):
            coverage[i] += 1

    for c in coverage:
        if c > 1:
            answer += 1

    return answer