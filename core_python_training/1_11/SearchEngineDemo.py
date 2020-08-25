import re

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
# main(search_engine)

class BOWEngine(SearchEngineBase):
    def __init__(self):
        super(BOWEngine, self).__init__()
        self.__id_to_words = {}

    def process_corpus(self, id, text):
        self.__id_to_words[id] = self.parse_text_to_words(text)

    def search(self, query):
        query_words = self.parse_text_to_words(query)
        results = []
        for id,words in query_words.items():
            if self.query_match(query_words,words):
                results.append(id)

        return results

    @staticmethod
    def query_match(query_words,words):
        for query_word in query_words:
            if query_word not in words:
                return False
        return True

    @staticmethod
    def parse_text_to_words(text):
        text = re.sub(r'[^\w]', ' ', text)
        text = text.lower()
        word_list = text.split(' ')
        word_list = filter(None,word_list)
        return set(word_list)

search_engine = BOWEngine()
main(search_engine)