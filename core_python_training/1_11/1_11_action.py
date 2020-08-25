class Document():
    def __init__(self,title, author, context):
        print('init function called')
        self.title = title
        self.author = author
        self.__context = context # priviate object

    def get_context_length(self):
        return len(self.__context)

    def intercept(self, length):
        self.__context = self.__context[:length]


harry_potter_book = Document('Harry potter','J.K. Rowling', '...forever Do not believe any thing is capable of thinking independently...')

print(harry_potter_book.title)
print(harry_potter_book.author)
print(harry_potter_book.get_context_length())

harry_potter_book.intercept(10)
print(harry_potter_book.get_context_length())

print(harry_potter_book.__context)