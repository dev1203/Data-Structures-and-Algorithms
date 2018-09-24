class LinkedList(object):
    def __init__(self):
        self.head = None
        self.size = 0
    def insert(self,data):
        if self.head == None:
            self.head = Node(data)
        else:
            new_node = Node(data)
            new_node.nextNode = self.head
            self.head = new_node
        self.size = self.size + 1
    def insert_at_end(self,data):
        if self.head == None:
            self.head = Node(data)
        else:
            current = self.head
            while current.nextNode != None:
                current = current.nextNode
            current.nextNode = Node(data)
        self.size = self.size + 1
    def remove(self,data):
        if self.head != None:
            current = self.head
            while current.nextNode != None:
                if current.nextNode.data == data:
                    current.nextNode = current.nextNode.nextNode
                else:
                    current = current.nextNode
        self.size = self.size -1
    def print(self):
        if self.head != None:
            current = self.head
            while current != None:
                print(current.data)
                current = current.nextNode
    def get_size(self):
        print(self.size)
class Node(object):
    def __init__(self, data):
        self.data = data
        self.nextNode = None

def main():
  my_list = LinkedList()
  my_list.insert(10)
  my_list.insert(12)
  my_list.insert_at_end(13)
  my_list.remove(13)
  my_list.print()
if __name__== "__main__":
  main()