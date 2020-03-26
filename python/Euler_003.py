n = 600851475143
factor = 3

while factor < n:
    if n % factor == 0:
        n /= factor
        factor = 3
    else:
        factor += 2

print(n)
