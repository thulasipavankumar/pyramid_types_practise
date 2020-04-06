
const EventEmitter = require('events');

function stdinLineByLine() {
  const stdin = new EventEmitter();
  let buff = "";

  process.stdin
    .on('data', data => {
      buff += data;
      lines = buff.split(/[\r\n|\n]/);
      buff = lines.pop();
      lines.forEach(line => stdin.emit('line', line));
    })
    .on('end', () => {
      if (buff.length > 0) stdin.emit('line', buff);
    });

  return stdin;
}

const stdin = stdinLineByLine();
stdin.on('line', (x)=>{

for(let i=1;i<=x;i++){
  let lineToPrint = "";
  for(let j=1;j<=i;j--){
      lineToPrint = lineToPrint+""+i;
  }
  console.log(lineToPrint);
}
});