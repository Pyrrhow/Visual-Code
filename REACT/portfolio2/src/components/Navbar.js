import React, { useState, useEffect } from "react";

const Navbar = () => {
  const [theme, setTheme] = useState(null);

  useEffect(() => {
    if (window.matchMedia("(prefers-color-scheme: dark)").matches) {
      setTheme("dark");
    } else {
      setTheme("light");
    }
  }, []);

  useEffect(() => {
    if (theme === "dark") {
      document.documentElement.classList.add("dark");
    } else {
      document.documentElement.classList.remove("dark");
    }
  }, [theme]);

  const handleThemeSwitch = () => {
    setTheme(theme === "dark" ? "light" : "dark");
  };
  return (
    <nav className="fixed w-full h-full">
      <div className="flex justify-between">
        <div className="w-full lg:w-1/5 ">
          <div className="flex justify-center py-2">Logo</div>
        </div>
        <div className="hidden lg:block w-3/5   group">
          <ul className="flex justify-center py-2">
            <li className="px-4">Projetos</li>
            <li className="px-4">Habilidades</li>
            <li className="px-4">Curriculo</li>
          </ul>
          <div className="absolute -translate-y-[250px] group-hover:translate-y-10 bg-purple-500 top-0 left-0 w-full h-[200px] transition duration-700 ease-in-out">
            {/* div */}
          </div>
        </div>
        <div className="hidden lg:block w-1/5">
          <div className="flex justify-center py-2">
            <button className="rounded px-4 py-2 bg-black text-white" onClick={handleThemeSwitch}>Dark</button>
          </div>
        </div>
        <div className="lg:hidden">
          <div className="flex justify-center py-2">Menu</div>
        </div>
      </div>
    </nav>
  );
};

export default Navbar;
