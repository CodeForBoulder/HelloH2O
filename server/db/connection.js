const environment = process.env.NODE_ENV || 'development';
const config = require('../knexfile.js');
const enviromentConfig = cosfig[environment];
const knex = require('knex');
const connection = knex(environmentConfig);

module.exports = connection;
