# Sections
- [Let's Dive](#lets-dive)
- [Building Content with JSX](#building-content-with-jsx)
- [Communicating with Probs](#communicating-with-probs)
- [Structuring Apps with Class-Based Components](#structuring-apps-with-class-based-components)
- [State in React Component](#state-in-react-component)
#Let's Dive
**React** is a single JavaScript library
Its ultimate purpose is to show content(HTML) to users and handle user interaction

React 'Components' are made using either JavaScript function or classes
- Functional Components : Good for simple content
- Class Component : Good for just about everything else

###Why using both 'React' and 'ReactDom'
- 'React' knows what a component is and how to make components work together.
- 'ReactDOM' knows how to take a component and make it show up in the DOM. 

###What is a 'npm'?
- npm stands for 'Node Package Manager' which allows you to download and use many useful packages

###Babel
- Babel is a command line tool that takes any versions of JavaScript and spit out newer version 
- Ex: ES2015(Not supportive for all browser) -> Babel(Chages to ES5) -> ES5(Supportive for all) -> Works on All Browsers

###Project Directories
- src: Folder where we put all the source code we write
- public: Folder that stores static files, like images
- node-modules: Folder that contains all of our project dependencies
- pacakge.json: Records our project Dependencies and configures our project
- package-lock.json: Records the exact version of packages that we install
- README.MD: Instructions on how to use this project

###import vs require
- import : ES2015 Modules
- require : CommonJS Modules

###What is a React Component
- It is a **Function** or **Class** 
- It produces HTML to show the user (Using JSX)
- It handles feedback from the user (Using Event Handlers)

---

#Building Content with JSX

###InLine Style in JSX
- html : 
```HTML
 <button style="bakground-color: blue; color: white'">Submit</button> 
 ```
- JSX :  
```JSX
 <button style={{backgroundColor: 'blue', color: 'white'}}> 
 ```

###Class vs ClassName
- class : Javascript keyword
    - Ex: ``` class App extends React.Component ```
- className : JSX keyword
    - Ex: ``` <label className="label" for="name"> ```

###Referencing JavaScript variables as JSX
- 
``` Javascript
 const App2 = () => {
        const buttonText = 'Click Me!';

        return (
            <div>
                <label className="label" for="name">
                    Enter name:
                </label>
                <input id="name" type="text" />
                <button style={{ backgroundColor: 'blue', color: 'white'}}>
                    {buttonText}
                </button>
            </div>
        );
    }
```

---

#Communicating with Probs

### Three Tenets
- Component Nesting
    - A component can be shown inside of another
- Component Resuability
    - We want to make components that can be easily reused through out application
- Component Configuration
    - We should be able to configure a component when it is created 

### The Probs
- System for passing data from a parent component to a child component
- Goal is to customize or configure a child component

---

#Structuring Apps with Class-based Components
React 'Components' are made using either JavaScript function or classes
- Functional Components : Good for simple content
- Class Component : Good for just about everything else
    -When you create a class, there is one method to it 'render()'
    -React expects that our class base component has many other methods attached to it
    -We are extending class component 'React.Component' to use the built in functions  

---

#State in React Component 
Rules of State
- Only usable with Class Component
- 'State' is a JS object that contains data relevant to a component 
- Updating State on a component almost causes a component to (almost) instantly rerender
- ***If we want to get a single component to update itself, we update its state***
- State must be initialized when a component is created 
- State can be only update by using 'setState'
 
 ---

 #Understanding Lifecycle methods
 - Component Lifecycle
    - Constructor
    - Render
        - Content visible on screen 
    - ComponentDidMount
        - Sit and wait for updates
    - ComponentDidUpdate 
        - Sit and wait until this component is no longer shown
    - ComponentWillUnmount
        



