import React from "react";
import "./Sidebar.css";
import { AiOutlineTwitter } from "@react-icons/all-files/ai/AiOutlineTwitter";
import { AiOutlineHome } from "@react-icons/all-files/ai/AiOutlineHome";
import { FiHash } from "@react-icons/all-files/fi/FiHash";
import { IoMdNotificationsOutline } from "@react-icons/all-files/io/IoMdNotificationsOutline";
import { AiOutlineMail } from "@react-icons/all-files/ai/AiOutlineMail";
import { BsBookmark } from "@react-icons/all-files/bs/BsBookmark";
import { BsCardList } from "@react-icons/all-files/bs/BsCardList";
import { CgProfile } from "@react-icons/all-files/cg/CgProfile";
import { FiMoreHorizontal } from "@react-icons/all-files/fi/FiMoreHorizontal";
import { Button } from "@material-ui/core";

import SidebarOption from "./SidebarOption";

function Sidebar() {
    return (
        <div className="sidebar">
            {/* Twitter Icone */}
            <AiOutlineTwitter className="sidebar_twitterIcon" />

            <SidebarOption active Icon={AiOutlineHome} text="Home" />
            <SidebarOption Icon={FiHash} text="Explore" />
            <SidebarOption Icon={IoMdNotificationsOutline} text="Notification" />
            <SidebarOption Icon={AiOutlineMail} text="Messages" />
            <SidebarOption Icon={BsBookmark} text="Bookmarks" />
            <SidebarOption Icon={BsCardList} text="Lists" />
            <SidebarOption Icon={CgProfile} text="Profile" />
            <SidebarOption Icon={FiMoreHorizontal} text="More" />

            {/* Button -> Tweet */}      
            <Button variant="outlined" className="sidebar_tweet" fullWidth >Tweet</Button>
        </div>
    )
}

export default Sidebar;