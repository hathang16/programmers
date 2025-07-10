def solution(num_list, n):
    answer = []
    index = 0
    
    for i in range(len(num_list) // n):
        row = []
        for j in range(n):
            row.append(num_list[index])
            index += 1
        answer.append(row)
    
    return answer