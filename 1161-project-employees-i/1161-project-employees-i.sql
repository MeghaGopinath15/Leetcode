# Write your MySQL query statement below
select p.project_id,round(avg(E.experience_years),2) as average_years
from Project p join Employee E
on p.employee_id = E.employee_id
group by project_id;