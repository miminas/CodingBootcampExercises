x = input("Please enter an 10-digit number: ")
even, odd = [], []

if len(x) != 10:
    print("Not a 10-digit number")
else:
    for a in range (10):
        if a%2 == 0:
            even.append(int(x[a]))
        else:
            odd.append(int(x[a]))

print(*even)
print('',*odd)
