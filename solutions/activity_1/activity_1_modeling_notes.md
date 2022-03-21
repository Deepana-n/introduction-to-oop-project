# Introduction to Modelling: Note-taking

### Why do we model?
In Object Oriented Programming we are trying to model either *real world entities* or *processes* and represent them in software. There are compelling reasons why we model:

-   A model is a simplification of reality. We model because we cannot comprehend the *complexity* of a system in its entirety.
-   We model to visualize, specify, construct, and document the *structure and behavior* of a system's architecture.
-   A model is a complete description of a system from a particular perspective.

### Principles of Modelling

The model that we create is dependent on the problem that we are trying to solve and the entities in the scope of the problem.

1.  Testing a physical entity before building it
2.  Communication with customers
3.  Visualization
4.  Reduction of complexity

### Basic Principles of Object Orientation

-   **Abstraction**: the most important or essential aspects of something while ignoring the less important details. Abstraction is dependent on perspective - what is important in one context may not be in another. We model our problem domain using abstractions.
-   **Encapsulation**: physical localization of features into a single blackbox abstraction that hides their implementation behind a public interface. "Information hiding" is a corollary concept that indicates data fields are hidden from the user but the functionalities as implemented through functions are exposed.
-   **Inheritance**: organization of abstractions according to some order (e.g. complexity, responsibility, etc.).
-   **Polymorphism**: substitute variables or objects of one type with variables or objects of another type. Polymorphism gives us the ability to switch components without loss of functionality.

### **Types of Models**
There are 3 types of models in the object oriented modeling and design are: Class Model, State Model, and Interaction Model. These are explained as following below.

- **Class Model**  
   The class model shows all the classes present in the system. The class model shows the attributes and the behavior associated with the objects.

   The class diagram is used to show the class model.The class diagram shows the class name followed by the attributes followed by the functions or the methods that are associated with the object of the class.Goal in constructing class model is to capture those concepts from the real world that are important to an application.


- **State Model**  
   State model describes those aspects of objects concerned with time and the sequencing of operations – events that mark changes, states that define the context for events, and the organization of events and states.Actions and events in a state diagram become operations on objects in the class model. State diagram describes the state model.


- **Interaction Model**  
   Interaction model is used to show the various interactions between objects, how the objects collaborate to achieve the behavior of the system as a whole.  
   The following diagrams are used to show the interaction model:
    -   Use Case Diagram
    -   Sequence Diagram
    -   Activity Diagram

### Key Study Notes

_Model_  - a representation of reality; a computer model is a representation of reality in computational form.

_Abstraction_  - In Software Engineering, we need to think about the detail we are trying to capture and how we're going to abstract it, i.e. capture the information we need to enable us to represent the behaviours of a given system in code.

_System_  - made up of things called components which work together to make a whole.

_Emergence_  - In systems thinking, for a complex system, each component within the system doesn't do much on its own, but when you put all those components together unexpected behaviour emerges that were not apparent from examining the individual components one-by-one.
