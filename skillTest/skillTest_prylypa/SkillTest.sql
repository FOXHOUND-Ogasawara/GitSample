-- Q-1
SELECT SM.`name` as 店舗, SUM(S.`price`) as 売り上げ合計
FROM `rent_logs`R 
INNER JOIN `stocks` S ON R.`stock_id` = S.`id`
INNER JOIN `store_mst` SM ON S.`store_mst_id` = SM.`id` 
GROUP BY SM.`name`

-- Q-2
SELECT SM.`name` as レンタル店舗名,C.`name` as 客様名, S.`name` as DVDタイトル , date_format(R.`rent_date`, '%Y %M %d %W')  as レンタル年月日
FROM `rent_logs` R 
INNER JOIN `stocks` S ON R.`stock_id` = S.`id`
INNER JOIN `store_mst` SM ON S.`store_mst_id` = SM.`id` 
INNER JOIN `customers` C ON R.`customer_id` = C.`id`
ORDER BY レンタル店舗名 DESC, DVDタイトル ASC, レンタル年月日 DESC
