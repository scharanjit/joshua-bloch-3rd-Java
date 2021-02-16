Always use try-with-resources in
 preference to try- finally when working with resources
  
  
  that must be closed. The resulting code is shorter and clearer,
   and the exceptions that it generates are more useful.
    
    
    The try- with-resources statement makes it easy to write correct code 
    
    using resources that must be closed, which was practically impossible using try-finally.