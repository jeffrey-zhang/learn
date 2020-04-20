from flask import Flask,url_for,redirect

app = Flask(__name__)


@app.route('/')
def index():
    url1 = (url_for('news', id='10086'))
    return redirect(url1)

@app.route('/user/<name>')
def user_name(name):
    return 'Hello: %s' % name

@app.route('/news/<id>')
def news(id):
    return u'receive\'d id is %s' % id

if __name__ == '__main__':
    app.run(debug=True)
