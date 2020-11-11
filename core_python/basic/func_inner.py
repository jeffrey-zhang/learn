def outer():
    x = "local"
    def inner():
        x = 'nonlocal'
        print("inner:", x)
    inner()
    print("outer:", x)

outer()