## Before Collection we used Array, Vector and Hashtable 

As we can observe, none of these collections(Array, Vector, or Hashtable) implements a standard member access interface, it was very difficult for programmers to write algorithms that can work for all kinds of Collections. Another drawback is that most of the ‘Vector’ methods are final, meaning we cannot extend the ’Vector’ class to implement a similar kind of Collection. Therefore, Java developers decided to come up with a common interface to deal with the above-mentioned problems and introduced the Collection Framework in JDK 1.2 post which both, legacy Vectors and Hashtables were modified to conform to the Collection Framework.


## Advantages of the Java Collection Framework

- Consistent API: Set, List or Map and all the classes that implements these method have some common set of claess
- Reduces programming effort
- Increases programming speed and Quality


![Collection Architecture](https://media.geeksforgeeks.org/wp-content/uploads/20240726145939/Collections-in-Java.png)

## Methods of the Collection Interface 

- add(Object) : add object to collection
- addAll(Collection C) : Adds all the elements in the given collection to this collection
- clear() : removes all the elements from the collection
- contains(Object o) : This method returns true if the collections contains element 
- containsAll(Collection c)
- equals(Object o)
- hashCode() : used to return hashValue of this collection
- isEmpty() : this method return true if the collection is emppty
- iterator() : returns an iterator over the elements  in this collection
- max() : returns max value present in the collection
- remove(Object o)
- removeAll(Collection c) 
- size()
- toArray()


Interfaces that Extend the Java Collections interface 

- Iterable Interface
  This is the root interface for the entire collection framework. The collection interface extends the iterable interface.
  inherently, all the interfaces and classes implement this interface. The main functionality of this interface is to provide an iterator for the collections. Therefore, this interface contains only one abstract method which is the iterator. It returns the

- List Interface 
  
# classes under List Interface 
- ArrayList
- Vector 
- Stack
- LinkedList
all these classes can be instantiated by the List Interface 


## Queue Interface 
- Priority Queue
  - First-in-First out 
  - sometimes process according to priority based on comparator provided on the constructor
  - add, remove, peek, isEmpty, and size.
- Dequeue
  - Double sized array 
  - add and remove elements from the both side 

## Set Interface 
A set is an unordered collection of objects in which duplicate values cannot be stored. 

- HashSet 
  - The HashSet class is an inherent implementation of the hash table data structure.
- LinkedHashSet
  - A LinkedHashSet is very similar to a HashSet. The difference is that this uses a doubly linked list to store the data and retains the ordering of the elements. 
- TreeSet implments SortedSet<T> interface 
  - The TreeSet class uses a Tree for storage. The ordering of the elements is maintained by a set using their natural ordering whether or not an explicit comparator is provided. 


## Map

A map is a data structure that supports the key-value pair for mapping the data. This interface doesn’t support duplicate keys because the same key cannot have multiple mappings, however, it allows duplicate values in different keys.

- HashMap
  - HashMap provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs. To access a value in a HashMap, we must know its key. HashMap uses a technique called Hashing. Hashing is a technique of converting a large String to a small String that represents the same String so that the indexing and search operations are faster. HashSet also uses HashMap internally. 
- TreeMap
  - an implementation of the Map interface, where its items are stored as key-value pairs and it is sorted either by natural ordering of its keys or through a Comparator

