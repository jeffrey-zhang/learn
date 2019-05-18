def find_product_price(products, product_id):
    for id, price in products:
        if id == product_id:
            return price
    return None

products = [
    (143121312,100),
    (432314553,30),
    (32421912367,150)
]

print('The price of product 43314553 is {}'.format(find_product_price(products,432314553)))

#list version
def find_unique_price_using_list(products):
    unique_price_list = []
    for _,price in products:
        if price not in unique_price_list:
            unique_price_list.append(price)
    return len(unique_price_list)

products2=[
    (143121312,100),
    (432314553,30),
    (324219122367,150),
    (937153201,30)
]
print('number of unique price is:{}'.format(find_unique_price_using_list(products2)))