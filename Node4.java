
public class Node4 {
    Node4 left, right;
    int data;
 

    public Node4()
    {
        left = null;
        right = null;
        data = 0;
    }

    public Node4(int n)
    {
        left = null;
        right = null;
        data = n;
    }

    public void setLeft(Node4 n)
    {
        left = n;
    }

    public void setRight(Node4 n)
    {
        right = n;
    }

    public Node4 getLeft()
    {
        return left;
    }

    public Node4 getRight()
    {
        return right;
    }

    public void setData(int d)
    {
        data = d;
    }

    public int getData()
    {
        return data;
    }     

}
