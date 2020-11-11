# To add a new cell, type '# %%'
# To add a new markdown cell, type '# %% [markdown]'
# %%
d = {'b':1, 'a':2, 'c':10}
d_sorted_by_key = sorted(d.items(), key = lambda x:x[0])
d_sorted_by_value = sorted(d.items(), key = lambda x:x[1])
print(d_sorted_by_key)
print(d_sorted_by_value)


# %%
s = {3,4,2,1}
sorted(s)


# %%
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
print('The price of product 432314553 is {}'.format(find_product_price(products,432314553)))


# %%
import time
id = [x for x in range(0,100000)]
price = [x for x in range(200000,300000)]
products = list(zip(id,price))

def find_unique_price_using_list(products): 
    unique_price_list = [] 
    for _, price in products: # A 
        if price not in unique_price_list: #B 
            unique_price_list.append(price) 
    return len(unique_price_list)

def find_unique_price_using_set(products): 
    unique_price_set = set() 
    for _, price in products: 
        unique_price_set.add(price) 
    return len(unique_price_set)

start_using_list = time.perf_counter()
find_unique_price_using_list(products)
end_using_list = time.perf_counter()
print('Time elaspe using list:{}'.format(end_using_list - start_using_list))

start_using_set = time.perf_counter()
find_unique_price_using_set(products)
end_using_set = time.perf_counter()
print('Time elaspe using set:{}'.format(end_using_set-start_using_set))


# %%
import time
start_time1 = time.perf_counter()
d = {'name':'jason','age':20,'gender':'male'}
end_time1 = time.perf_counter()
print('Time of init direct:{}'.format(end_time1 - start_time1))

start_time2 = time.perf_counter()
d = dict({'name':'jason','age':20,'gender':'male'})
end_time2 = time.perf_counter()
print('Time of init using dict:{}'.format(end_time2 - start_time2))


# %%


