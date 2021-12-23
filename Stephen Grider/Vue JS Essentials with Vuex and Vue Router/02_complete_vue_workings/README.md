- create vue app with vue-cli: vue create app_name
- start vue app: npm run serve
- exactly one root element in template.
- in real application createElement is replaced with h function.

- both in the below functions are same: 
new Vue({
    render: function(h) {
        return h(App);
    }
});
----------
new Vue({
    render: h=> h(App)
});

- both are same (vue directives): 
    + v-on:input 
    + @input

    + v-bind:items
    + :items


- Communicate from parent to child by passing props. [v-bind:item]
- Communicate from child to parent by emitting events.

- install axios : npm install --save axios 

- data will be a function that returns an object. When ever data changes the whole component will re-render.

- v-for, key must be unique