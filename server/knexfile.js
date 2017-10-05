const dotEnv = require('dotenv');
dotEnv.config();

module.exports = {

  development: {
    client: 'pg',
    connection: "postgresql://localhost/waterblog"
  },

  production: {
    client: 'pg',
    connection: process.env.DATABASE_URL + '?ssl=true'
  }
};
