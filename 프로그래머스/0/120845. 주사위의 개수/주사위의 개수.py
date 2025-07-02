def solution(box, n):
    answer = 0
    
    w = box[0] // n;
    l = box[1] // n;
    h = box[2] // n;
        
    answer = w * l * h;
        
    return answer