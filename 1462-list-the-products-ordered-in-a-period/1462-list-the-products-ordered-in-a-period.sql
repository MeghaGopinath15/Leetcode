# Write your MySQL query statement below

select product_name,sum(unit) as unit
from Products  a
join Orders b
on a.product_id  = b.product_id  
where month(b.order_date) = 2 and year(b.order_date) = 2020
group by b.product_id  
having sum(unit) >=100

