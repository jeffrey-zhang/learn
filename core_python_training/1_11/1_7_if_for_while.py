# To add a new cell, type '# %%'
# To add a new markdown cell, type '# %% [markdown]'
# %%
text = 'Today, is, Sunday'
text_list = [s.strip() for s in text.split(',') if len(s.strip()) > 3 ]
print(text_list)


# %%

attributes = ['name', 'dob', 'gender']
values = [['jason', '2000-01-01', 'male'], 
['mike', '1999-01-01', 'male'],
['nancy', '2001-02-01', 'female']
]


print([dict(zip(attributes,v)) for v in values])


# %%


