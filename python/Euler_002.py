n1 = 0
n2 = 1
sum = 0
total = 0

while sum <= 4000000:
    sum = n1 + n2
    n1 = n2
    n2 = sum
    if sum % 2 == 0:
        total += sum

print(total)
