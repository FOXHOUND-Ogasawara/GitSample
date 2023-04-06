CREATE TABLE STORE_MST (
    ID NUMBER(11) NOT NULL
    ,NAME VARCHAR2(255) NOT NUll
    ,PRIMARY KEY (ID)
);

COMMENT ON TABLE STORE_MST IS '店舗マスターテーブル';
COMMENT ON COLUMN STORE_MST.ID IS '主キー';
COMMENT ON COLUMN STORE_MST.NAME IS '店舗名';

DROP TABLE STORE_MST;

CREATE TABLE CUSTOMERS (
    ID NUMBER(11) NOT NULL
    ,NAME VARCHAR2(255) NOT NULL
    ,STORE_MST_ID NUMBER(11) NOT NULL
    ,MEMBER_CODE VARCHAR2(255) NOT NULL
    ,PRIMARY KEY(id)
);

COMMENT ON TABLE CUSTOMERS IS '顧客データテーブル';
COMMENT ON COLUMN CUSTOMERS.ID IS '主キー';
COMMENT ON COLUMN CUSTOMERS.NAME IS '顧客名';
COMMENT ON COLUMN CUSTOMERS.STORE_MST_ID IS '会員登録店舗ID';
COMMENT ON COLUMN CUSTOMERS.MEMBER_CODE IS '会員番号';

CREATE INDEX CUSTOMERS_SMI_IDX ON CUSTOMERS(STORE_MST_ID);
ALTER TABLE CUSTOMERS ADD CONSTRAINT CUSTOMERS_UNIQUE UNIQUE(STORE_MST_ID,MEMBER_CODE);
ALTER TABLE CUSTOMERS DROP UNIQUE(STORE_MST_ID,MEMBER_CODE);
DROP INDEX CUSTOMERS_SMI_IDX;
DROP TABLE CUSTOMERS;

CREATE TABLE STOCKS (
    ID NUMBER(11) NOT NULL
    ,STORE_MST_ID NUMBER(11) NOT NULL
    ,NAME VARCHAR2(255) NOT NULL
    ,RELEASE_DATE DATE NOT NULL
    ,PRICE NUMBER(11) NOT NULL
    ,PRIMARY KEY(ID)
);

COMMENT ON TABLE STOCKS IS '在庫データテーブル';
COMMENT ON COLUMN STOCKS.STORE_MST_ID IS '在庫店舗ID';
COMMENT ON COLUMN STOCKS.NAME IS 'タイトル';
COMMENT ON COLUMN STOCKS.RELEASE_DATE IS 'リリース日';
COMMENT ON COLUMN STOCKS.PRICE IS '価格';

CREATE INDEX STOCKS_SMI_IDX ON STOCKS(STORE_MST_ID);

DROP INDEX STOCKS_SMI_IDX;
DROP TABLE STOCKS;

CREATE TABLE RENT_LOGS (
    ID NUMBER(11) NOT NULL
    ,CUSTOMER_ID NUMBER(11) NOT NULL
    ,STOCK_ID NUMBER(11) NOT NULL
    ,RENT_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
    ,PRIMARY KEY(ID)
);

COMMENT ON COLUMN RENT_LOGS.CUSTOMER_ID IS '注文顧客ID';
COMMENT ON COLUMN RENT_LOGS.STOCK_ID IS '在庫ID';
COMMENT ON COLUMN RENT_LOGS.RENT_DATE IS 'レンタル日時';

CREATE INDEX RENT_LOGS_SI ON RENT_LOGS(STOCK_ID);
CREATE INDEX RENT_LOGS_CI ON RENT_LOGS(CUSTOMER_ID);

DROP TABLE RENT_LOGS;
DROP INDEX RENT_LOGS_SI;
DROP INDEX RENT_LOGS_CI;

-- 外部キー
ALTER TABLE CUSTOMERS ADD CONSTRAINT CUSTOMERS_SMI_IDX
FOREIGN KEY (STORE_MST_ID)
REFERENCES STORE_MST(ID);

ALTER TABLE STOCKS ADD CONSTRAINT STOCKS_SMI_IDX
FOREIGN KEY (STORE_MST_ID)
REFERENCES STORE_MST(ID);

ALTER TABLE RENT_LOGS ADD CONSTRAINT RENT_LOGS_SI
FOREIGN KEY (STOCK_ID)
REFERENCES STOCKS(ID);

ALTER TABLE RENT_LOGS ADD CONSTRAINT RENT_LOGS_CI
FOREIGN KEY (CUSTOMER_ID)
REFERENCES CUSTOMERS(ID);

-- INSERT文
INSERT ALL
INTO STORE_MST(ID, NAME) VALUES (1, '新宿店')
INTO STORE_MST(ID, NAME) VALUES (2, '渋谷店')
INTO STORE_MST(ID, NAME) VALUES (3, '池袋店')
SELECT * FROM DUAL;

INSERT ALL
INTO CUSTOMERS(ID, NAME, STORE_MST_ID, MEMBER_CODE) VALUES (1 , '山田太郎', 1, '000-000-001')
INTO CUSTOMERS(ID, NAME, STORE_MST_ID, MEMBER_CODE) VALUES (2 , '山田一郎', 2, '000-000-001')
INTO CUSTOMERS(ID, NAME, STORE_MST_ID, MEMBER_CODE) VALUES (3 , '山田二郎', 2, '000-000-002')
INTO CUSTOMERS(ID, NAME, STORE_MST_ID, MEMBER_CODE) VALUES (4 , '山田三郎', 2, '000-000-003')
INTO CUSTOMERS(ID, NAME, STORE_MST_ID, MEMBER_CODE) VALUES (5 , '田中太郎', 3, '000-000-001')
INTO CUSTOMERS(ID, NAME, STORE_MST_ID, MEMBER_CODE) VALUES (6 , '田中一郎', 1, '000-000-002')
INTO CUSTOMERS(ID, NAME, STORE_MST_ID, MEMBER_CODE) VALUES (7 , '田中二郎', 3, '000-000-002')
INTO CUSTOMERS(ID, NAME, STORE_MST_ID, MEMBER_CODE) VALUES (8 , '田中三郎', 2, '000-000-004')
INTO CUSTOMERS(ID, NAME, STORE_MST_ID, MEMBER_CODE) VALUES (9 , '鈴木太郎', 1, '000-000-003')
INTO CUSTOMERS(ID, NAME, STORE_MST_ID, MEMBER_CODE) VALUES (10, '鈴木一郎', 3, '000-000-003')
INTO CUSTOMERS(ID, NAME, STORE_MST_ID, MEMBER_CODE) VALUES (11, '鈴木二郎', 1, '000-000-004')
INTO CUSTOMERS(ID, NAME, STORE_MST_ID, MEMBER_CODE) VALUES (12, '鈴木三郎', 1, '000-000-005')
SELECT * FROM DUAL;

INSERT ALL 
INTO STOCKS(ID, STORE_MST_ID, NAME, RELEASE_DATE, PRICE) VALUES(1 , 1, 'アクション1', '2015-01-01', 200)
INTO STOCKS(ID, STORE_MST_ID, NAME, RELEASE_DATE, PRICE) VALUES(2 , 2, 'コメディ1',   '2015-01-01', 300)
INTO STOCKS(ID, STORE_MST_ID, NAME, RELEASE_DATE, PRICE) VALUES(3 , 2, 'アクション2', '2015-01-01', 250)
INTO STOCKS(ID, STORE_MST_ID, NAME, RELEASE_DATE, PRICE) VALUES(4 , 1, 'コメディ2',   '2015-01-01', 450)
INTO STOCKS(ID, STORE_MST_ID, NAME, RELEASE_DATE, PRICE) VALUES(5 , 3, 'アクション3', '2015-01-01', 340)
INTO STOCKS(ID, STORE_MST_ID, NAME, RELEASE_DATE, PRICE) VALUES(6 , 1, 'ホラー1',    '2015-01-01', 450)
INTO STOCKS(ID, STORE_MST_ID, NAME, RELEASE_DATE, PRICE) VALUES(7 , 3, 'アクション4', '2015-01-01', 380)
INTO STOCKS(ID, STORE_MST_ID, NAME, RELEASE_DATE, PRICE) VALUES(8 , 2, 'SF1',      '2015-01-01', 450)
INTO STOCKS(ID, STORE_MST_ID, NAME, RELEASE_DATE, PRICE) VALUES(9 , 2, 'ホラー2',    '2015-01-01', 400)
INTO STOCKS(ID, STORE_MST_ID, NAME, RELEASE_DATE, PRICE) VALUES(10, 1, 'コメディ3',   '2015-01-01', 450)
INTO STOCKS(ID, STORE_MST_ID, NAME, RELEASE_DATE, PRICE) VALUES(11, 3, 'アクション5', '2015-01-01', 500)
INTO STOCKS(ID, STORE_MST_ID, NAME, RELEASE_DATE, PRICE) VALUES(12, 1, 'コメディ4',   '2015-01-01', 450)
SELECT * FROM DUAL;

INSERT ALL 
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(1 , 1 , 1 , '2016-02-11')
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(2 , 12, 12, '2016-01-18')
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(3 , 10, 3 , '2016-04-21')
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(4 , 4 , 4 , '2016-06-13')
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(5 , 5 , 3 , '2016-07-01')
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(6 , 6 , 5 , '2016-07-03')
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(7 , 7 , 5 , '2016-07-09')
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(8 , 4 , 6 , '2016-08-01')
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(9 , 8 , 7 , '2016-08-13')
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(10, 9 , 8 , '2016-09-03')
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(11, 10, 11, '2016-09-19')
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(12, 1 , 4 , '2016-09-20')
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(13, 1 , 10, '2016-09-20')
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(14, 9 , 9 , '2016-10-10')
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(15, 11, 5 , '2016-10-14')
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(16, 6 , 10, '2016-10-14')
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(17, 5 , 8 , '2016-10-14')
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(18, 1 , 4 , '2016-11-12')
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(19, 1 , 6 , '2016-11-12')
INTO RENT_LOGS(ID, CUSTOMER_ID, STOCK_ID, RENT_DATE) VALUES(20, 4 , 12, '2016-11-13')
SELECT * FROM DUAL;

--Q1
SELECT 
    SM.NAME AS 店舗名
    ,SUM(S.PRICE)　AS　売り上げ合計
FROM STORE_MST SM
INNER JOIN STOCKS S
ON SM.ID = S.STORE_MST_ID
INNER JOIN RENT_LOGS RL
ON RL.STOCK_ID = S.ID
GROUP BY
    SM.NAME
ORDER BY
    SUM(S.PRICE) ASC
;
--Q2
SELECT
    SM.NAME AS レンタル店舗名    
    ,C.NAME AS 顧客名
    ,S.NAME AS DVDタイトル
    ,TO_CHAR(RL.RENT_DATE,'YYYY MON dd DAY','nls_date_language=''AMERICAN''') AS レンタル年月日
FROM STORE_MST SM
LEFT JOIN STOCKS S
ON SM.ID = S.STORE_MST_ID
LEFT JOIN RENT_LOGS RL
ON RL.STOCK_ID = S.ID
LEFT JOIN CUSTOMERS C
ON C.ID = CUSTOMER_ID
WHERE
    C.NAME IS NOT NULL
GROUP BY
    SM.NAME
    ,C.NAME
    ,S.NAME
    ,RL.RENT_DATE
ORDER BY
    SM.NAME DESC
    ,S.NAME ASC
    ,RL.RENT_DATE DESC
;


