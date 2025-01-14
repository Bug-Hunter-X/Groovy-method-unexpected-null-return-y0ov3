```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null //This might seem correct but it's the source of the bug
  }
  // ...rest of the method
}

println myMethod(1, null)
println myMethod(null, 2)
println myMethod(null, null)
```