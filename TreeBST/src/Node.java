public class Node {

    int value; //valor que tendra el nodo
    Node left; //Nodeo a la izquierda
    Node right; //Nodeo a la derecha


    //Esta seria lla fabrica de jojitad para el arbol (BST)
    public Node(int value){

        this.value = value; //Coloca el valor al atributo del nodo
        this.left = null; //Como es un nuevo nodo, no tiene nada a la izquierda
        this.right = null; //Lo mismo de arriba pero a la derecha

    }
    
}
