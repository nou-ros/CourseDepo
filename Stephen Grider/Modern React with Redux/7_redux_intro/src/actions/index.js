//Action creator

// named export
export const selectSong = (song) => {
    return {
        // return an action
        type: 'SELECTED_SONG',
        payload: song
    };
};


