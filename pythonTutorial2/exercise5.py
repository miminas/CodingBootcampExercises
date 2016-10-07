year=int(input('Enter a year:'))

a = year % 4
b = year % 7
c = year % 19
d = (19 * c + 15) % 30
e = ( 2 * a + 4 * b - d + 34) % 7

month = (((d + e + 114) // 31))
day = ((( d + e + 114) % 31) + 1) + 13

if day >= 31:
    day -= 30
    month += 1

print("Year:",year)
print("Day:", day,end=" ")
print("Month:", month)
