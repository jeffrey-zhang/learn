name = input('your name:')
gender = input('are you a boy?(y/n)')

welcome_str = 'Welcome to the matrix {prefix} {name}.'
welcome_dict = {
    'prefix':'Mr.' if gender == 'y' else 'Mrs',
    'name': name
}

print('authorizing....')
print(welcome_str.format(**welcome_dict))

a = input()
b = input()
print('a+b={}'.format(a+b))

print('type of a is {}, type of b is {}'.format(type(a),type(b)))