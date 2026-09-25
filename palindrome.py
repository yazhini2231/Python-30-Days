text = input("Enter text: ")

text = text.lower().replace(" ", "")

if text == text[::-1]:
    print("Palindrome")
else:
    print("Not Palindrome")