import { useEffect, useState } from "react";
import Navbar from "./components/Navbar";
import MainDiv from "./components/MainDiv";

function App() {

  return (
    <div className="h-screen w-screen">
      <Navbar />
      <MainDiv />
    </div>
  );
}

export default App;
