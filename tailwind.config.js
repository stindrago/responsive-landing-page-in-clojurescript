module.exports = {
  content: ["./target/**/*.{html,js}"],
  Theme: {
    extend: {
        fontFamily: {
            sans: ['Roboto', 'sans-serif'],
        },
    },
  },
  plugins: [require('daisyui')],
}
