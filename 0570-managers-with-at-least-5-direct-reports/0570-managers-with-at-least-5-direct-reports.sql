/*select  E.name as name from Employee E
where E.id IN(
select E.managerId
from Employee E
where E.managerId IS NOT NULL 
group by E.managerId
having count(E.managerId)>=5); */

select E.name from Employee E
join Employee M
on E.id = M.managerId
group by M.managerId
having count(*) >=5;