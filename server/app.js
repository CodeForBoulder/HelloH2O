const express = require('express');

const dotEnv = require('dotenv').config();
const path = require('path');
const logger = require('morgan');
const cookieParser = require('cookie-parser');
const bodyParser = require('body-parser');

const index = require('./routes/index');
const users = require('./routes/users');

const app = express();

app.use(logger('dev'));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));

app.use(cors()); // cross-origin: *

app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'hbs');

app.use('/', index);
app.use('/users', users);


app.use((req, res, next) => {
  const err = new Error('Not Found');
  err.status = 404;
  next(err);
});

app.use((err, req, res, next) => {
  res.status(err.status || 500);
  res.json({
    message: `${err.message} 😫`,
    error: req.app.get('env') === 'development' ? err : 'unknown-env'
  });
});

module.exports = app;
