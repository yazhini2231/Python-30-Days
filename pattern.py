print("Triangle Pattern")
print("Enter the number of rows: ")
rows = int(input())

if rows <= 0:
    print("Please enter a positive number.")
else:
    for i in range(1, rows + 1):
        for j in range(1, i + 1):
            print("*", end="")
        print()


# square pattern
print("Square Pattern")
print("Enter the number of rows: ")
rows = int(input())

if rows <= 0:
    print("Please enter a positive number.")
else:
    for i in range(1, rows + 1):
        for j in range(1, rows + 1):
            print("*", end="")
        print()


# Diamond pattern
print("Diamond Pattern")
print("Enter the number of rows: ")
rows = int(input())

if rows <= 0:
    print("Please enter a positive number.")
else:
    # Top half
    for i in range(1, rows + 1):
        for j in range(1, rows - i + 1):
            print(" ", end="")
        for k in range(1, 2 * i):
            print("*", end="")
        print()

    # Bottom half
    for i in range(rows - 1, 0, -1):
        for j in range(1, rows - i + 1):
            print(" ", end="")
        for k in range(1, 2 * i):
            print("*", end="")
        print()