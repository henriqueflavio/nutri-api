CREATE TABLE ESTADO (
  ID_ESTADO SERIAL  NOT NULL ,
  DESCRICAO VARCHAR      ,
PRIMARY KEY(ID_ESTADO));




CREATE TABLE REFEICAO (
  ID_REFEICAO SERIAL  NOT NULL ,
  HORARIO VARCHAR    ,
  DESCRICAO INTEGER    ,
  OBSERVACAO VARCHAR      ,
PRIMARY KEY(ID_REFEICAO));




CREATE TABLE ALIMENTO (
  ID_ALIMENTO SERIAL  NOT NULL ,
  DESCRICAO VARCHAR    ,
  QUANTIDADE INTEGER    ,
  MEDIDA VARCHAR      ,
PRIMARY KEY(ID_ALIMENTO));




CREATE TABLE CIDADE (
  ID_CIDADE SERIAL  NOT NULL ,
  ID_ESTADO INTEGER   NOT NULL ,
  DESCRICAO VARCHAR      ,
PRIMARY KEY(ID_CIDADE),
  FOREIGN KEY(ID_ESTADO)
    REFERENCES ESTADO(ID_ESTADO)
      ON DELETE CASCADE
      ON UPDATE CASCADE);


CREATE INDEX IFK_Rel_01 ON CIDADE (ID_ESTADO);


CREATE TABLE REFEICAO_ALIMENTO (
  ID_REFEICAO INTEGER   NOT NULL ,
  ID_ALIMENTO INTEGER   NOT NULL ,
  ID SERIAL  NOT NULL   ,
PRIMARY KEY(ID_REFEICAO, ID_ALIMENTO),
  FOREIGN KEY(ID_REFEICAO)
    REFERENCES REFEICAO(ID_REFEICAO)
      ON DELETE CASCADE
      ON UPDATE CASCADE,
  FOREIGN KEY(ID_ALIMENTO)
    REFERENCES ALIMENTO(ID_ALIMENTO)
      ON DELETE CASCADE
      ON UPDATE CASCADE);


CREATE INDEX IFK_Rel_05 ON REFEICAO_ALIMENTO (ID_REFEICAO);
CREATE INDEX IFK_Rel_06 ON REFEICAO_ALIMENTO (ID_ALIMENTO);


CREATE TABLE PACIENTE (
  ID_PACIENTE SERIAL  NOT NULL ,
  ID_CIDADE INTEGER   NOT NULL ,
  NOME VARCHAR   NOT NULL ,
  DATA_NASCIMENTO DATE    ,
  SEXO CHAR    ,
  EMAIL VARCHAR    ,
  TELEFONE VARCHAR    ,
  CELULAR VARCHAR    ,
  ESTADO_CIVIL INTEGER    ,
  OCUPACAO VARCHAR    ,
  CPF VARCHAR    ,
  CEP VARCHAR    ,
  ENDERECO VARCHAR    ,
  NUMERO VARCHAR    ,
  COMPLEMENTO VARCHAR    ,
  BAIRRO VARCHAR    ,
  OBSERVACAO VARCHAR      ,
PRIMARY KEY(ID_PACIENTE),
  FOREIGN KEY(ID_CIDADE)
    REFERENCES CIDADE(ID_CIDADE));


CREATE INDEX IFK_Rel_03 ON PACIENTE (ID_CIDADE);


CREATE TABLE AVALIACAO_ANTROPOMETRICA (
  ID_AVALIACAO SERIAL  NOT NULL ,
  PACIENTE_ID_PACIENTE INTEGER   NOT NULL ,
  DATA_CADASTRO DATE    ,
  IDADE INTEGER    ,
  PESO DOUBLE PRECISION    ,
  PERC_GORDURA DOUBLE PRECISION    ,
  GORD_ABSOLUTA DOUBLE PRECISION    ,
  MASSA_MAGRA DOUBLE PRECISION    ,
  CIRCUNF_CINTURA DOUBLE PRECISION    ,
  CIRCUNF_ABDOMEN DOUBLE PRECISION    ,
  CIRCUNF_TORAX DOUBLE PRECISION    ,
  CIRCUNF_BRACO DOUBLE PRECISION    ,
  CIRCUNF_BRACO_CONTR DOUBLE PRECISION    ,
  CIRCUNF_COXA DOUBLE PRECISION    ,
  DOBRA_TRICEPS DOUBLE PRECISION    ,
  DOBRA_SUBESCAPULAR DOUBLE PRECISION    ,
  DOBRA_AXILAR_MED DOUBLE PRECISION    ,
  DOBRA_SUPRAILIACA DOUBLE PRECISION    ,
  DOBRA_ABDOMEN DOUBLE PRECISION    ,
  DOBRA_PEITORAL DOUBLE PRECISION    ,
  DOBRA_COXA DOUBLE PRECISION      ,
PRIMARY KEY(ID_AVALIACAO),
  FOREIGN KEY(PACIENTE_ID_PACIENTE)
    REFERENCES PACIENTE(ID_PACIENTE)
      ON DELETE CASCADE
      ON UPDATE CASCADE);


CREATE INDEX IFK_Rel_02 ON AVALIACAO_ANTROPOMETRICA (PACIENTE_ID_PACIENTE);


CREATE TABLE PLANO_ALIMENTAR (
  ID_PLANO SERIAL  NOT NULL ,
  PACIENTE_ID_PACIENTE INTEGER   NOT NULL ,
  DESCRICAO VARCHAR      ,
PRIMARY KEY(ID_PLANO, PACIENTE_ID_PACIENTE),
  FOREIGN KEY(PACIENTE_ID_PACIENTE)
    REFERENCES PACIENTE(ID_PACIENTE)
      ON DELETE CASCADE
      ON UPDATE CASCADE);


CREATE INDEX IFK_Rel_04 ON PLANO_ALIMENTAR (PACIENTE_ID_PACIENTE);



