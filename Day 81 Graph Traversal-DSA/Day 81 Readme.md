BFS iterative
Breadth First Search uses a queue to traverse the graph in a level like manner. A start node is added to the queue to start.

As long as the queue is not empty, a node is removed and its unvisited neighbors are added to the queue. Since a graph may contain cycles, a visited hash set is used to keep track of all visited nodes. We only want to add unvisited nodes into the queue!

BFS pseudocode:
	Initialize a queue
	Initialize a visited hash set (this is just one way to keep track of visited nodes)
	Add start node to queue.
	Add start node's value to visited set.
	While the queue's size is not empty:
		Remove a node.
		Print the node's value.
		Add all unvisited neighbors into the queue and visited set.
	end


    DFS iterative
Depth First Search is the opposite of BFS. It uses a stack instead to traverse the graph. A start node is pushed to the stack. As long as the stack is not empty, a node is popped, and its unvisited neighbors are added to the stack.

The graph is traversed in-depth because the node that is popped off the stack is the most recently pushed. Just like in BFS, a visited set is used.

DFS pseudocode:
    Initialize a stack
    Initialize a visited hash set
    Push start node to stack.
    while the stack's size is not empty:
        Pop a node.
        If the node has not been visited:
            Print the node's value.
            Add node to visited set.
        end
        Add all unvisited neighbors into the stack.
    end