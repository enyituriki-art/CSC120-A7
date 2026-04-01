Use this file to record your reflection on this assignment.

- What are your initial impressions of how `Inheritance` affects your programming?
- What worked, what didn't, what advice would you give someone taking this course in the future?


Working with inheritance in this assignment made me realize how much easier it is to build new classes when they can rely on shared structure from a parent class. At first, it felt abstract but once I started writing House, Library, and Cafe, I saw how inheritance reduces repetition and shows what all these objects have in common because instead of rewriting the name, address and floor logic three separate times, I could just extend Building and focus on the unique behavior of each subclass. It also made my code feel more organized because the shared features live in one place and each subclass only handles what makes it different. 

One thing that worked well for me was breaking each class down into small pieces instead of trying to write everything at once. For example, in the Cafe class, I started by getting the constructor right, then added the inventory fields, then wrote sellCoffee and after that handled the restocking logic. Doing it step by step helped me avoid getting overwhelmed. What didn’t work at first was keeping track of constructor parameters and making sure I was actually initializing fields correctly. I also ran into issues when I forgot that Java requires exact return types especially in methods that return objects and need a return null path. Debugging those mistakes taught me to read error messages more carefully and to test each method as I wrote it.

My advice for someone taking this course in the future would be to test their code constantly and not waiting until the end to run the code and to use print statements to check the logic especially when working with inheritance or multiple classes and taking time with constructors because most of my bugs came from forgetting to pass parameters or initalizing fields correctly. 
