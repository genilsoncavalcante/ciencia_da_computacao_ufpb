# write a program that receives 10 numbers
definedNumber = 10 
multiple = 3
numsDigited = []
numsMultiples = []

for cnt in range(0, definedNumber, 1):
    numsDigited += [int(input("Enter a number: "))]
    
for num in numsDigited:
    if(num % multiple == 0):
        numsMultiples += [num]

print(f"All numbers: {numsDigited}")
print(f"Multiples of 3 are: {numsMultiples}")
