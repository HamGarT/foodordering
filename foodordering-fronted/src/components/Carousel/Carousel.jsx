import React from "react";
import Slider from "react-slick";
import CarouselItem from "./CarouselItem";

const Carousel = (data)=>{
    //console.log(data.data);
    const responsive = [
        {
          breakpoint: 1024,
          settings: {
            slidesToShow: 5,
    
          }
        },
        {
          breakpoint: 900,
          settings: {
            slidesToShow: 3,
          }
        },
        {
          breakpoint: 600,
          settings: {
            slidesToShow: 2,
          }
        },
        {
          breakpoint: 480,
          settings: {
            slidesToShow: 1,
    
          }
        }
      ]
    
      const settings = {
        dots: false,
        infinite: true,
        speed: 500,
        slidesToShow: 5,
        slidesToScroll: 1,
        autoplay: true,
        autoplaySpeed: 2000,
        pauseOnHover: true,
        arrows: false,
        responsive
    
      };
    return(
        <Slider {...settings}>
            {data.data.content?.map((food)=>console.log(food) )}
        </Slider>
    );
}

export default Carousel;