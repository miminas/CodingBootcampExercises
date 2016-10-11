///IN PROGRESS - INCOMPLETE///

maze = [[str(i) for i in line.strip()] for line in open('maze00.txt')]

for tile in maze:
    value_set = str(tile[0:])
    print (value_set[1:-1])
