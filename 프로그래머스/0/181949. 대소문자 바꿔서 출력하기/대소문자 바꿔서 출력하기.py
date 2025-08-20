str = input()
answer = ""

for c in str:
    if c.isupper():
        answer += c.lower()
    else:
        answer += c.upper()

print(answer)