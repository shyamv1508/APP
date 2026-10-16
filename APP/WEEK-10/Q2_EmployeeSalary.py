from functools import reduce

salaries = [25000, 35000, 40000, 50000, 30000]

# a) Give a 10% increment to salaries below Rs. 40,000
revised = list(map(
    lambda salary: salary * 1.10 if salary < 40000 else salary,
    salaries
))
print("Revised Salaries:", revised)

# b) Identify employees eligible for the increment
eligible = list(filter(lambda salary: salary < 40000, salaries))
print("Eligible Salaries:", eligible)

# c) Calculate total salary expenditure after revision
total = reduce(lambda x, y: x + y, revised)
print("Total Expenditure: Rs.", total)

# Functional programming processes records concisely
# without changing the original salary list.
