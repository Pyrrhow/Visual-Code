import React, { useState } from "react";
import Linha from "../components/assets/Linha";
import { MdDataset } from "react-icons/md";

const Projects = () => {
  const [showDataButtom, setDataProjects] = useState(false);
  const [showProgramingButtom, setProgramingProjects] = useState(false);
  return (
    <div className="text-center text-white m-auto min-h-[100vh] flex">
      <div className="w-[300px] max-h-screen bg-[#2b2d31]  py-2">
        <div className=" group ">
          <buttom
            className={
              showDataButtom
                ? "w-full block bg-[#232428] cursor-pointer p-4 relative"
                : "w-full block hover:bg-[#232428] cursor-pointer p-4 relative "
            }
            onClick={() =>
              setDataProjects(!showDataButtom, setProgramingProjects(false))
            }
          >
            Analise de Dados
          </buttom>
          {showDataButtom ? (
            // <div className="absolute w-auto p-2 min-w-max origin-left right-0 translate-x-[100%] rounded-md shadow-md text-white bg-gray-900 text-xs font-bold transition-all duration-100 scale-0  group-hover:scale-100">
            //   <p className="px-2">descrição do projeto 1</p>
            // </div>
            <ul className="bg-[#313338]">Data Projects </ul>
          ) : null}
        </div>
        <buttom
          className={
            showProgramingButtom
              ? "w-full block bg-[#232428] cursor-pointer p-4 relative"
              : "w-full block hover:bg-[#232428] cursor-pointer p-4 relative "
          }
          onClick={() =>
            setProgramingProjects(!showProgramingButtom, setDataProjects(false))
          }
        >
          Projeto 2
        </buttom>
        <buttom className=" w-full block hover:bg-[#232428] cursor-pointer p-4">
          Projeto 3
        </buttom>
        {/* <div className="bg-white h-[50vh] m-2">dasdsa</div> */}
      </div>
      <div className="w-full bg-[#313338]  max-h-screen overflow-auto p-2 ">
        <h1 className="text-5xl">Projetos</h1>
        <div className="py-4">
          <Linha />
        </div>
        <div className="pb-4">
          <p>Aqui estão alguns projetos que fiz ao longo do tempo</p>
        </div>
        <div className="flex">
          <div className="relative w-[20vh] h-[20vh] max-h-[200px] max-w-[200px]rounded-lg m-auto justify-center group">
            <div className="table w-full h-2/5 max-h-[200px] max-w-[200px] bg-[#4e54c8] rounded-t-lg">
              <h4 className=" table-cell align-middle ">Projeto 1</h4>
            </div>
            <div className=" w-full h-3/5 max-h-[200px] max-w-[200px] bg-[#232428] rounded-b-lg py-2 overflow-auto">
              descrição sobre o projeto 1 descrição sobre o projeto 1 descrição
              sobre o projeto 1 descrição sobre o projeto 1
            </div>
            <div className="bg-white w-8 h-8 absolute left-2 top-[40%] translate-y-[-75%] border-[#232428] border-2 rounded-lg text-[#23a559] justify-center items-center">
              <MdDataset className=" absolute left-[50%] translate-x-[-50%] top-[50%] translate-y-[-50%] scale-125" />
            </div>
          </div>
          <div className="relative w-[20vh] h-[20vh] max-h-[200px] max-w-[200px]rounded-lg m-auto justify-center group">
            <div className="table w-full h-2/5 max-h-[200px] max-w-[200px] bg-[#4e54c8] rounded-t-lg">
              <h4 className=" table-cell align-middle ">Projeto 1</h4>
            </div>
            <div className=" w-full h-3/5 max-h-[200px] max-w-[200px] bg-[#232428] rounded-b-lg py-2 overflow-auto">
              descrição sobre o projeto 1 descrição sobre o projeto 1 descrição
              sobre o projeto 1 descrição sobre o projeto 1
            </div>
            <div className="bg-white w-8 h-8 absolute left-2 top-[40%] translate-y-[-75%] border-[#232428] border-2 rounded-lg text-[#23a559] justify-center items-center">
              <MdDataset className=" absolute left-[50%] translate-x-[-50%] top-[50%] translate-y-[-50%] scale-125" />
            </div>
          </div>
          <div className="relative w-[20vh] h-[20vh] max-h-[200px] max-w-[200px]rounded-lg m-auto justify-center group">
            <div className="table w-full h-2/5 max-h-[200px] max-w-[200px] bg-[#4e54c8] rounded-t-lg">
              <h4 className=" table-cell align-middle ">Projeto 1</h4>
            </div>
            <div className=" w-full h-3/5 max-h-[200px] max-w-[200px] bg-[#232428] rounded-b-lg py-2 overflow-auto">
              descrição sobre o projeto 1 descrição sobre o projeto 1 descrição
              sobre o projeto 1 descrição sobre o projeto 1
            </div>
            <div className="bg-white w-8 h-8 absolute left-2 top-[40%] translate-y-[-75%] border-[#232428] border-2 rounded-lg text-[#23a559] justify-center items-center">
              <MdDataset className=" absolute left-[50%] translate-x-[-50%] top-[50%] translate-y-[-50%] scale-125" />
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Projects;
