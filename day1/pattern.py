print("Triangle Pattern")
print("Enter the number of rows: ")
rows = int(input())
for i in range(1, rows + 1):
    for j in range(1, i + 1):
        print("*", end="")
    print()
#square pattern
print("Square Pattern")
print("Enter the number of rows: ")
rows = int(input())
for i in range(1, rows + 1):
    for j in range(1, rows + 1):
        print("*", end="")
    print()
    #Diamond pattern
print("Diamond Pattern")
print("Enter the number of rows: ")
rows = int(input()) 
for i in range(1, rows + 1):
    for j in range(1, rows - i + 1):
        print(" ", end="")
    for k in range(1, 2 * i):
        print("*", end="")
    print()