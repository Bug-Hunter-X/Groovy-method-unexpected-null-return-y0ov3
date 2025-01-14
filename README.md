# Groovy Unexpected Null Return Bug

This repository demonstrates a subtle bug related to null handling in Groovy methods. The `myMethod` function is intended to perform an operation on two parameters, but its handling of null inputs produces unexpected results.

## Bug Description

The `myMethod` function returns `null` if either `a` or `b` is `null`.  While this might seem like correct null-safe coding, it's not always the desired outcome.  The issue arises when the method's logic could still proceed usefully with only one of the inputs being null or perhaps default the null value to something appropriate.

## Solution

The improved method checks each parameter individually, allowing for more controlled behavior.  It is important to note that the exact behavior depends on the intended functionality of `myMethod` but providing specific handling for the cases of either `a` or `b` being null is ideal.
