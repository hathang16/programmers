def solution(id_pw, db):
    for user_id, user_pw in db:
        if id_pw[0] == user_id:
            if id_pw[1] == user_pw:
                return "login"
            else:
                return "wrong pw"
    return "fail"
