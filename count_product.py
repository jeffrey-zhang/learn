import time
id = [x for x in range(0,100000)]
price = [x for x in range(200000,300000)]
priducts = list(zip(id,price))

#list version
def find_unique_price_using_list(products):
    unique_price_list = []
    for _,price in products:
        if price not in unique_price_list:
            unique_price_list.append(price)
    return len(unique_price_list)

#set version
def find_unique_price_using_set(products):
    unique_price_set = set()
    for _,price in products:
        unique_price_set.add(price)
    return len(unique_price_set)

start_using_list = time.perf_counter()
find_unique_price_using_list(priducts)
end_using_list = time.perf_counter()
print('time elapse using list:{}'.format(end_using_list,start_using_list))

start_using_set = time.perf_counter()
find_unique_price_using_set(priducts)
end_using_set = time.perf_counter()
print('time elapse using set:{}'.format(end_using_set,start_using_set))