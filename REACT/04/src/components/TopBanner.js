import React from "react";

const TopBanner = () => {
  return (
    <div className="bg-gradient-to-r from-[#1c1f27] from-10% via-[#3d4c74] via-30% to-[#111] to-60% shadow">
      <div className="p-4 flex justify-center ">
        <h5 className=" text-white bold text-lg  min-w-fit max-h-[1.75rem] ">
          $7,500 Federal Tax Credit
        </h5>

        <p className=" text-white text-sm text-center px-2 py-1">
          Available for new Model 3 and Model Y. Reductions to tax credit likely
          after Dec 31. <spam className=" underline">See Details</spam>
        </p>
      </div>
    </div>
  );
};

export default TopBanner;
