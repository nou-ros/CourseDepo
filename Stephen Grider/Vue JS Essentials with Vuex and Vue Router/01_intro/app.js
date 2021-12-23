new Vue({
    el: '#app',
    
    
    data: {
    //Initialize our list of data variables
    textInput: '',
    },
    
    
    computed: {
    //perform calculations on data variables
    identicon: function(){
        return jdenticon.toSvg(this.textInput, 200);
    },
    
    reverseInput: function(){
        return this.textInput.split('').reverse().join('')
    }
    },
    
    
    methods: {
    // methods change data
    onInput: function(event) {
        this.textInput = event.target.value;
    },
    
    },
    
    
template: ` 
    <div>
        <h3>My Identicon Generator</h3>

        <div>
        Input: 
        <input v-on:input="onInput" />
        </div>

        <div>
        Output: 
        {{ reverseInput }}
        
        <div v-html="identicon"></div>
        
        fullOutput: {{ textInput + '007' }}
        </div>
        
    </div>
    `
});
