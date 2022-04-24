# Collections
## Arrays
### Arrays and Single Dimension Array


first index                                                     last index
-------------------------------------------------------------------------
|   0    |   1    |   2    |   3    |   4    |   5    |   6    |   7    |       indices
-------------------------------------------------------------------------

<-----------------------  Array length is 8   -------------------------->

```
Array Type          Corresponding Class Name
int[]                   [I
int[][]                 [[I
double[]                [D
double[][]              [[D
short[]                 [S
byte[]                  [B
boolean[]               [Z
```

## Collections
- Collections are growable in nature
- Increase or decrease size
- Homogeneous or Heterogeneous

Array                                   Collections
============================================================================================================
Fixed in size                           Collections are grow-able in Nature

Can hold only homogeneous type          Can hold homogeneous or heterogeneous

Memory point of view,we should          Recommended to use to Stop memory wastage as it grows on demand
not use 'Arrays'

There are no underlying structure       In built data structure and Algorithms

Can hold primitive type and object       
type both

## Collection Framework
                                Collection Framework
                                        |
                        Interfaces                Classes


            Collection Interface
                    |
                   List            
    ----------------|-----------------                
ArrayList       LinkedList         Vector          
                                      |
                                    Stack


            Collection Interface
                    |
                   Set
        (not duplicated data allowed) 
           ---------|------------
        HashSet             SortedSet
            |                   |
    LinkedHashSet          NavigableSet
                                |
                              TreeSet



        Collection Interface
                  |
                Queue
        ----------|-----------------------------            
        PriorityQueue                   BlockingQueue
                                  ------------|---------------      
                            PriorityBlockingQueue               LinkedBlockingQueue


                                    Collection Framework
                                              |
                                             Map
                                     (key value pair)
------------------------------------------------------------------------------------------------------------------------------
|                                    |                         |                             |                               |
HashMap                         WeakHashMap             IdentityHashMap                 Dictionary                      SortedMap
   |                                                                                         |                               |
LinkedHashMap                                                                           HashTable                       NavigableMap
                                                                                             |                               |
                                                                                        Properties                         TreeMap

## Collection Interface

boolean add(Object o)
boolean addAll(Collection c)
boolean remove(Object o)
boolean removeAll(Collection c)
boolean retainAll(Collection c)
void clear()
boolean contains(Object o)
boolean containsAll(Collection c)
boolean isEmpty(Collection c)
int size()
Iterator iterator()
Object[] toArray()


## Collection vs Collections

Root Interface o Collection Framework                   Utility Class for Collection Object

          Collection                                               Collections

            List                                                 java.util package

            Set                                                        sort()

            Queue                                                      revert()
                                                                        
                                                                      shuffle()

                                                                      binarySearch()

                                                                      disjoint()

## Generics

- To provide type safety
- To solve the problem related to type-casting in collection
- To enable developer to write less redundant code

## List Interface
                        Collection
                             |
                            List

- An ordered collection 
- List allows positional access to elments 

List a = new ArrayList();
List l = new LinkedList();
List v = new Vector();
List s = new Stack();

### ArrayList
- Underlying Data Structure.
- Resizable or Growable Array.
- Insertion Order is preserved.
- Accepts heterogeneous objects.
- Serializable( Significa que puede ser enviado por la red en tramas de bytes ).
- Clonable( Puedes crear clones de una clase ).
- Random Access Interface( any random element can be accessed in same speed ).

### LinkedList

-----------------       -----------------       -----------------       -----------------
| data | node   |  ->   | data | node   | ->    | data | node   | ->    | data | node   |
-----------------       -----------------       -----------------       -----------------
        NODE                   NODE                     NODE                    NODE

- Allows duplicate elements
- Insertion Order is preserved
- Accepts heterogeneous objects
- null insertion is posible

### Difference between LinkedList and ArrayList

ArrayList                                               LinkedList

Not recomended to use for                               Best choice if frequent 
insertion and deletion in                               operations are insertion and
middle.                                                 deletion in middle.

Best choice for retrieving                              Not recommended for retrieval
operations.                                             operations.

### Vector

- Resizable or growable array.
- Allows duplicate elements.
- Insertion Order is preserved.
- Accepts heterogeneous objects.

### Difference between ArrayList and Vector

ArrayList                                               Vector

Methods in ArrayList are                                All methods in Vector are 
not Synchronized.                                       Synchronized.
Not Thread Safe                                         Thread Safe.

Performance is relatively                               Performance is low.
high.

Non-Legacy class                                        Legacy class
( came in 1.2 version )                                   ( available since 1.0 version ) 

## Stack

                                                |               |
                                                -----------------
                                                |               |
                                                -----------------
                                                |               |
                                                -----------------
                                                |               |
                                                -----------------
                                                      Stack
- Allows duplicate elements
- Insertions Order is preserved
- Accepts heterogeneous objects
- Based on the LIFO( Last in First Out) 

## Cursors
An indicator used to show the current position for respective object or element.

Four types of Cursors:
- Enumeration
- Iterator
- ListIterator
- Spliterator



## Set Interface

```
														Collection
															|
							-------------------------------- Set -------------------------------
							|																|
						  HashSet														 Sorted Set
							|																|
			 			LinkedHashSet													NavigableSet		
																							|
																						  TreeSet
```

- duplicates are not allowed
- Insertion order is not preserved
- Accepts heterogeneous objects
                                          
### HashSet
Underlying Data Structure: HashTable

- Does not allow duplicates.
- Insertion order is not preserved.
- Can add heterogeneous elements.
- We can add null value.
- Implements Serializable and Cloneable Interface.

### LinkedHashSet
- Insertion Order is preserved

### SortedSet
Methods in SortedSet Interface TreeSet Collection Integer

- Object first()
- Object last()
- SortedSet headSet(Object o)
- SortedSet tailSet(Object o)
- SortedSet subSet(Object o, Object p)
- Comparator comparator()

### NavigableSet
- sub interface of SortedSet.
- contains methods related to Navigation functionality.
- both SortedSet and NavigableSet have a same implementation class as TreeSet.

### TreeSet
					Root
					  |
     -------------------------------------
	|				  			        |
Less than root 					Greater than root


## Comparable and Comparator
### Comparable Interface
- Present in java.lang package
- Contains only one method
	public int compareTo(Object obj)
- Meant for Default Natural Sorting Order

public int compareTo(Object obj)

                                obj1.compareTo(obj2)
        obj1 < obj2             obj1 == obj2              obj1 > obj2
             -1                      0                          +1


### Comparator Interface
- Present in java.util package
- contains two methods
	
        public int compare(Object obj1,Object obj2)  	-> you can give your own implementation to this method
	public boolean equals(Object obj) 	        -> implementation is not required,as Object is super or parent class.

- Meant for customized Sorting Order


By default JVM use compareTo method for default natural sorting order.


# QUEUE
```
                                Collection
                                     |
    ------------------------------ Queue ---------------------------
    |                                |                             |
LinkedList                     PriorityQueue                 BlockingQueue
                                                                   |
                                                        ---------------------
                                                        |                   |           
                                                PriorityBlokingQueue LinkedBlockingQueue
```


```
public interface Queue<E> extends Collection<E>
```

# MAP

* Es una interface que representa un mapeo entre una llave y valor.
* Keys and values son objetos, pueden ser cualquier tipo de datos
* Keys duplicadas nos on permitidas, valores si pueden ser duplicados.
 
# HASHCODE
```
			->		equals()
Object	
			->		hashCode()
```

# HASHMAP
* No se lleva un orden al momento de insertar
* KEYS duplicadas no son permitidas
* Permite nulls como llave solo una vez, los valores pueden ser nulos mas de una vez
* Llave - Valor
* Implementa la interfaz Serializable y Clonable
* Mejor opcion para busqueda de operaciones
* Usa hashing para guardar objetos

```
		Map		->		HashMap		->		LinkedHashMap
```

# THREAD SAFE
Significa que puedes usar una clase en varios Threads sin tener problemas

# DIFERENCIA ENTRE HASHTABLE Y HASHMAP
```
HASHMAP												HASHTABLE
No Thread safe										Thread-safe
Fast but data may be inconsistent				Slow because of locking
Allows one null key, multiple null values		Null key and values are not 
													allowed
1.2 version										Legacy class
Extends AbstractMap								extends Dictionary

```

# LINKED HASHMAP

```
Map(I)	-->	HashMap(C)	-->	LinkedHashMap(C)

					
LinkedHashMap		-->		HashTable + LinkedList


HASHMAP									LINKEDHASHMAP

Insertion order is not preserved	Insertion order is preserved with the 										help of linkedList

1.2 version							1.4 version
										
										Used for developing cache based 										application

		
```

# IDENTITY HASHMAP
HashMap usa el metodo equals para identificar si un objeto es igual y poderlo agregar a la colección, con IdentityHashMap la comparación es via referencia.


HASHMAP							IDENTITYHASHMAP
equals Method					== operator
Key1.equals(Key2)				Key1 == Key2

# WEAKHASHMAP

Map(I)		<-	WeakHashMap(C)


Los objetos que no tienen referencia son eligibles para el Garbage Collector para ser eliminados, si tu lo agregas a un HashMap  este objeto a pesar de no tener una referencia ya
no es elegible por el GC,con WeakHashMap si es elegible.


# SORTEDMAP

Map(I)	<-	SortedMap(I)

SortedMap(I) <- ConcurrentNavigableMap<K,V> , NavigableMap<K,V>

SortedMap(I) <- ConcurrentSkipListMap, TreeMap(C)


Ordena en modo ascendente las llaves.

* Llaves nulas o valores nulos no son permitidos.
* Las llaves son ordenadas por orden natural o por un Comparator especial.


# TREEMAP

Map(I) <- SortedMap <- NavigableMap(I) <- TreeMap(C)

* Insertion order is not preserved
* Ducplicate keys are not allowes
* Default Sorting order
* Customized Order


# CONCURRENT COLLECTIONS

Map(I) <- ConcurrentMap(I) <- ConcurrentHashMap

HashMap:	Not thread Safe - So in Multitheading environment this data structure
			can lead to data inconsistency issues.

HashTable:		Thread-Safe but poor in performance as the full object get locked
				in read/write. Only one thread is allowed to operate.

ConcurrentHashMap:	Thread Safe and better in performance as no lock wile read and 					segment is locked while write not full object.


## lambda

### type 1
public void myName(){
	sysout("John");
}

lambda has no name

public void (){
	sysout("John");
}

lambda has no access modified
void(){
	sysout("John");
}

lambda has no return type

(){
	sysout("John");
}

() -> {
	sysout("John");
}

() -> sysout("John");


### type 2

public void add(int a, int b){
	sysout(a+b);
}

(int a, int b){ sysout(a+b); }

(int a, int b) ->  sysout(a+b);

(a,b) ->  sysout(a+b);

### type 3

public int length(String s){
	return s.lenght();
}
 
(String s) -> { return s.lenght(); }
(s) -> s.lenght();


## functional interfaces
* Contiene solo y unicamnete un metodo abstracto.

## Predicates

interface Predicate<T>{
	boolean test(T t);
}

## Function
Recibes un parametro T lo procesas y envias un resultado R
interface Function<T,R>{
	R apply(T t);
}

## Consumer
Consume algo pero no retorna nada

interface Consumer<T>{
	void accept(T t);
}

## Supplier
No consume nada solo responde con algo
interface Supplier<R>{
	R get();
}

## Operator :: Method reference