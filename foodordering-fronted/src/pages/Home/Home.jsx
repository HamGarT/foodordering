import React from "react";
import Slider from "react-slick";
import "./home.css";
import '../../styles/fonts.css'
import arrowIcon from '../../assets/icons/arrow.png'
import heroImage from '../../assets/images/heroImage.png'
import FeatureCard from '../../components/FeatureCard/FeatureCard';
import DeliveryDiningOutlinedIcon from '@mui/icons-material/DeliveryDiningOutlined';
import useFetch from "../../hooks/useFetch";
import Carousel from "../../components/Carousel/Carousel";


const Home = () => {
  const { data, loading } = useFetch("http://localhost:5454/api/food?limit=4")
  //console.log(data);



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
  return (
    <>
      <section className="c-hero">
        <div className="c-hero__slogan-wrapper">
          <h1>FIND YOUR FAVOURITE FOOD RESTAURANT!</h1>
          <div className="c-hero__data-home">
            <div className="c-hero__text">
              <span>people eat here</span>
              <span>Looking for something delicios? get your favorite meal delivered fast</span>
            </div>
            <div className="c-hero__stadistics">
              <div className="c-hero__stadistic-item">
                <div>
                  <h3>120</h3>
                  <span>+</span>
                </div>
                <p>food
                  lunches
                </p>
              </div>
              <div className="c-hero__stadistic-item">
                <div>
                  <h3>20K</h3>
                  <span>+</span>
                </div>
                <p>Active
                  Customer
                </p>
              </div>
              <div className="c-hero__stadistic-item">
                <div>
                  <h3>80K</h3>
                  <span>+</span>
                </div>
                <p>Total
                  orders
                </p>
              </div>
            </div>
          </div>

        </div>
        <div className="c-hero__image-wrapper">
          <img src={heroImage} alt="" srcset="" />
          <div className="c-hero__glass-panel">
            <p>Let's get to your door  </p>
            <div></div>
            
          </div>
        </div>

      </section>
      <section className="c-about-us">

        <div className="c-about-us__features-wrapper">
          <FeatureCard
            className="feature-card feature-card--bottom"
            title="Delivery a tu casa"
            icon={DeliveryDiningOutlinedIcon}
            text="Hay muchas variaciones de los pasajes de Lorem Ipsum disponibles, pero la mayoría sufrió alteraciones en alguna manera" />
          <FeatureCard
            className="feature-card feature-card--wcolor feature-card--top"
            title="Delivery a tu casa"
            icon={DeliveryDiningOutlinedIcon}
            text="Hay muchas variaciones de los pasajes de Lorem Ipsum disponibles, pero la mayoría sufrió alteraciones en alguna manera" />
          <FeatureCard
            className="feature-card feature-card--bottom"
            title="Delivery a tu casa"
            icon={DeliveryDiningOutlinedIcon}
            text="Hay muchas variaciones de los pasajes de Lorem Ipsum disponibles, pero la mayoría sufrió alteraciones en alguna manera" />
          <FeatureCard
            className="feature-card feature-card--top"
            title="Delivery a tu casa"
            icon={DeliveryDiningOutlinedIcon}
            text="Hay muchas variaciones de los pasajes de Lorem Ipsum disponibles, pero la mayoría sufrió alteraciones en alguna manera" />
        </div>
        <div className="c-about-us__text">
          <h2>ABOUT US</h2>
          <p>Hay muchas variaciones de los pasajes de Lorem Ipsum disponibles, pero la mayoría sufrió alteraciones en alguna manera, ya sea porque se le agregó humor, o palabras aleatorias que no parecen ni un poco creíbles. Si vas a utilizar un pasaje de Lorem Ipsum, necesitás estar seguro de que no hay nada avergonzante escondido en el medio del texto. Todos los generadores de Lorem Ipsum que se encuentran en Internet tienden a repetir trozos predefinidos cuando sea necesario, haciendo a este el único generador verdadero (válido) en la Internet. Usa un diccionario de mas de 200 palabras provenientes del latín, combinadas con estructuras muy útiles de sentencias, para generar texto de Lorem Ipsum que parezca razonable. Este Lorem Ipsum generado siempre estará libre de repeticiones, humor agregado o palabras no características del lenguaje, etc.</p>
        </div>
      </section>
      <section className="c-banner">
        {<Slider {...settings}>
          {loading ? <div>Loading...</div> : (
            data.content?.map((item) =>
              <div className='flex flex-col justify-center items-center'>
                <img className='w-[10rem] h-[10rem] lg:w-[14rem] lg:h-[14rem] rounded-full object-cover object-center' src={item.images[0]} />
              </div>
            ))}
        </Slider>}
        <Carousel data={data} />
      </section>

    </>


  );
};

export default Home;