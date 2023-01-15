public void deleteNode(int key) {
    Node node = root;
  
    // Find the node to be deleted
    while (node != null && node.data != key) {
      // Traverse the tree to the left or right depending on the key
      if (key < node.data) {
        node = node.left;
      } else {
        node = node.right;
      }
    }
  
    // Node not found?
    if (node == null) {
      return;
    }
  
    // At this point, "node" is the node to be deleted
  
    // In this variable, we'll store the node at which we're going to start to fix the R-B
    // properties after deleting a node.
    Node movedUpNode;
    boolean deletedNodeColor;
  
    // Node has zero or one child
    if (node.left == null || node.right == null) {
      movedUpNode = deleteNodeWithZeroOrOneChild(node);
      deletedNodeColor = node.color;
    }
  
    // Node has two children
    else {
      // Find minimum node of right subtree ("inorder successor" of current node)
      Node inOrderSuccessor = findMinimum(node.right);
  
      // Copy inorder successor's data to current node (keep its color!)
      node.data = inOrderSuccessor.data;
  
      // Delete inorder successor just as we would delete a node with 0 or 1 child
      movedUpNode = deleteNodeWithZeroOrOneChild(inOrderSuccessor);
      deletedNodeColor = inOrderSuccessor.color;
    }
  
    if (deletedNodeColor == BLACK) {
      fixRedBlackPropertiesAfterDelete(movedUpNode);
  
      // Remove the temporary NIL node
      if (movedUpNode.getClass() == NilNode.class) {
        replaceParentsChild(movedUpNode.parent, movedUpNode, null);
      }
    }
  }