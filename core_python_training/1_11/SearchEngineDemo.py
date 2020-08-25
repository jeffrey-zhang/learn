class SearchEngineBase(object):
    def __init__(self):
        pass

    def add_corpus(self,file_path):
        with open(file_path,'r') as fin:
            text = fin.read()

        self.process_corpus(file_path,text)

    def process_corpus(self,id,text):
        raise Exception("process_corpus not implemented")

    def search(self,query):
        raise Exception("search not implemented")


def main(search_engine):
    for file_path in ['1.txt','2.txt','3.txt','4.txt','5.txt']:
        search_engine.add_corpus('core_python_training/1_11/' + file_path)

    while True:
        query = input('Please input the word to search?\n')
        results = search_engine.search(query)
        print('found {} results'.format(len(results)))
        for result in results:
            print(result)

class SimpleEnginee(SearchEngineBase):
    def __init__(self):
        super(SimpleEnginee, self).__init__()
        self.__id_to_text = {}

    def process_corpus(self, id, text):
        self.__id_to_text[id] = text

    def search(self, query):
        results = []
        for id,text in self.__id_to_text.items():
            if query in text:
                results.append(id)
            return results

search_engine = SimpleEnginee()
main(search_engine)