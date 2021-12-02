import React from 'react';
import './Widgets.css';
import SearchIcon from '@material-ui/icons/Search'
import { TwitterTimelineEmbed, TwitterShareButton, TwitterTweetEmbed } from "react-twitter-embed";

function Widgets() {
    return (
        <div className="widgets">
            <div className="widgets_input">
                <SearchIcon className="widgets_searchIcon" />
                <input placeholder="Search Twitter" type="text" />
            </div>
            <div className="widgets_widgetsContainer">
                <h2>what's Happening </h2>

                <TwitterTweetEmbed tweetId={"1463406802674933767"} />

                <TwitterTimelineEmbed 
                    sourceType="profile"
                    screenName="ElonMusk"
                    options={{height: 400}}
                />

                <TwitterShareButton
                    url={"https://www.linkedin.com/in/jeel-gajera-063970215"}
                    options={{text: "#It's not what you C", via: "JeelGajera"}}
                />
            </div>  
        </div>
    )
}

export default Widgets;