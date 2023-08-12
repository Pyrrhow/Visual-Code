import React from "react";
import { AiOutlineQuestionCircle, AiOutlineClose } from "react-icons/ai";
import { PiGlobeDuotone } from "react-icons/pi";
import { RiAccountCircleLine } from "react-icons/ri";

const Navbar = () => {
  return (
    <div className="flex justify-between items-center px-12 p-4 text-sm font-bold">
      <div>
        <img
          className="h-5 py-1 px-4"
          src="data:image/svg+xml;base64,PHN2ZyBjbGFzcz0idGRzLWljb24gdGRzLWljb24tbG9nby13b3JkbWFyayB0ZHMtc2l0ZS1sb2dvLWljb24iIHZpZXdCb3g9IjAgMCAzNDIgMzUiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI+PHBhdGggZD0iTTAgLjFhOS43IDkuNyAwIDAgMCA3IDdoMTFsLjUuMXYyNy42aDYuOFY3LjNMMjYgN2gxMWE5LjggOS44IDAgMCAwIDctN0gwem0yMzguNiAwaC02Ljh2MzQuOEgyNjNhOS43IDkuNyAwIDAgMCA2LTYuOGgtMzAuM1Ywem0tNTIuMyA2LjhjMy42LTEgNi42LTMuOCA3LjQtNi45bC0zOC4xLjF2MjAuNmgzMS4xdjcuMmgtMjQuNGExMy42IDEzLjYgMCAwIDAtOC43IDdoMzkuOXYtMjFoLTMxLjJ2LTdoMjR6bTExNi4yIDI4aDYuN3YtMTRoMjQuNnYxNGg2Ljd2LTIxaC0zOHpNODUuMyA3aDI2YTkuNiA5LjYgMCAwIDAgNy4xLTdINzguM2E5LjYgOS42IDAgMCAwIDcgN3ptMCAxMy44aDI2YTkuNiA5LjYgMCAwIDAgNy4xLTdINzguM2E5LjYgOS42IDAgMCAwIDcgN3ptMCAxNC4xaDI2YTkuNiA5LjYgMCAwIDAgNy4xLTdINzguM2E5LjYgOS42IDAgMCAwIDcgN3pNMzA4LjUgN2gyNmE5LjYgOS42IDAgMCAwIDctN2gtNDBhOS42IDkuNiAwIDAgMCA3IDd6IiBmaWxsPSJjdXJyZW50Q29sb3IiLz48L3N2Zz4="
          alt="Tesla Logo"
        />
      </div>

      <div className="hidden xl:inline">
        <ul className="flex justify-center hover:cursor-pointer">
          <li className="text-white py-1 px-3 hover:rounded hover:bg-black/10 text-sm">
            Vehicles
          </li>
          <li className="text-white py-1 px-3 hover:rounded hover:bg-black/10 text-sm">
            Energy
          </li>
          <li className="text-white py-1 px-3 hover:rounded hover:bg-black/10 text-sm">
            Charging
          </li>
          <li className="text-white py-1 px-3 hover:rounded hover:bg-black/10 text-sm">
            Discover
          </li>
          <li className="text-white py-1 px-3 hover:rounded hover:bg-black/10 text-sm">
            Shop
          </li>
        </ul>
      </div>
      <div className="hidden xl:inline">
        <ul className="flex justify-center items-center hover:cursor-pointer">
          <li className="py-1 px-1 hover:rounded text-white hover:bg-black/10">
            {" "}
            <AiOutlineQuestionCircle size={24} />{" "}
          </li>
          <li className="py-1 px-1 hover:rounded text-white hover:bg-black/10">
            <PiGlobeDuotone size={24} />
          </li>
          <li className="py-1 px-1 hover:rounded text-white hover:bg-black/10">
            <RiAccountCircleLine size={24} />
          </li>
        </ul>
      </div>

      <div className="xl:hidden text-white">
        <button>Menu</button>
      </div>
      <div className="bg-white fixed top-0 left-0 w-full h-80 hidden">
        <div className="flex justify-end pt-8 pr-8">
          <AiOutlineClose size={24} />
        </div>
      </div>
    </div>
  );
};

export default Navbar;
