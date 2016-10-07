count = 1
sum = 1
quantity = input('How many triangular numbers do you want? ')
quantity = int(quantity)

while count <= quantity:
    print(sum, end=" ")
    count += 1
    sum = sum + count
