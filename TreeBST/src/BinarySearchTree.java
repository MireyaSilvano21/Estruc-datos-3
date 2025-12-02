public class BinarySearchTree {

    private Node root; //Raiz del arbol BST 


    /************
     * 
     * Metodo publico para insertar
     * ************** */
    public void insert(int value){
        //Inovacion recursiva para saber donde se coloca el nuevo nodo
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node current, int valor){
        //Caso base, cuando current sea null, entonces aqui se crea un nuevo nodo

        if (current == null ) {

            return new Node(valor);
            
        }
        //Si el valor a insertar es menor, entonces vamos al subarbol izquierdo
        if (valor < current.value) {
            current.left = insertRecursive(current.left, valor);
        }

        //Si el valor a insentar es mayor al valor actual, entonces vamos al subarbol derecho
         else if (valor > current.value) {
            current.right = insertRecursive(current.right, valor);
            
        } 
        //Cuando los valores son iguales, no se hace nada
        //retornar el nodo actual

        return current;
    }

    public void printInOrden(){
        printInOrderRecursive(root);
    }


    private void printInOrderRecursive(Node current){
        if (current != null) {
            printInOrderRecursive(current.left);
            System.out.print(current.value + " ");
            printInOrderRecursive(current.right);

        }

    }
    
}
