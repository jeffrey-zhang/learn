import time

start_time = time.perf_counter()
s = ''
for n in range(1,1000000):
    s += str(n)
end_time = time.perf_counter()
print('time elapse of +=:{}'.format(end_time-start_time))

start_time = time.perf_counter()
l = []
for n in range(1,1000000):
    l.append(str(n))
s = ''.join(l)
end_time = time.perf_counter()
print('time elapse of join:{}'.format(end_time-start_time))

start_time = time.perf_counter()
s = "".join(map(str,range(1,1000000)))
end_time = time.perf_counter()
print('time elapse of map:{}'.format(end_time-start_time))