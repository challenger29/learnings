/**
 * Created by z002r24 on 9/28/18.
 */
package dataStructures;

public class BinaryTree {






    public ArrayList<Node> findCousins(Node target)
    {
        if (target == null || root == null)
            return null;

        int level = 0;
        Node n = target;
        while (n.parent != null)
        {
            n = n.parent;
            level++;
        }

        Queue<Node> q = new LinkedList<Node>();

        q.add(root);
        int count = 1;

        while (!q.isEmpty())
        {
            if (level == 0)
            {
                ArrayList<Node> cousins = new ArrayList<Node>();
                while (!q.isEmpty())
                {
                    Node cousin = q.remove();
                    if (cousin.parent != target.parent)
                        cousins.add(cousin);
                }

                return cousins;
            }

            Node current = q.remove();

            if (current.left != null)
                q.add(current.left);

            if (current.right != null)
                q.add(current.right);

            if (--count == 0)
            {
                level--;
                count = q.size();
            }
        }

        return null;
    }
}

