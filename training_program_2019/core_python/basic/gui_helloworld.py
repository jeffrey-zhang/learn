from tkinter import *

class Application(Frame):
    def __init__(self,master=None):
        Frame.__init__(self,master)
        self.pack()
        self.createWidgets()

    def createWidgets(self):
        self.helloLabel = Label(self,text='Hello World')
        self.helloLabel.pack()
        self.quiteButton = Button(self,text="Quit",command=self.quit)
        self.quiteButton.pack()

app = Application()
app.master.title('Hello world')
app.mainloop()