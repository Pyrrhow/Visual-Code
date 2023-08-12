import React from "react";
import RodrigoCartoon from "./assets/RodrigoCartoon.webp";

const Sobre = () => {
  return (
    <div className=" grid grid-rows-5 grid-flow-col bg-[#2b2d31] w-[80vw] text-gray-200 absolute top-[10vh] right-[10vw] ">
      <div className="col-span-5 row-span-1">
        <h1 className="text-black bg-white text-6xl text-center p-5">Sobre</h1>
      </div>
      <div className="  px-4 col-span-3 row-span-3 z-10 self-center ">
        <p className="indent-4 text-justify bg-blue-50/5 rounded p-4">
          Obcecado por Análise de Dados e Desenvolvimento de Jogos com um
          portfólio impressionante. Profissional autodidata com mais de 4 anos
          de experiência proporcionando experiências inesquecíveis aos clientes,
          ao mesmo tempo em que tento manter uma dependência por aprender e
          melhorar.
        </p>
      </div>
      <div className="col-start-1 row-start-5 col-span-2 row-span-1 "></div>
      <div className="col-start-2 row-start-5 col-span-2 row-span-1 ">
        <button className="rounded bg-white text-black px-8 py-4">
          Mais Informações
        </button>
      </div>
      <div className=" col-span-2 row-span-4 z-0">
        <img
          src={RodrigoCartoon}
          className="h-full w-full object-none object-bottom overflow-visible"
        />
      </div>
    </div>
  );
};

export default Sobre;
