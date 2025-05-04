def solution(rsp):
    answer = ''
    for char in rsp:
        if char == '2':      # 가위 → 바위
            answer += '0'
        elif char == '0':    # 바위 → 보
            answer += '5'
        elif char == '5':    # 보 → 가위
            answer += '2'
    return answer
