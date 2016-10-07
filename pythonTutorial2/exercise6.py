one, two, three, whole = [], [], [], []

for i in range(3):
   num1=int(input('Enter a 1-digit number:'))
   whole.append(num1)
   num2=int(input('Enter a 2-digit number:'))
   whole.append(num2)         
   num3=int(input('Enter a 3-digit number:'))
   whole.append(num3)

for i in range(9):
    if len(str(whole[i])) == 1:
        one.append(whole[i])
    elif len(str(whole[i])) == 2:
        two.append(whole[i])
    else:
        three.append(whole[i])
        
print("Enter numbers:",*whole)   
for i in range(3):
    print(" ",one[i],end="|")
print()
for i in range(3):
    print("",two[i],end="|")
print()
for i in range(3):
    print(three[i],end="|")
