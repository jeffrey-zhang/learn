import json

params = {
    'symbol':'123456',
    'type':'limit',
    'price':123.4,
    'amount':23
}

params_str = json.dumps(params)

print('after json serialization')
print('type of params_str={},params_str={}'.format(type(params_str),params_str))

origial_params = json.loads(params_str)

print('after json deserialization')
print('type of original_params = {},original_params={}'.format(type(origial_params),origial_params))

print('write the file in the disk...')
with open('corepython/params.json','w') as fout:
    params_str = json.dump(params,fout)

with open('corepython/params.json','r') as fin:
    origial_params = json.load(fin)

print('type of original_params = {}, original_params={}'.format(type(origial_params),origial_params))