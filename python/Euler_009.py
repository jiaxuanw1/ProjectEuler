def product():
    for a in range(1, 999):
        for b in range(1, 1000 - a + 1):
            c = (a ** 2 + b ** 2) ** 0.5
            if c % 1 == 0 and a + b + c == 1000:
                return a * b * c


print(product())
