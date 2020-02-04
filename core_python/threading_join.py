import threading
import time

products = []
condition = threading.Condition()

class consumer(threading.Thread):
    def consume(self):
        global condition
        global products

        condition.acquire()
        if len(products) == 0:
            condition.wait()
            print('consumer is notified: no product to consume')

        products.pop()
        print("consumer notification: consume 1 product")
        print('consumer notification: there are ' + len(products) +" left that can be consume")

        condition.notify()
        condition.release()

    def run(self):
        for i in range(0,20):
            time.sleep(4)
            self.consume()

class Producer(threading.Thread):
    def produce(self):
        global condition
        global products

        condition.acquire()
        if len(products) == 10:
            condition.wait()
            print('consumer notified')