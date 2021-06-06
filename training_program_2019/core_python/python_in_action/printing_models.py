unprinted_designs = ['iphone case','robot pendant','dodecahedron']

completed_models = []

while unprinted_designs:
    current_design = unprinted_designs.pop()
    print('Printing model:' + current_design)
    completed_models.append(current_design)

print("\n The following models have been printed:")
for completed_model in completed_models:
    print(completed_model)