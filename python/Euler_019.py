DAYS_IN_MONTH = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

day_of_week = 1
sundays = 0

for y in range(1900, 2001):
    for m in range(1, 13):
        if y >= 1901 and day_of_week == 0:
            sundays += 1

        if m == 2 and y % 4 == 0 and (y % 100 != 0 or y % 400 == 0):
            day_of_week = (day_of_week + 29) % 7
        else:
            day_of_week = (day_of_week + DAYS_IN_MONTH[m]) % 7

print(sundays)
