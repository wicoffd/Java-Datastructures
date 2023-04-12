public class LinkedMatrix {
    static class Node{
        int data;
        Node right;
        Node down;
        }
    static Node constructLinkedMatrix(int[][] mat, int i, int j, int n, int m){

        while(i>n-1||j>m-1){ //check if i or j are out of bounds.
            return null;
        }
        Node temp = new Node();
        temp.data = mat[i][j];
        temp.right= constructLinkedMatrix(mat, i, j+1, n, m); //increment j
        temp.down = constructLinkedMatrix(mat, i+1, j, n, m); //increment i
        return temp;
    }
    static void display(Node head) {

        Node right;

        Node down = head;

        while (down != null) {      //while down is not empty
            right = down;

            while (right != null) { //while right is not empty
                System.out.print(right.data + " ");
                right = right.right;
            }
            System.out.println();
            down = down.down;
        }
    }
    public static void main(String[] args) {
        int[][] mat =  {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int n=3;
        int m=3;
        Node head = constructLinkedMatrix(mat, 0, 0, n, m);
        display(head);
        //Node head = constructLinkedMatrix(mat, 1, 1, n, m);
        //display(head);
    }
}
