largest_palindrome = 0

for i in range(100, 1000):
    for j in range(100, 1000):
        product = i * j
        reverse = int(str(product)[::-1])
        if reverse == product and reverse > largest_palindrome:
            largest_palindrome = reverse

print(largest_palindrome)
