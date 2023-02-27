-- Q1
select 
    sm_name
    ,sum(stock_wise)
from
    (select 
        sm.name as sm_name
        ,s.price as s_price
        ,count(l.stock_id)*s.price as stock_wise
    from rent_logs l 
    inner join stocks s on l.stock_id = s.id
    inner join store_mst sm on s.store_mst_id = sm.id
    group by sm.name, l.stock_id, s.price
    order by sm.name asc)
group by sm_name

-- Q2
alter table store_mst add(ruby varchar2(45));
update store_mst
set ruby = "しんじゅく"
where id = 1;

update store_mst
set ruby = "しぶや"
where id = 2;

update store_mst
set ruby = "いけぶくろ"
where id = 3;

select  
    ms.name as レンタル店舗名
    ,c.name as 顧客名
    ,s.name as DVDタイトル
    ,to_char(l.rent_date,'YYYY Month DD Day','nls_date_language=''AMERICAN''') as レンタル年月日
from rent_logs l
inner join customers c on l.customer_id = c.id
inner join stocks s on l.stock_id = s.id 
inner join store_mst ms on s.store_mst_id = ms.id
order by ms.ruby asc , s.name asc, l.rent_date desc;
