members = ['jeffrey','nick','admin','apple','xiaoming','']
for member in members:
    if member:
        if member == 'admin':
            print("Hello " + member.title() + ", Would you like to see a status report?")
        else:
            print("Hello " + member.title() + ", thank you for logging in again")
    else:
        print("We need to find some users")

# 5-10
print('\n')

current_users = ['jeffrey','nick','admin','eric','apple']

new_users = ['apple','Jeffrey','xiaoming','orange','kevin']

for user in new_users:
    if user.lower() in [c_user.lower() for c_user in current_users]:
        print(user.title() + " isn't avaiable!")
    else:
        print("you can register by " + user.title())

#5-11
print("\n")
num_list = range(1,10)
for num in num_list:
    if num == 1:
        print('1st')
    elif num == 2:
        print('2nd')
    elif num == 3:
        print("3rd")
    else:
        print(str(num)+"th")