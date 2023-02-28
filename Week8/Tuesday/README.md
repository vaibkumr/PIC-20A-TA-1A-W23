# Event Handling – Putting life into GUI
Change in the state of an object is known as event.
Example:
- Clicking a button
- Pressing a keyboard key
- Scrolling
…more

- GUI components fire events.  
- By default these events are ignored
- but you can choose to listen to them.
- …by attaching an EventListener to an event
- The EventListener runs when the event is fired.


# Implementing ActionListener
1. Implement (you extend classes, implement interfaces) ActionListener Interface
    `public class ActionListenerExample implements ActionListener`

2. Register a component 
    `component.addActionListener(instanceOfAnActionListenerClass);`

3. Override actionPerformed
    `public void actionPerformed(ActionEvent e){}`

example `Events.java`