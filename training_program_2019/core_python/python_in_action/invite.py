guests = ['Nick','Jeffrey',"Tom","Pingping"]

print(guests)

guests[2] = 'Apple'
print(guests)

guests.insert(0,"Orange")
guests.insert(3,"Fox")
guests.append("DD")
print(guests)

while len(guests) > 2:
    print(guests.pop(-1))
print(guests)


my_foods = ['Pizza','falafel','carrot cake']
friend_foods = my_foods
boy_foods = my_foods[:]
my_foods.append('cannoli')
friend_foods.append('ice cream')
boy_foods.append('app')
print(my_foods)
print(friend_foods)
print(boy_foods)