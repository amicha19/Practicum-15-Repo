# Instructions  

## PRACTICUM 15 - Membership Fee Program.<br>

### BACKGROUND
`If statements` are all that are needed for condtional execution
of statements in programming. `Switch statements` provide a 
convenient alternative to the use of nested if statements, but
are only applicable in certain situations. If needed to, we
could do all conditional control in a program by use of just if
statements.
<br><br>
If statements may contain any arbitrary conditional (Boolean)
expression, e.g.,
<br><br>
`if(age > 65 and num_years_employed > 30) ...`
<br>
Often times, however, the conditions of a series of if 
statements are based on the value of a single variable. This
is when a switch statement can be used,
<br><br>
```java
System.out.println("ATM MACHINE");
System.out.println('1 - deposit', 2 - withdrawl, 3 - balance);
option = input.nextInt();
switch(option) {
   case 1: // statements for deposit
           break;
   case 2: // statements for withdrawl
           break;
   case 3: // statements displaying balance
}
```
<br>
As a series of nested if statements, this would look like:

```java
if(option == 1)
  { // statement for deposit }
  else if(option == 2)
    { // statement for withdrawl }
    else if(option == 3)
      { // statements for displaying balance }
    etc.
```
<br>
Note that both nested if-else statements and switch statements
both have an optional "catch-all" condition.
<br>

```java
switch(option) {
   case 1: // statements for deposit
           break;
   case 2: // statements for withdrawl
           break;
   case 3: // statements displaying balance
           break;
  default: // invalid selection
}
```
<br><br>
The default case in the switch statement above corresponds to
having a final else part of an if with no condition,
<br><br>
```java
if(option == 1)
  { // statement for deposit }
  else if(option == 2)
    { // statement for withdrawl }
    else if(option == 3)
      { // statements for displaying balance }
    else
      // invalid selection
```
<br>
### WHAT TO DO

- `Finish the program` and correct any syntax or runtime errors.
- Correct any syntax, runtime or logic errors.
