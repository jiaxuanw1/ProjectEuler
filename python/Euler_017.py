ONES = ["", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
TENS = ["", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"]
TEENS = ["ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"]


def to_words(n):
    if n < 10:
        return ONES[n]
    elif n < 20:
        return TEENS[n % 10]
    elif n < 100:
        if n % 10 == 0:
            return TENS[n // 10]
        else:
            return TENS[n // 10] + " " + ONES[n % 10]
    elif n < 1000:
        if n % 100 == 0:
            return ONES[n // 100] + " hundred"
        elif 9 < n % 100 < 20:
            return ONES[n // 100] + " hundred and " + TEENS[n % 10]
        else:
            return ONES[n // 100] + " hundred and " + TENS[(n // 10) % 10] + " " + ONES[n % 10]
    elif n == 1000:
        return "one thousand"
    else:
        return None


total_letters = sum(len(to_words(i).replace(" ", "")) for i in range(1, 1001))
print(total_letters)
