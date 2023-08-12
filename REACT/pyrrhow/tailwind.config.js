/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/**/*.{js,jsx,ts,tsx}"],
  theme: {
    extend: {
      keyframes:{
        
        'trans-right':{
          '0% , 100%':{ transform: 'translateX(50px)'},
          '50%':{transform:'translateX(0)'}
        },
        'trans-up':{
          '0%':{ transform: 'translateY(400px) rotate(720deg)', opacity:1},
          '100%':{transform:'translateY(0) rotate(0deg)', opacity:0}
        }
      },
      animation:{
        'trans-right':'trans-right 1.5s ease-in-out infinite',
        'trans-up-10':'trans-up 10s ease-out infinite;',
      }
    },
  },
  plugins: [],
};
