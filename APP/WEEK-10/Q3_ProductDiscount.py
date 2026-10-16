prices = [500, 1200, 2000, 800, 1500]

# a) Pure function to calculate the discounted price
def discount(price):
    if price > 1000:
        return price * 0.80
    return price

# b) Apply the discount function to every product
discounted_prices = list(map(discount, prices))
print("Discounted Prices:", discounted_prices)

# c) Identify products costing more than Rs. 1,000
eligible_products = list(filter(lambda price: price > 1000, prices))
print("Eligible Products:", eligible_products)

# The function returns a new value and does not modify prices.
