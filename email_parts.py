email = input("Enter email: ")

if "@" in email and "." in email:
    username, domain = email.split("@")
    print("Username:", username)
    print("Domain:", domain)
else:
    print("Invalid email")