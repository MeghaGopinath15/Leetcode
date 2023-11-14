# Write your MySQL query statement below

with cte as( 
select reports_to,count(employee_id) as reports_count,round(avg(age),0) as  average_age
from Employees
where reports_to is not null
group by reports_to )

select c.reports_to as employee_id,e.name,c.reports_count,c.average_age 
from Employees E  
right join cte c
on E.employee_id=c.reports_to
order by E.employee_id;