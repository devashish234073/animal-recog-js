var http = require("http");
var fs = require("fs");
var PORT = 8088;

function serverFunction(req,res) {
  res.writeHead(200,{'Content-Type':'text/html'});
  if(req.url=="/"){
    fs.readFile("toruses.html",(err,data)=>{
      res.end(String(data));
    });
  }
}

var server = http.createServer(serverFunction);

server.listen(PORT,()=>{
  console.log(`started listening on port ${PORT}`);
});
