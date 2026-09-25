text = input("Enter paragraph: ")

words = text.split()

print("Words:", len(words))
print("Characters:", len(text))
print("Sentences:", text.count(".") + text.count("!") + text.count("?"))

if len(words) > 0:
    print("Average word length:", len(text.replace(" ", "")) / len(words))