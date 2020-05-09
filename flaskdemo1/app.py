from flask import Flask,url_for,redirect, render_template
import random

app = Flask(__name__)


@app.route('/')
def index():
    return render_template("index.html")

@app.route('/user/<username>')
def user_name(username):
    return render_template('user.html',name=username)

@app.route('/goods/list')
def goods_list():
    goods = [{'name':'怪味xxx','price':138.00},
             {'name':'牛仔外衣','price':100},
             {'name':'西装外套', 'price': 138},
             {'name':' RICE 复古', 'price': 189}]
    return render_template('goods.html',**locals())

def do_index_class(index):
    if index % 3 == 0:
        return 'line'
    else:
        return ''
    app.add_template_filter(do_index_class,'index_class')

if __name__ == '__main__':
    app.run()
