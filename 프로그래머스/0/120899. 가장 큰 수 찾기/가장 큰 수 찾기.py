def solution(array):
    answer = [array[0], 0]
    
    for i in range(0,len(array)):
        if array[i] > answer[0]:
            answer[0] = array[i]
            answer[1] = i
    
    return answer