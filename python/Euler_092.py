def number_chain_result(n):
    current = n
    while True:
        next = sum(int(i) ** 2 for i in str(current))
        if next == 1:
            return 1
        elif next == 89:
            return 89
        else:
            current = next


starting_nums = sum(1 for i in range(1, 10000000) if number_chain_result(i) == 89)
print(starting_nums)
