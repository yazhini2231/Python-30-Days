name = input("Enter your name: ")

print("Upper:", name.upper())
print("Lower:", name.lower())
print("Title:", name.title())
print("Reverse:", name[::-1])

words = name.split()
print("Initials:", "".join(word[0] for word in words))

vowels = "aeiou"
count = 0

for ch in name.lower():
    if ch in vowels:
        count += 1

print("Vowels:", count)