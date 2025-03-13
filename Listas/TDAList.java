public interface TDAList<T> {

        /**
         * Insertar un nuevo elemento  en la posición i
         * 
         * @param i la posición donde vamos a insertar el elemento
         * @param e el elemento que se va a insertar 
         * @throws IndexOutOfBoundsException si el indice esta fuera del rago 
         */
        public void add(int i, T e)throws IndexOutOfBoundsException;


        /** 
         * Elimina un elemento en la posición i, y te regresa el elemento que se esta eliminando
         * 
         * @param i indice del elemento que se va a eliminar
         * @throws IndexOutOfBoundsException si el indice esta fuera del rango
         */
        public T remove (int i) throws IndexOutOfBoundsException;

        /** 
         * Elimina todos los elementos de una lista
         */
        public void clear();

        /**
         * Obtener un elemento en una posición especifica
         * 
         * @param i indice del elemento en la posición i
         * @throws IndexOutOfBoundsException;
         */
        public T get(int i) throws IndexOutOfBoundsException;

        /**
         * Método para verificar si un elemento esta en la lista
         * 
         * @param e Elemento que se va a buscar
        */
        public boolean contains(T e);

        /**
         * Varifica si la lista esta vacia
         */
        public boolean isEmpty();

        /**
         * Obtener el tamaño de la lista 
         */
        public int size();
    
}
