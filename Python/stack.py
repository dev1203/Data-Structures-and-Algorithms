
	# - Stack Implementation in python
	# - Methods:
	# - pop(): Remove from the top of the stack
	# - push(values): adds an int value to the top of the stack
	# - isEmpty(): Checks if the stack is empty or not

class Stack(object):
    def __init__(self):
        self.head = None
    def push(self,data):
        new_node = Node(data)
        new_node.nextNode = self.head
        self.head = new_node
    def print(self):
        while self.head != None:
            print(self.head.data)
            self.head = self.head.nextNode
    def pop(self):
        if self.head != None:
            self.head = self.head.nextNode
    def is_Empty(self):
        return self.head == None
class Node(object):
    def __init__(self,data):
        self.data = data
        self.nextNode = None
def main():
    stack = Stack()
    stack.push(10)
    stack.push(11)
    stack.push(12)
    stack.pop()
    stack.print()
if __name__== "__main__":
  main()