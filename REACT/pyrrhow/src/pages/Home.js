import React from "react";
import RodrigoCartoon from "./assets/RodrigoCartoon.webp";
import Linha from "../components/assets/Linha";
import { MdDataset } from "react-icons/md";

const Home = () => {
  return (
    <div className="text-center text-white justify-center items-center min-h-[100vh]">
      <div className="bg-[#248046] w-full h-10 rounded-t-lg">
        <p className="text-lg py-1">
          Não perca essa chance de me contrar! entre em contato agora mesmo.
        </p>
      </div>

      <div className="p-4">
        <div className="relative w-[90%] h-[35vh] max-h-[550px] bg-[#4e54c8] rounded-lg m-auto overflow-hidden justify-center group">
          <div>
            <div className="">
              <h1 className="pt-4 text-5xl">Rodrigo Pyrrho Nascimento</h1>
              <h2 className="text-sm py-2">
                Analista de Dados | Game Developer | Programador
              </h2>
            </div>
          </div>
          <li className="absolute list-none rounded-sm bg-white/50  top-[-50px] left-[25%] w-20 h-20 animate-[trans-up_25s_infinite_0s]"></li>
          <li className="absolute list-none rounded-lg bg-white/50  top-[-50px] left-[10%] w-5 h-5 z-10 animate-[trans-up_12s_infinite_2s]"></li>
          <li className="absolute list-none rounded-xl bg-white/50  top-[-50px] left-[70%] w-5 h-5 animate-[trans-up_25s_infinite_4s]"></li>
          <li className="absolute list-none rounded bg-white/50  top-[-50px] left-[40%] w-16 h-16 z-10 animate-[trans-up_18s_infinite_0s]"></li>
          <li className="absolute list-none rounded-xl bg-white/50  top-[-50px] left-[65%] w-5 h-5 z-10 animate-[trans-up_25s_infinite_0s]"></li>
          <li className="absolute list-none rounded bg-white/50  top-[-50px] left-[75%] w-32 h-32 animate-[trans-up_25s_infinite_3s]"></li>
          <li className="absolute list-none rounded-2xl bg-white/50  top-[-50px] left-[35%] w-40 h-40 animate-[trans-up_20s_infinite_9s]"></li>
          <li className="absolute list-none rounded-lg bg-white/50  top-[-50px] left-[50%] w-6 h-6 animate-[trans-up_45s_infinite_15s]"></li>
          <li className="absolute list-none rounded bg-white/50  top-[-50px] left-[20%] w-4 h-4 animate-[trans-up_35s_infinite_2s]"></li>
          <li className="absolute list-none rounded-lg bg-white/50  top-[-50px] left-[85%] w-40 h-40  animate-[trans-up_11s_infinite_0s]"></li>
          <img
            className="absolute left-[50%] translate-x-[-50%] group-hover:scale-110 transition duration-1000 ease-in-out h-full"
            src={RodrigoCartoon}
          ></img>
        </div>
        <div className="relative w-[90%] max-h-[30vh]  bg-[#232428] mt-4 rounded-lg m-auto overflow-hidden justify-center text-[#b5bac1]   ">
          <p className="p-4">
            Obcecado por Análise de Dados e Desenvolvimento de Jogos com um
            portfólio impressionante. Profissional autodidata com mais de 4 anos
            de experiência proporcionando experiências inesquecíveis aos
            clientes, ao mesmo tempo em que tento manter uma dependência por
            aprender e melhorar.
          </p>
          <button className="bg-[#4e54c8] rounded-md px-8 py-2 mb-4 text-[#f2f3f5] hover:scale-125 transition duration-150 ease-in-out">
            Mais Informações
          </button>
        </div>
        <div className="my-2">
          <Linha />
        </div>
        <div className="flex">
          <div className="relative w-[20vh] h-[20vh] max-h-[200px] max-w-[200px]rounded-lg m-auto justify-center group">
            <div className="table w-full h-2/5 max-h-[200px] max-w-[200px] bg-[#4e54c8] rounded-t-lg">
              <h4 className=" table-cell align-middle ">Projetos</h4>
            </div>
            <div className=" w-full h-3/5 max-h-[200px] max-w-[200px] bg-[#232428] rounded-b-lg "></div>
            <div className="bg-white w-8 h-8 absolute left-2 top-[40%] translate-y-[-75%] border-[#232428] border-2 rounded-lg text-[#23a559] justify-center items-center">
              <MdDataset className=" absolute left-[50%] translate-x-[-50%] top-[50%] translate-y-[-50%] scale-125" />
            </div>
          </div>
          <div className="relative w-[20vh] h-[20vh] max-h-[200px] max-w-[200px]rounded-lg m-auto justify-center group">
            <div className="table w-full h-2/5 max-h-[200px] max-w-[200px] bg-[#4e54c8] rounded-t-lg">
              <h4 className=" table-cell align-middle ">Habilidades</h4>
            </div>
            <div className=" w-full h-3/5 max-h-[200px] max-w-[200px] bg-[#232428] rounded-b-lg "></div>
            <div className="bg-white w-8 h-8 absolute left-2 top-[40%] translate-y-[-75%] border-[#232428] border-2 rounded-lg text-[#23a559] justify-center items-center">
              <MdDataset className=" absolute left-[50%] translate-x-[-50%] top-[50%] translate-y-[-50%] scale-125" />
            </div>
          </div>
          <div className="relative w-[20vh] h-[20vh] max-h-[200px] max-w-[200px]rounded-lg m-auto justify-center group">
            <div className="table w-full h-2/5 max-h-[200px] max-w-[200px] bg-[#4e54c8] rounded-t-lg">
              <h4 className=" table-cell align-middle ">Curriculo</h4>
            </div>
            <div className=" w-full h-3/5 max-h-[200px] max-w-[200px] bg-[#232428] rounded-b-lg "></div>
            <div className="bg-white w-8 h-8 absolute left-2 top-[40%] translate-y-[-75%] border-[#232428] border-2 rounded-lg text-[#23a559] justify-center items-center">
              <MdDataset className=" absolute left-[50%] translate-x-[-50%] top-[50%] translate-y-[-50%] scale-125" />
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Home;
