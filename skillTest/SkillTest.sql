-- Q1
SELECT
	store_mst.name,
	sum(stocks.price)
FROM
	rent_logs
INNER JOIN 
	stocks 
ON 
	rent_logs.stock_id = stocks.id
INNER JOIN
	store_mst
ON
	stocks.store_mst_id = store_mst.id
GROUP BY
	store_mst_id
;

-- Q2
SELECT
	sm.name AS 'レンタル店舗名',
    c.name AS '顧客名',
    s.name AS 'DVDタイトル',
    DATE_FORMAT(rl.rent_date, '%Y %M %d　%W') AS 'レンタル年月日'
FROM
	rent_logs AS rl
INNER JOIN
	stocks AS s
ON
	rl.stock_id = s.id
INNER JOIN
	store_mst AS sm
ON
	s.store_mst_id = sm.id
INNER JOIN
	customers AS c
ON
	rl.customer_id = c.id
ORDER BY
	sm.id DESC,
    s.name ASC,
    rl.rent_date DESC
;