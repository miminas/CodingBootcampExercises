x = input("Please enter an 8-bit binary number: ")
count = 0

for a in range (7):
    if int(x[a])==1:
        count += 1

if ( count % 2 ) == 0:
    if int(x[-1]) == 0:
        print("Parity check OK.")
    else:
        print("Parity check not OK.")
else:
    if int(x[-1]) == 1:
        print("Parity check OK.")
    else:
        print("Parity check not OK.")
