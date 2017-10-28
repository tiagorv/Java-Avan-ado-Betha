var http = require('http');
var app = require('./config/express');

http
    .createServer(app)
    .listen(8081, function(){
        console.log('Servidor Iniciado com Sucesso na Porta 8081!!!')
})