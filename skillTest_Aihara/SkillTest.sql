--Q1--
SELECT sm.id AS 店舗ID, SUM(s.price) AS 売り上げ合計
FROM store_mst sm
  INNER JOIN stocks s ON sm.id = s.store_mst_id
  INNER JOIN rent_logs l ON s.id = l.stock_id
GROUP BY sm.id
ORDER BY sm.id DESC;

--Q2--
SELECT
  sm.name AS レンタル店舗名,
  c.name AS 顧客名,
  s.name AS DVDタイトル,
  TO_CHAR(l.rental_date, 'YYYY年MM月DD日DY') AS レンタル年月日
FROM store_mst sm
  INNER JOIN stocks s ON sm.id = s.store_mst_id
  INNER JOIN rent_logs l ON s.id = l.stock_id
  INNER JOIN customers c ON l.customer_id = c.id
ORDER BY
  sm.name DESC,
  s.name ASC,
  l.rental_date DESC;