# SEA8 - StreamQuest 02 - Map

## Challenge: Recording of agents

Your previous mission (and especially the donuts offered at the last meeting) have made you popular at the _S.H.I.E.L.D._... But not enough to save you from the hard work that goes to a rookie like you!

The reception desk is equipped with a voice recognition system, which allows each agent to identify himself. The system recognizes the first and last names of the agents and stores them in a character string.

However, the agent database stores agents in instances of type **Agent** attributes, which have **firstName** and **lastName**.

Your mission is to transform the provided strings into instances of **Agent**.

To get started, make a Fork of the following deposit then clone it locally.

> Be sure to do a _Fork_ or you won't be able to grow anything!

1. Opens the classes **Shield** and **Agent** in order to study their respective contents
2. In **Shield.java** uses a **Stream** and the **map** to transform a list of **String** listed **Agent**
3. Uses a **Function** in which you can call the method **split** on the string to extract the first and last name: use these to create an instance of **Agent** and return it
4. Then use a lambda
5. You don't have to change the class **Agent**!
6. Compile and execute the code to check that both lists are displayed in the terminal.

Expected result in the execution of **Shield**:
```
Agents:
Coulson Phil
May Melinda
Johnson Daisy
Fitz Leopold
Simmons Jemma
```

## Validation criterias

- The deposit _GitHub_ contains the files **Agent.java** and **Shield.java**. Only **Shield.java** must have been modified.
- The class **Shield** does contain a **Stream** which transforms a list of **Agent** using the **map** and a **Function**
- The class **Shield** compiles without error and displays in the terminal the same result as the one presented above.
