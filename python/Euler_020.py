import math

num = str(math.factorial(100))
digit_sum = sum(int(i) for i in num)
print(digit_sum)
