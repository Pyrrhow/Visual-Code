import Model from "./Model";
import Navbar from "./Navbar";
import TopBanner from "./TopBanner";

export default function Videobg() {
  return (
    <div className="relative flex-col items-center justify-center h-screen shrink-0 bg-black/20">
      <video
        className="absolute h-full w-full object-cover -z-10"
        autoPlay
        muted
        loop
        disablePictureInPicture
      >
        <source
          src="https://digitalassets.tesla.com/tesla-contents/video/upload/f_auto,q_auto/Homepage-Demo-Drive-Desktop-NA.mp4"
          type="video/mp4"
        />
        Your browser does not support the video tag.
      </video>
      <TopBanner />
      <Navbar />
      <Model />
    </div>
  );
}
