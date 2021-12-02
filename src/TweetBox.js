import { Avatar, Button } from '@material-ui/core';
import React, { useState } from 'react';
import "./TweetBox.css";
import db from './Firebase';

function TweetBox() { 
    const [tweetMessage, setTweetMessage] = useState("");
    const [tweetImage, setTweetImage] = useState("");

    const sendTweet =  e => {
        e.preventDefault();

        db.collection('posts').add({
            displayName: 'Jeel Gajera',
            username: 'JeelGajera7',
            verified: true,
            text: tweetMessage,
            avatar: "https://pbs.twimg.com/profile_images/1432708068652064780/Aw-rDNbg_400x400.jpg",
            image: tweetImage
        })
        setTweetMessage("");
        setTweetImage("");
    };
    
    return (
        <div className="tweetBox">
            <form>
                <div className="tweetBox_input">
                    <Avatar src="https://pbs.twimg.com/profile_images/1432708068652064780/Aw-rDNbg_400x400.jpg" />
                    <input 
                        onChange={e => setTweetMessage(e.target.value)}
                        value={tweetMessage} 
                        placeholder="What's happening?" 
                        type="text" 
                    />
                </div>
                <input 
                        onChange={e => setTweetImage(e.target.value)}
                        value={tweetImage}
                        className="tweeetBox_imageInput" 
                        placeholder="Optional: Enter Image URL" type="text" />
                <Button type="submit" onClick={sendTweet} className="tweetBox_tweetButton">Tweet</Button>
            </form>
        </div>
    )
}
 
export default TweetBox;
