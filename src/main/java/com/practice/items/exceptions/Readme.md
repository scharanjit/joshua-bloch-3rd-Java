`In Java exceptions under Error and RuntimeException classes are unchecked exceptions, everything else under throwable is checked. `


### Use checked exceptions for recoverable conditions and 
By throwing a checked exception, you force the caller to handle
 the exception in a catch clause or to propagate it outward. 


### runtime exceptions for programming errors

The great major-ity of runtime exceptions indicate 
precondition violations. A precondition violation is simply
 a failure by the client of an API to adhere to the contract 
 established by the API specification. 

#### all of the unchecked throwables you implement should subclass RuntimeException


```To summarize, throw checked exceptions for
 recoverable conditions and unchecked exceptions for programming errors.

 When in doubt, throw unchecked exceptions.


 Don’t define any throwables that are neither checked exceptions 
nor runtime exceptions. 

Provide methods on your checked exceptions to aid in recovery.```