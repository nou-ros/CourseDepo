<template>
    <div class="container">
       <SearchBar v-on:termChange="onTermChange"/>
       <div class="row">
            <VideoDetail v-bind:video="selectedVideo" />
            <!-- Parent to child props passing also getting props from grand child-->
            <VideoList v-bind:listVideos="videos" v-on:selectVideo="onSelectVideo" />
        </div>
    </div>
</template>


<script>
import axios from 'axios';
import SearchBar from './components/SearchBar.vue';
import VideoList from './components/VideoList.vue'
import VideoDetail from './components/VideoDetail.vue'


const API_KEY = 'AIzaSyDILst0mFxD-ja38_SFmh4jrKXCO26cvHo';

export default{
    name: 'App',

    components: {
        SearchBar, 
        VideoList,
        VideoDetail,
    },

    data(){
        return {
            videos: [],
            selectedVideo: null
        };
    },

    methods: {
    async onTermChange(searchTerm){
            // console.log(searchTerm);
        try{
            let response = await axios.get('https://www.googleapis.com/youtube/v3/search', {
                    params: {
                        key: API_KEY,
                        type: 'video',
                        part: 'snippet',
                        q: searchTerm
                       }
            });
            // console.log(response);
            this.videos = response.data.items;
        }catch(err)
        {
            console.log(err);
        }
     },

     onSelectVideo(video){
        //  console.log(video);
        this.selectedVideo = video;
     }

    }
        
};
</script>


