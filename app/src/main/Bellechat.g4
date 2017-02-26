grammar Bellechat;
chat: (item)*;

item: (textblock | expr);
expr: (nullary|unary|binary|ternary);

parm: (STRING| '"'(STRING)+ '"');
nullary: NULLCMD;
unary: UNCMD parm;
binary: BINCMD parm parm;
ternary: TERNCMD parm parm parm;


textblock: (phoneme)+;
phoneme: STRING;

ignored: UNKNOWN+;

NULLCMD: (CMDPFX ('scream'|'noop'));
UNCMD: (CMDPFX ('pitch'|'noop1ary'|'pause'|'face'|'say'));
BINCMD: (CMDPFX ('run'|'noop2ary'));
TERNCMD: (CMDPFX 'noop3ary');

CMDPFX: '\\';
STRING: (ALPHANUM+);
ALPHANUM: [a-zA-Z0-9];
WS: ([ \r\n\t])+ -> skip;
UNKNOWN: . -> skip;
