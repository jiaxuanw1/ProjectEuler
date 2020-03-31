longest_start = 1
longest_length = 1

for i in range(2, 1000000):
    n = i
    term = 0

    while n != 1:
        term += 1
        if n % 2 == 0:
            n /= 2
        else:
            n = n * 3 + 1

    if term > longest_length:
        longest_start = i
        longest_length = term

print(longest_start)
