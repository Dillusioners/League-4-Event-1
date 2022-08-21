num = 0 # stores the sum

# loop for getting the final number
for i in range(2, 10000000): 
    isPrime = True
    # generates a prime number
    for j in range(2, i):
        if(i % j == 0):
            isPrime = False
            break
    # adding of numbers and checking if prime or not
    if(isPrime):
        num += i
        isPrime2 = True
        for k in range(2, num):
            if(num % k == 0):
                isPrime2 = False
                break
        if(isPrime2):
            print(f"{num}")
        if(num >= 1000000):
            break
