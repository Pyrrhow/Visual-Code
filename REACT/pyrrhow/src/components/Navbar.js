import React from "react";
import { Link, useMatch, useResolvedPath } from "react-router-dom";
import MainLogo from "./assets/MainLogo";
import ResumeIcon from "./assets/ResumeIcon";
import Linha from "./assets/Linha";

import {
  MdAccountCircle,
  MdDataset,
  MdDarkMode,
  MdLightMode,
  MdLanguage,
} from "react-icons/md";
import { GiSkills } from "react-icons/gi";

const Navbar = () => {
  return (
    <div className=" block w-full h-full bg-[#1e1f22]  py-3">
      <div className="m-auto w-fit">
        <SvgIcon to="/" icon={<MdDataset />} color="" />
      </div>
      <div className="mx-5">
        <Linha />
      </div>
      <div className="mx-auto w-fit ">
        <div className="">
          <CustomLink className="" to="/About">
            <div className=" p-2">
              <MdAccountCircle />
            </div>
          </CustomLink>
          <CustomLink className="" to="/Projects">
            <div className=" p-2">
              <MdDataset />
            </div>
          </CustomLink>
          <CustomLink className="" to="/Skills">
            <div className=" p-2">
              <GiSkills />
            </div>
          </CustomLink>
        </div>
      </div>

      <div className="mx-5">
        <Linha />
      </div>

      <div className="m-auto w-fit">
        <ImgLink className="" to="/Resume"></ImgLink>
      </div>
      <div className="mx-5">
        <Linha />
      </div>
      <div className="m-auto w-fit">
        <div>
          <a className="" to="/">
            <div className="bg-[#313338] rounded-full h-12 w-12 text-[#23a559] text-3xl my-2 hover:text-white hover:rounded-2xl hover:bg-[#23a559] transition  duration-300 ease-in-out">
              <div className=" p-2">
                <MdLanguage />
              </div>
            </div>
          </a>
          <a className="" to="/">
            <div className="bg-[#313338] rounded-full h-12 w-12 text-[#23a559] text-3xl my-2 hover:text-white hover:rounded-2xl hover:bg-[#23a559] transition  duration-300 ease-in-out">
              <div className=" p-2">
                <MdDarkMode />
              </div>
            </div>
          </a>
        </div>
      </div>
    </div>
  );
};

function SvgIcon({ to, icon, color, children, ...props }) {
  const resolvedPath = useResolvedPath(to);
  const isActive = useMatch({ path: resolvedPath.pathname, end: true });

  return (
    <Link to={to} {...props}>
      <div
        className={
          isActive
            ? "bg-[#5865f2] rounded-2xl  h-12 w-12 py-2 px-0.5 fill-[#dbdee1]"
            : "bg-[#313338] rounded-full  h-12 w-12 py-2 px-0.5 fill-[#dbdee1] hover:fill-white hover:bg-[#5865f2] hover:rounded-2xl transition duration-300 ease-in-out"
        }
      >
        {icon}
        {children}
      </div>
    </Link>
  );
}

function CustomLink({ to, children, ...props }) {
  const resolvedPath = useResolvedPath(to);
  const isActive = useMatch({ path: resolvedPath.pathname, end: true });

  return (
    <div
      className={
        isActive
          ? "bg-[#23a559] rounded-2xl h-12 w-12 text-white text-3xl my-2 hover:text-white hover:rounded-2xl hover:bg-[#23a559] transition  duration-300 ease-in-out"
          : "bg-[#313338] rounded-full h-12 w-12 text-[#23a559] text-3xl my-2 hover:text-white hover:rounded-2xl hover:bg-[#23a559] transition  duration-300 ease-in-out"
      }
    >
      <Link to={to} {...props}>
        {children}
      </Link>
    </div>
  );
}

function ImgLink({ to, children, ...props }) {
  const resolvedPath = useResolvedPath(to);
  const isActive = useMatch({ path: resolvedPath.pathname, end: true });

  return (
    <div
      className={
        isActive
          ? "bg-[#faa61b] rounded-2xl h-12 w-12  text-3xl my-2 "
          : "group bg-[#313338] rounded-full h-12 w-12  text-3xl my-2  hover:rounded-2xl hover:bg-[#faa61b] transition  duration-300 ease-in-out"
      }
    >
      <Link to={to} {...props}>
        <div className=" p-2">
          <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 100 100">
            <g
              className={
                isActive
                  ? "fill-[#313338]"
                  : "fill-[#faa61b] group-hover:fill-[#313338]"
              }
              transform="translate(0,100) scale(0.1,-0.1)"
            >
              <path
                d="M238 934 c-46 -24 -58 -61 -58 -178 0 -78 4 -107 14 -113 7 -4 18
  -24 25 -44 6 -20 23 -47 36 -59 14 -13 25 -35 25 -49 0 -22 -9 -30 -50 -49
  -28 -13 -74 -30 -102 -39 -109 -32 -128 -64 -128 -215 0 -89 3 -107 18 -121
  17 -15 57 -17 364 -17 321 0 346 1 361 18 14 15 17 40 17 121 0 153 -15 176
  -140 220 -118 40 -140 53 -140 82 0 14 11 36 25 49 13 12 30 39 36 59 7 20 18
  40 25 44 10 6 14 35 14 113 l0 105 -30 17 c-16 9 -30 20 -30 25 0 4 -9 16 -20
  27 -18 18 -33 20 -127 20 -76 -1 -116 -5 -135 -16z m252 -39 c5 -14 21 -30 35
  -35 23 -9 25 -15 25 -66 0 -40 -3 -55 -12 -52 -7 3 -14 17 -16 31 -5 43 -37
  58 -94 45 -35 -8 -61 -8 -95 0 -58 13 -90 -2 -95 -45 -2 -14 -9 -28 -15 -31
  -10 -3 -13 14 -13 63 0 57 3 69 25 90 23 24 31 25 135 25 109 0 111 0 120 -25z
  m-110 -110 c19 1 51 3 70 5 31 5 35 2 38 -20 4 -29 29 -60 49 -60 17 0 17 -34
  -1 -49 -7 -6 -16 -25 -20 -42 -13 -67 -103 -122 -171 -105 -41 10 -94 64 -101
  102 -3 19 -15 39 -25 45 -29 15 -22 42 14 59 17 8 33 24 35 35 7 42 10 45 44
  37 18 -4 49 -7 68 -7z m35 -298 c34 11 35 10 34 -15 0 -18 -12 -37 -34 -55
  l-34 -28 -36 28 c-24 19 -35 36 -35 55 0 25 1 26 35 15 25 -7 45 -7 70 0z
  m-83 -96 c29 -25 28 -35 -1 -51 -15 -8 -24 -1 -51 36 -26 36 -30 48 -19 54 14
  9 25 3 71 -39z m178 32 c0 -3 -14 -24 -31 -48 -26 -36 -35 -42 -50 -35 -10 6
  -20 14 -23 19 -9 14 71 81 89 75 8 -4 15 -8 15 -11z m-198 -113 c9 0 19 -4 23
  -9 7 -13 -5 -91 -15 -91 -8 0 -70 131 -70 146 1 5 11 -3 23 -18 13 -16 30 -28
  39 -28z m173 -26 c-14 -38 -30 -73 -34 -77 -10 -10 -35 78 -26 92 3 6 14 11
  24 11 10 0 26 12 36 26 27 42 27 21 0 -52z m-87 38 c2 -7 -7 -12 -23 -12 -24
  0 -26 2 -15 15 14 17 31 16 38 -3z m10 -102 c14 -56 12 -83 -10 -113 -13 -17
  -15 -15 -35 20 -22 39 -21 63 3 141 8 27 28 4 42 -48z"
              />
              <path
                d="M627 844 c-17 -17 13 -24 109 -24 l104 0 0 -53 c0 -29 5 -58 12 -65
  7 -7 36 -12 65 -12 l53 0 0 -249 c0 -285 9 -261 -101 -261 -39 0 -69 -4 -69
  -10 0 -6 35 -10 84 -10 64 0 88 4 100 16 14 13 16 52 16 276 l0 260 -67 69
  -66 69 -117 0 c-64 0 -120 -3 -123 -6z m288 -84 l39 -40 -42 0 -42 0 0 40 c0
  22 1 40 3 40 2 0 21 -18 42 -40z"
              />
              <path
                d="M604 596 c-50 -42 -31 -125 31 -140 31 -8 75 9 75 29 0 17 -16 20
  -25 5 -10 -16 -51 -11 -68 8 -38 42 -3 100 52 89 36 -7 50 8 22 22 -31 17 -58
  13 -87 -13z"
              />
              <path
                d="M750 607 c0 -25 47 -151 57 -154 12 -4 69 154 60 164 -11 11 -25 -8
  -37 -52 -7 -25 -15 -45 -19 -45 -3 0 -14 23 -24 50 -17 47 -37 67 -37 37z"
              />
            </g>
          </svg>
        </div>
      </Link>
    </div>
  );
}

export default Navbar;
