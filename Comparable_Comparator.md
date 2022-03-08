# Comparable and Comparator Interface

For numbers, order is obvious, for strings objects, order is defined according to the
Unicode character mapping.Numbers sort before letters and uppercase letters sort before lowercase letters.

## Comparable

The Comparable interface has only one method

```
public interface Comparable<T>{
	public int compareTo(T o);
}
```

### Rules
- 	== 0 	Cuando el ATRIBUTO del objeto es igual
- 	<= 0 	Cuando el ATRIBUTO del objeto es mas pequeño
-	>= 0	Cuando el ATRIBUTO del objeto es mas grande
