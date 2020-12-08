from flask import Flask

app = Flask(__name__)

@app.route('/')
def index():
    return 'Hello Flask'

@app.route('/greet')
@app.route('/greet/<name>')
def greet(name='default value'):
    return '<h1>Hello, %s! Welcome</h1>' % name