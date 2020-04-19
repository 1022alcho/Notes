class BinarySearchTree { 
    class Node { 
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
    Node root;
    
    public Node search(Node root, int key){
        if(root.data == key || root == null) { 
            return root;
        } else if(root.data > key) { 
            return search(root.left, key);
        } else {
            return search(root.right, key);
        } 
    }
    
    public void insert(int data) { 
        root = insert(root, data);
    }
    public Node insert(Node root, int data) { 
        if(root == null) { 
            return new Node(data);
        } else if(root.data > data) { 
            return insert(root.left, data);
        } else if(root.data < data) {
            return insert(root.right, data);
        }
        return root;
    }

    public void delete(int data) {
        root = delete(root, data);
    }
    public Node delete(Node root, int data) { 
        if(root == null) { 
            return null;
        } else if(root.data > data) { 
            return delete(root.left, data);
        } else if(root.data < data) { 
            return delete(root.right, data);
        } else { 
            //found
            if(root.left == null && root.right == null) { 
                return null;
            } else if(root.left == null && root.right != null) { 
                return root.right; 
            } else if(root.left != null && root.right == null) { 
                return root.left;
            } else { 
                //if both left and right exist
                root.data = findMin(root.right);
                root.right = delete(root.right, root.data);
            }
            return root;
        }
    }

    public int findMin(Node root) { 
        if(root.left == null) { 
            return root.data;
        } else if(root.left != null) { 
            return findMin(root.left);
        } 
        return 0;
    }

    public void printTree(Node root) { 
        if(root != null) { 
            System.out.println(root.data);
        } 
    }
}

public class Test { 
    public static void main(String[] args) { 
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(4);
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(6);
        tree.insert(5);
        tree.insert(7);
    }
}

