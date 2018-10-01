package BinarySearchTree;
public class BinarySearchTree<T extends Comparable<T>> implements Tree<T>{
    private Node<T> root;
    @Override
    /*
        - Traverse the bst
    */
    public void traversal(){
        if (root!=null){
            traverseInOrder(root);
        }
        System.out.println();
    }
    /*
        - Hepler method to traverse the BST in inorder 
        - return null
    */
    public void traverseInOrder(Node<T> node){
        if(node.getLeftChild() != null){
        traverseInOrder(node.getLeftChild());
        }
        System.out.print(node+" -->");
        if(node.getRightChild() != null){
            traverseInOrder(node.getRightChild());
        }
    }
    /*
        - Helper method takes data  
        - and then call insertNode if root not null
        - @return null
    */
    public void insert(T data){
        if(root == null){
            root = new Node<T>(data);
        } else{
            insertNode(data, root);
        }
    }
    /*
        - Insert Method takes two argument
        - first data to be inserted and second the currentNode in recurion
        - @retuns null
    */
    @Override
    public void insertNode(T newdata,Node<T> currentNode){
        if(newdata.compareTo(currentNode.getData()) < 0){
            // Smaller that means insert at right
            if(currentNode.getLeftChild() != null){
                insertNode(newdata, currentNode.getLeftChild());
            } else{
                Node<T> newNode = new Node<T>(newdata);
                currentNode.setLeftChild(newNode);
            }
        } else{
            if(currentNode.getRightChild() != null){
                insertNode(newdata, currentNode.getRightChild());
            } else{
                Node<T> newNode = new Node<T>(newdata);
                currentNode.setRightChild(newNode);
            }
        }
    }
    /*

    */
    @Override
    public void delete(T data){
        if (root != null){
            root = deleteNode(data, root);
        }
    }
    public Node<T> deleteNode(T data, Node<T> currentNode){
        if (currentNode == null) return currentNode;

        if(data.compareTo(currentNode.getData()) < 0){
            currentNode.setLeftChild(deleteNode(data,currentNode.getLeftChild()));
        }
        else if(data.compareTo(currentNode.getData()) > 0){
            currentNode.setRightChild(deleteNode(data,currentNode.getRightChild()));
        }
        else{
            // Item with no children
            if (currentNode.getLeftChild() == null && currentNode.getRightChild() == null){
                return null;
            }
            // Item with one right child
            if( currentNode.getLeftChild() == null){
                Node<T> tempNode = currentNode.getRightChild();
                currentNode = null;
                return tempNode;
            }
            // Item with one left child
            else if(currentNode.getRightChild() == null){
                Node<T> tempNode = currentNode.getLeftChild();
                currentNode = null;
                return tempNode;
            }
            // Item with both child
            Node<T> tempNode = getPredecesor(currentNode.getLeftChild());
            currentNode.setData(tempNode.getData());
            currentNode.setLeftChild(deleteNode(tempNode.getData(),currentNode.getLeftChild()));
        }
        return currentNode;
    }
    public Node<T> getPredecesor(Node<T> node){
        if(node.getRightChild() != null){
            return getPredecesor(node.getRightChild());
        }
        return node;
    }
    /*
        - Get the minimun value iteratively
        - returns T or null
    */
    @Override
    public T getMin(){
        if (root != null){
            Node<T> current = root;
            while(current.getLeftChild() != null){
                current = current.getLeftChild();
            }
            return current.getData();
        } else{
            return null;
        }
    }
    /*  
        - check if root is null otherwise
        - calls the recursive method
    */
    @Override
    public T getMax(){
        if (root == null) return null;
        return getMaxValue(root);
    }
    /*
        - Recursive method to traverse the right
        - subtree and return the max
    */
    public T getMaxValue(Node<T> current){
        if(current.getRightChild() != null){
            return getMaxValue(current.getRightChild());
        }
        return current.getData();
    }   
}