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
- []: Run at initial render.
- [data]: Run at initial render & run after every rerender if data has changed since last render. Can take multiple values in array.
- empty: Run at initial render & run after every rerender.

# dangerouslySetInnerHTML 
To remove html from strings incase of XSS attack