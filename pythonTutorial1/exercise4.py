import math
a = float(input("Enter value for a: "))
b = float(input("Enter value for b: "))
c = float(input("Enter value for c: "))

root = (b ** 2) - (4 * a * c)

if root >= 0:
    x1 = (-b + math.sqrt(root)) / (2 * a)
    x2 = (-b - math.sqrt(root)) / (2 * a)
    print("The solutions of the quadratic equation you defined are: x1=",x1,"x2=",x2)
else:
    print("There are no real-valued solutions for this equation")
