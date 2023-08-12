import React from "react";
import Linha from "../components/assets/Linha";

const Resume = () => {
  return (
    <div className="text-center text-white justify-center items-center min-h-[100vh]">
      <h1 className="text-5xl py-4">Curriculo</h1>

      <Linha />

      <div className="bg-white text-black w-[90%] mx-auto text-3xl p-4 m-8 max-w-[1400px]">
        <h2 className="font-extrabold text-[#23a559]">
          RODRIGO PYRRHO NASCIMENTO
        </h2>
        <ul className="text-sm flex justify-between px-4 font-light">
          <li>Natal, RN 59091-190</li>
          <li>+55(84)98817-6389</li>
          <li>rpyrrhow@gmail.com</li>
          <li>https://www.linkedin.com</li>
        </ul>
        <Linha />
        {/* text-[#faa61b] */}
        <div className="text-lg text-start px-4">
          <h3 className="text-2xl font-bold text-[#23a559]">
            Experiencia em Analise de Dados
          </h3>
          <h4 className="text-xl font-bold ">PREVER DADOS DO CASINO</h4>
          <ul className="list-disc px-8">
            <li>
              Construir um web scraper capais de coletar dados de um casino ao
              vivo.
            </li>
            <li>
              Construir uma planilha no Excel para mostrar quantas vesses uma
              sequência saiu e mostrar a probabilidade de cada sequência.
            </li>
            <li>
              Implementei um modelo em Python para analisar a probabilidade do
              próximo número ser maior ou menor que 2.
            </li>
          </ul>
          <h4 className="text-xl font-bold ">PREVER DADOS DO CASINO</h4>
          <ul className="list-disc px-8">
            <li>
              Construir um web scraper capais de coletar dados de um casino ao
              vivo.
            </li>
            <li>
              Construir uma planilha no Excel para mostrar quantas vesses uma
              sequência saiu e mostrar a probabilidade de cada sequência.
            </li>
            <li>
              Implementei um modelo em Python para analisar a probabilidade do
              próximo número ser maior ou menor que 2.
            </li>
          </ul>
        </div>
        <Linha />
        <div className="text-lg text-start px-4">
          <h3 className="text-2xl font-bold text-[#23a559]">
            Experiencia Profissional
          </h3>
          <div className="flex justify-between">
            <h4 className="text-xl font-bold ">LILLY SOCIAL MEDIA</h4>
            <p className="text-sm font-light">Maio 2022–Atual</p>
          </div>
          <p className="text-sm font-light">Sócio Gerente</p>
          <ul className="list-disc px-8">
            <li>
              Criação e gerenciamento de anúncios no Facebook e Instagram.
            </li>
            <li>
              Criação de conteúdo digital para clientes no Facebook e Instagram.
            </li>
          </ul>
          <div className="flex justify-between">
            <h4 className="text-xl font-bold ">GOLFRAN</h4>
            <p className="text-sm font-light">Julho 2019 – Junho 2022</p>
          </div>
          <p className="text-sm font-light">Franqueado</p>
          <ul className="list-disc px-8">
            <li>Gerente de operações diárias.</li>
            <li>
              Criação e gerenciamento de anúncios no Facebook e Instagram.
            </li>
            <li>
              Treinamento de potenciais clientes em vendas diretas, pessoalmente
              e por telefone.
            </li>
            <li>
              Criei um catálogo digital dos produtos e fiz um anuncio que
              resultou em um ótimo ROI (retorno sobre investimento).
            </li>
            <li>
              Criei um macro no Excel para enviar mensagens para potenciais
              clientes.
            </li>
          </ul>
          <Linha />
          <h3 className="text-2xl font-bold text-[#23a559]">EDUCAÇÃO</h3>
          <h4 className="text-xl font-bold ">CERTIFICADOS</h4>
          <ul className="list-disc px-8">
            <li>Google Análise de Dados</li>
            <li>Google Tecnologia da Informação</li>
          </ul>
          <h4 className="text-xl font-bold ">Graduação</h4>
          <ul className="list-disc px-8">
            <li className="">
              UNP - Universidade Potiguar
              <span className="block text-sm font-light">
                Big Data & Inteligencia Analitica: 2023 – 2025
              </span>
            </li>
            <li className="">
              UFRN - Universidade federal do rio grande do norte
              <span className="block text-sm font-light">
                Engenharia de computação: 2011 – 2016 (Incompleto)
              </span>
            </li>
          </ul>

          <h4 className="text-xl font-bold ">Bolsas</h4>
          <ul className="list-disc px-8">
            <li className="">
            Ciências sem Fronteiras: Estados Unidos da America
            <span className="block text-sm font-light">
              CSULB – California State University Long Beach: 2012 – 2013
              </span>
              <span className="block text-sm font-light">
              Stanford University (Summer): 2013
              </span>
            </li>
            <li className="">
            Gamedu
            <span className="block text-sm font-light">
              Desenvolvimento de jogos educativos: 2014
              </span>
            </li>
          </ul>
        </div>
      </div>
    </div>
  );
};

export default Resume;
