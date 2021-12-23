<template>
    <div class="col-md-4">
        <ul class="list-group">
           <VideoListItem 
                v-for="video in listVideos" 
                v-bind:key="video.etag"
                v-bind:item="video"
                v-on:videoSelect="onSelectVideo" 
                />
        </ul>
    </div>
</template>


<script>
import VideoListItem from './VideoListItem.vue';


export default {
    name: "VideoList",

    components: {
        VideoListItem
    },

    props: ['listVideos'],

    methods: {
        onSelectVideo(video){
            // child sending the grandchild props to grandParent
            return this.$emit("selectVideo", video);
        }
    }
}
</script>


<style>

</style>