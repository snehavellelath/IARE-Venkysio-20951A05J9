import time

start = time.time()

str = input()
for i in str[::-1]:
    print(i, end="")

end = time.time()
print()
print(end - start)
