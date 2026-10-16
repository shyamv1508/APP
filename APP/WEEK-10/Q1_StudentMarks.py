from functools import reduce

marks = [45, 60, 75, 90, 35]

# a) Identify students scoring 50 or above
passed = list(filter(lambda x: x >= 50, marks))
print("Passed Marks:", passed)

# b) Award 5 grace marks, with a maximum of 100
grace_marks = list(map(lambda x: min(x + 5, 100), marks))
print("Marks after Grace:", grace_marks)

# c) Calculate total marks after grace marks
total = reduce(lambda x, y: x + y, grace_marks)
print("Total Marks:", total)

# d) Lambda functions make short operations concise.
