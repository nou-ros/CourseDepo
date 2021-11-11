- Class based component extends React.Component and use render() method


State

- state can only be used with class based component and hooks
- state is a JS object that contains data relevant to a component
- updating 'state' on a component causes the component to instantly rerender
- state must be initialized when a component is created
- state can only be updated using the function 'setState'
- we should not initialize any work to render method as it will be called all the time.

constructor - good place to one time setup.
render - avoid doing anything besides return JSX.

Life Cycle Methods
componentDidMount: Loads when the component is rendered for the first time. Good place to do data loading.
componentDidUpdate: Loads whenever the setState is called. Good place to do data loading when state/props changes.
componentWillMount: Loads whenever the component is not shown any more. Good place to do cleanups(Specially for non react-stuffs).