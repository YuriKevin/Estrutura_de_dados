/**
 * Interface que define as operações básicas de uma lista.
 * Esta interface define os métodos que devem ser implementados
 * por qualquer classe que represente uma estrutura de dados do tipo lista.
 *
 * @param <T> o tipo dos elementos armazenados na lista
 * @author Yuri Kevin Nascimento de Araujo
 * @version 1.0
 * @since 2025-11-03
 */
public interface Listable <T> {
	/**
	 * Adiciona um elemento ao final da lista.
	 *
	 * @param dado o elemento a ser adicionado
	 * @throws OverflowException se a lista estiver cheia
	 */
	void append(T dado);
	
	/**
	 * Insere um elemento em uma posição específica da lista.
	 *
	 * @param posicao a posição onde o elemento será inserido
	 * @param dado o elemento a ser inserido
	 * @throws OverflowException se a lista estiver cheia
	 * @throws IndexOutOfBoundsException se a posição for inválida
	 */
	void insert(int posicao, T dado);
	
	/**
	 * Retorna o elemento em uma posição específica da lista.
	 *
	 * @param posicao a posição do elemento desejado
	 * @return o elemento na posição especificada
	 * @throws UnderflowException se a lista estiver vazia
	 * @throws IndexOutOfBoundsException se a posição for inválida
	 */
	T select(int posicao);
	
	/**
	 * Retorna um array contendo todos os elementos da lista.
	 *
	 * @return array com todos os elementos da lista
	 * @throws UnderflowException se a lista estiver vazia
	 */
	T[] selectAll();

	/**
	 * Atualiza o elemento em uma posição específica da lista.
	 *
	 * @param posicao a posição do elemento a ser atualizado
	 * @param novoDado o novo elemento
	 * @throws UnderflowException se a lista estiver vazia
	 * @throws IndexOutOfBoundsException se a posição for inválida
	 */
	void update(int posicao, T novoDado);
	
	/**
	 * Remove o elemento em uma posição específica da lista.
	 *
	 * @param posicao a posição do elemento a ser removido
	 * @return o elemento removido
	 * @throws UnderflowException se a lista estiver vazia
	 * @throws IndexOutOfBoundsException se a posição for inválida
	 */
	T delete(int posicao);
	
	/**
	 * Verifica se a lista está cheia.
	 *
	 * @return true se a lista estiver cheia, false caso contrário
	 */
	boolean isFull();
	
	/**
	 * Verifica se a lista está vazia.
	 *
	 * @return true se a lista estiver vazia, false caso contrário
	 */
	boolean isEmpty();
	
	/**
	 * Retorna uma representação em string da lista.
	 * Os elementos são separados por vírgula e delimitados por colchetes.
	 *
	 * @return string representando a lista
	 */
	String print();
}