import React from "react";
import "./navbar.css"
import '../../styles/fonts.css'
import {
    Badge,
} from "@mui/material";
import ShoppingCartOutlinedIcon from '@mui/icons-material/ShoppingCartOutlined';
import Avatar from '@mui/material/Avatar';
import SearchIcon from '@mui/icons-material/Search';
export const Navbar = () => {
    return (
        <div className="c-navbar">
            <a href="">FOODORDERING</a>
            <div className="c-navbar__option-wrapper">
                <SearchIcon className="c-navbar__icon" sx={{ fontSize: "34px" }} />
                <Badge color="black" badgeContent={3}>
                    <ShoppingCartOutlinedIcon className="c-navbar__icon" sx={{ fontSize: "34px" }} />
                </Badge>
                <Avatar className="c-navbar__icon" src="/broken-image.jpg" />
            </div>

        </div>
    )
}
export default Navbar;