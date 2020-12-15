grammar html;
start : html EOF;

// Rules
/*html : NOTALLOWED
     | OPEN html* CLOSE
     ;*/

// Alternative:
html
    :TEXT
    | '<html>' html* '</html>'
    | '<head>' html* '</head>'
    | '<title>' html* '</title>'
    | '<body>' html* '</body>'
    | '<h1>' html* '</h1>'
    | '<a>' html* '</a>'
    ;



// Allowed
OPEN  : '<'KEY '>';
CLOSE : '</' KEY*'>';
KEY: ([a-zA-Z][a-zA-Z0-9]*);
TEXT: ([a-zA-Z0-9,. \n\t][a-zA-Z0-9,. \n\t]*);

// Not allowed
NOTALLOWED : ~[<>/]+;
