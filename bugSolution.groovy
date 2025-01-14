```groovy
def myMethod(a, b) {
  a = a ?: 0 //Sets a to 0 if a is null
  b = b ?: 0 //Sets b to 0 if b is null
  return a + b // or any other appropriate operation
}

println myMethod(1, null) //Prints 1
println myMethod(null, 2) //Prints 2
println myMethod(null, null) //Prints 0
```