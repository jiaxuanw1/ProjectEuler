def compute():
    num = 0
    i = 1
    while True:
        num += i
        divisors = sum(2 for j in range(1, int(num ** 0.5) + 1) if num % j == 0)
        if num ** 0.5 % 1 == 0:
            divisors -= 1
        if divisors > 500:
            return num
        i += 1


print(compute())
