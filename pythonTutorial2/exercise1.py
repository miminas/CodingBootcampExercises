tin = str(input("Please enter a TIN number: "))
a = -2
b = 1
total = 0
check = 0

while a>-10:
    total+=(int(tin[a]))*(2**b)
    a-=1
    b+=1

check = (total % 11) % 10

if int(check)==int(tin[-1]):
    print("Tax Identification Number valid.")
else:
    print("Tax Identification Number not valid.")
