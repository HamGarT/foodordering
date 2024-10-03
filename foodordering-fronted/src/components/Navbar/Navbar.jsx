import React from "react";
import "./navbar.css"
import {
    Badge,
} from "@mui/material";
import ShoppingCartIcon from '@mui/icons-material/ShoppingCart';
export const Navbar = ()=>{
    return (
        <div className="c-navbar">
            <Badge color="black" badgeContent={3}>
                <ShoppingCartIcon className="c-navbar__icon-cart" sx={{ fontSize: "2rem" }} />
            </Badge>
        </div>
    )
}
export default Navbar;