# HOOKS
commonly used hooks
- useState: to use state in a functional component. For each state change component will re-render. 
- useEffect: to use lifecycle methods in a functional component
- useRef: to create a ref in functional component
Other hooks:
useContext, useReducer, useCallback, useMemo, useImperativeHandle, useLayoutEffect, useDebugValue
Also we can create custom hooks. 

- React.Fragment or <> : Fragments let us group a list of children without adding extra nodes to the DOM

# useEffect 
- []: Run at initial render only.
- [data]: Run at initial render & run after every rerender if data has changed since last render. Can take multiple values in the array & will render every time any of the array element will change. 
- empty: Run at initial render & run after every rerender.

- Cleanup funtion of useEffect
 In initial render useEffect will run the whole function and hold on to the cleanup function. Now when ever the useEffect will re-render it will invoke the previous cleanup function first then render the whole function and hold onto the next cleanup function again.

# dangerouslySetInnerHTML 
- To remove html tags we are getting from strings via an external api. In this case we must trust the sender api or else they can send malicious content resulting in XSS attack. This is a kind of hiding property in react.

> dangerouslySetInnerHTML={{ __html: result.snippet }}

# setTimeout 
Whenever we call setTimeout we get an id. We can use it in clearTimeout to stop it from executing.
clearTimeout(id_number);

# EventBubbling:
- Event bubbling/rising up in dom structure. Manual event in body with Vanilla in browser's console -> document.body.addEventListener('click', () => {console.log('clicked!')})

- During event bubbling events created with addEventListener will be called first. After that react event listeners will be called (most child to parents.)
