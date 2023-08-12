import Navbar from "./components/Navbar";
import Home from "./pages/Home";
import About from "./pages/About";
import Projects from "./pages/Projects";
import Skills from "./pages/Skills";
import Resume from "./pages/Resume";
import { Route, Routes } from "react-router-dom";

function App() {
  return (
    <div className="flex h-[100vh] w-[100vw]">
      <div className="w-[75px] h-full">
        <div className="w-[75px] h-full fixed">
          <Navbar />
        </div>
      </div>
      <div className="bg-[#313338] w-full h-fit">
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/About" element={<About />} />
          <Route path="/Projects" element={<Projects />} />
          <Route path="/Skills" element={<Skills />} />
          <Route path="/Resume" element={<Resume />} />
        </Routes>
      </div>
    </div>
  );
}

export default App;
