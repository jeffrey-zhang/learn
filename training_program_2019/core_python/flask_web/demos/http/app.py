from flask import Flask, request, redirect, url_for, make_response, json, jsonify

from jinja2.utils import generate_lorem_ipsum

app = Flask(__name__)


@app.route('/hello')
def hello():
    name = request.args.get('name','Flask')
    return '<h1>Hello, %s</h1>' % name

@app.route('/hi')
def hi():
    return redirect(url_for('hello'))

@app.route('/foo')
def foo():
    data = {
        'name': 'jeffrey',
        'email': 'jeffrey@test.com'
    }
    response = make_response(json.dumps(data))
    response.mimetype = 'application/json'
    return response

@app.route('/foo2')
def foo2():
    data = {
        'name': 'jeffrey',
        'email': 'jeffrey@test.com'
    }
    return jsonify(data)

@app.route('/post')
def show_post():
    post_body = generate_lorem_ipsum(n=2)

    return '''
        <h1> A very long post </h1>
        <div class="body">%s</div>
        <button id="load">Lode More</button>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
        <script type="text/javascript">
            $(function() {
                $('#load').click(function() {
                    $.ajax({
                        url:'/more',
                        type:'get',
                        success:function(data){
                            $(.body).append(data)
                        }
                    })
                })
            })
        </script>
    '''

@app.route('/more')
def load_post():
    return generate_lorem_ipsum(n=1)