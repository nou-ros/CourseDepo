<template>
    <div>
        <li class="list-group-item media" v-on:click="onVideoSelect">
            <img class="m-1" v-bind:src="thumbnailUrl"/>
            <div class="media-body">
                {{item.snippet.title}}
            </div>
        </li>
    </div>
</template>

<script>
export default {
    name: 'VideoListItem',

    props: ['item'],

    computed: {
        thumbnailUrl(){
            return this.item.snippet.thumbnails.default.url;
        }
    },

    methods: {
        // sending props to parent VideoList
        onVideoSelect(){
            return this.$emit('videoSelect', this.item);
        }
    }
}
</script>


<style scoped>
li{
    display: flex;
    cursor: pointer;
}

li:hover{
    background-color: #eee;
}
</style>