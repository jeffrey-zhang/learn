class Student(object):
    def __int__(self,name,score):
        self.name = name
        self.score = score

    def print_score(self):
        print('%s:%s' % (self.name,self.score))