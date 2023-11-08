select customer_id
from Customer a
inner join Product b
on a.product_key = b.product_key 
group by customer_id
having count(distinct a.product_key) = (select count(*) from Product);
