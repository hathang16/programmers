def solution(order):
    answer = 0

    order_str = str(order)

    for ch in order_str:
        if ch in ('3', '6', '9'):
            answer += 1

    return answer