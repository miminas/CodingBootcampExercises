x = input("Please enter an 9-digit number: ")
r1, r2, r3 = [], [], []

if len(x) != 9:
    print("Not a 9-digit number")
else:
    for a in range (9):
        if a%3 == 0:
            r1.append(int(x[a]))
        elif a%3 == 1:
            r2.append(int(x[a]))
        else:
            r3.append(int(x[a]))

print(*r1)
print('',*r2)
print(' ',*r3)
