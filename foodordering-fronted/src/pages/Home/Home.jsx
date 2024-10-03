import React from "react";
import "./home.css";
import hero from '../../assets/c-hero.png'
import FeatureCard from '../../components/FeatureCard/FeatureCard';
import DeliveryDiningOutlinedIcon from '@mui/icons-material/DeliveryDiningOutlined';

const Home = () => {
  return (
    <>
      <section className="c-hero">
        <div className="c-hero__slogan-wrapper">
          <h1>Encuentra los mejores restaurantes aqui mismo</h1>
        </div>
        <div className="c-hero__image-wrapper">
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
          <h2>Quienes somos</h2>
          <p>Hay muchas variaciones de los pasajes de Lorem Ipsum disponibles, pero la mayoría sufrió alteraciones en alguna manera, ya sea porque se le agregó humor, o palabras aleatorias que no parecen ni un poco creíbles. Si vas a utilizar un pasaje de Lorem Ipsum, necesitás estar seguro de que no hay nada avergonzante escondido en el medio del texto. Todos los generadores de Lorem Ipsum que se encuentran en Internet tienden a repetir trozos predefinidos cuando sea necesario, haciendo a este el único generador verdadero (válido) en la Internet. Usa un diccionario de mas de 200 palabras provenientes del latín, combinadas con estructuras muy útiles de sentencias, para generar texto de Lorem Ipsum que parezca razonable. Este Lorem Ipsum generado siempre estará libre de repeticiones, humor agregado o palabras no características del lenguaje, etc.</p>
        </div>
      </section>

    </>


  );
};

export default Home;