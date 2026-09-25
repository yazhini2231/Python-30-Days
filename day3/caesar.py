text = input("Enter text: ")
shift = int(input("Enter shift: "))

result = ""

for ch in text:
    if ch.isalpha():
        result += chr((ord(ch) - ord('a') + shift) % 26 + ord('a'))
    else:
        result += ch

print("Encrypted:", result)