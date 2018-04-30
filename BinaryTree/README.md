### Tree

##### 트리는 계층적 자료구조

##### 그 중에서도 Binary Tree를 구현해보았다. Binary Tree는 각 노드의 자식 수가 2 이하인 트리이다.

##### Binary Tree를 순회하는 방법은 네가지가 있다. 노드를 방문하는 것을 노드의 key를 출력하는거라 가정하고 다음과 같은 Tree가 주어졌을 떄
![img](https://github.com/jis1218/Java-Data-Structure/tree/master/BinaryTree/img)
> ##### 전위순회(Preorder Traversal) - 자식노드를 다 방문 후 부모 노드로 돌아온다. 다음과 같은 순서로 방문한다. A-B-D-G-E-H-C-F
```java
public void preorder(Node n){
    if(n!=null){
        System.out.print(n.getKey()+", ");
        preorder(n.getLeftNode());
        preorder(n.getRightNode());
    }
}
```
> ##### 중위순회(Inorder Traversal) - 왼쪽 서브트리부터 순회를 진행한다. 다음과 같은 순서로 방문한다. D-G-B-H-E-A-C-F
```java
public void inorder(Node n){
    if(n!=null){
        inorder(n.getLeftNode());
        System.out.print(n.getKey()+", ");
        inorder(n.getRightNode());
    }
}
```
> ##### 후위순회(Postorder Traversal) - 왼쪽 서브트리 방문 후 오른쪽 서브트리 방문. 다음과 같은 순서로 방문한다. G-D-H-E-B-F-C-A
```java
public void postorder(Node n){
    if(n!=null){
        postorder(n.getLeftNode());			
        postorder(n.getRightNode());
        System.out.print(n.getKey()+", ");
    }
}
```

> ##### 레벨순회(Levelorder Traversal) - 최상위 레벨부터 시작하여 각 레벨마다 좌에서 우로 노드를 방문. 다음과 같은 순서로 방문한다. A-B-C-D-E-F-G-H
```java
public void levelorder(Node root){
    ListQueue<Node> queue = new ListQueue<>();
    Node t;
    queue.push(root);
    while(!queue.isEmpty()){
        t = queue.pop();
        System.out.println(t.getKey());
        if(t.getLeftNode() != null){
            queue.push(t.getLeftNode());
        }
        if(t.getRightNode() != null){
            queue.push(t.getRightNode());
        }
    }
}
```

##### 전위, 중위, 후위 순회는 시스템 스택을 이용하고 레벨 순회는 큐를 만들어 이용한다. 시스템 스택을 사용하지 않는 이진트리를 스레드 이진트리라 한다.