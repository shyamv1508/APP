from functools import reduce

units = [8, 12, 15, 7, 20]

# a) Identify days with consumption above 10 units
high_consumption = list(filter(lambda unit: unit > 10, units))
print("High Consumption:", high_consumption)

# b) Calculate daily cost at Rs. 6 per unit
daily_cost = list(map(lambda unit: unit * 6, units))
print("Daily Cost:", daily_cost)

# c) Calculate total electricity consumption
total_units = reduce(lambda x, y: x + y, units)
print("Total Units:", total_units)

# d) Pure function to calculate the bill without changing data
def electricity_bill(consumption):
    return sum(consumption) * 6

print("Total Bill: Rs.", electricity_bill(units))
print("Original Data:", units)
