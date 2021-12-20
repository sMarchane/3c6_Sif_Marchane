package atelier5_1;


import tutoriels.liste.ListeJava;

public class ListeJavaNaive<E extends Object> extends ListeJava<E> {

	//
	private E[] elements = nouveauTableau(0);
	
	
	public ListeJavaNaive(Class<E> typeElement) {
		super(typeElement);
	}
	
	private void copier(E[] src, int debutSrc, int finSrc, E[] dst, int debutDst) {
		int decalage = debutDst - debutSrc;
		
		for (int i = debutSrc; i <= finSrc; i++) {
			dst[i+decalage] = src[i];
		}
		
	}

	@Override
	public void add(E e) {
		insert(size(), e);
		
	}

	@Override
	public void addAll(E[] elements) {
		for (E e : elements) {
			add(e);
		}
		
	}

	@Override
	public void clear() {
		elements = nouveauTableau(0);
		
	}

	@Override
	public boolean contains(Object o) {
		return indexOf(o) != -1;
	}

	@Override
	public E get(int position) {
		return elements[position];
	}

	@Override
	public int indexOf(Object o) {
		int indice = -1;
		
		for (int i = 0; i < elements.length; i++) {
			if (elements[i].equals(o)) {
				indice = i;
				break;
			}
		}
		
		
		return indice;
	}

	@Override
	public void insert(int position, E e) {
		E[] nouveauxElements = nouveauTableau(elements.length + 1);
		
		copier(elements, 0, position-1, nouveauxElements, 0);
		
		nouveauxElements[position] = e;
		
		copier(elements, position, elements.length-1, nouveauxElements, position+1);
		
		elements = nouveauxElements;
		
	}

	@Override
	public boolean isEmpty() {
		return elements.length == 0;
	}

	@Override
	public void remove(int position) {
		E[] nouveauxElements = nouveauTableau(elements.length - 1);
		
		copier(elements, 0, position-1, nouveauxElements, 0);
		copier(elements, position+1, elements.length-1, nouveauxElements, position);
		
		elements = nouveauxElements;
	}

	@Override
	public void removeValue(Object o) {
		int indice = indexOf(o);
		if (indice >= 0) {
			remove(indice);
		}
		
	}

	@Override
	public void set(int position, E e) {
		elements[position] = e;
		
	}

	@Override
	public int size() {
		return elements.length;
	}

}
