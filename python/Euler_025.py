n1 = 1
n2 = 1
sum = 0
count = 2

while len(str(sum)) < 1000:
    sum = n1 + n2
    n1 = n2
    n2 = sum
    count += 1

print(count)
