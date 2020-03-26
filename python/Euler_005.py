def is_divisible(n):
    for i in range(2, 21):
        if n % i != 0:
            return False
    return True


num = 20
while not is_divisible(num):
    num += 20
print(num)
