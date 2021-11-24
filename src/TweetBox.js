import { Avatar, Button } from '@material-ui/core';
import React from 'react';
import "./TweetBox.css";


function TweetBox() {
    return (
        <div className="tweetBox">
            <form>
                <div className="tweetBox_input">
                    <Avatar src="https://pbs.twimg.com/profile_images/1432708068652064780/Aw-rDNbg_400x400.jpg" />
                    <input placeholder="What's happening?" type="text" />
                </div>
                <input className="tweeetBox_imageInput" placeholder="Optional: Enter Image URL" type="text" />
                <Button className="tweetBox_tweetButton">Tweet</Button>
            </form>
        </div>
    )
}
 
export default TweetBox
