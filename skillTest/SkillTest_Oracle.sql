-- Q1
SELECT
	sm.name,
	sum(s.price)
FROM
	rent_logs rl
INNER JOIN 
	stocks s
ON 
	rl.stock_id = s.id
INNER JOIN
	store_mst sm
ON
	s.store_mst_id = sm.id
GROUP BY
	sm.id, sm.name
;

-- Q2
SELECT
	sm.name レンタル店舗名,
    c.name 顧客名,
    s.name DVDタイトル,
    TO_CHAR(rl.rent_date, 'YYYY MONTH DD DAY', 'NLS_DATE_LANGUAGE = ENGLISH') レンタル年月日
FROM
	rent_logs rl
INNER JOIN
	stocks s
ON
	rl.stock_id = s.id
INNER JOIN
	store_mst sm
ON
	s.store_mst_id = sm.id
INNER JOIN
	customers c
ON
	rl.customer_id = c.id
ORDER BY
	sm.id DESC,
    s.name ASC,
    rl.rent_date DESC
;