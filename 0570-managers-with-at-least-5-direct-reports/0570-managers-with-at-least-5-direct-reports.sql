select  E.name as name from Employee E
where E.id IN(
select E.managerId
from Employee E
where E.managerId IS NOT NULL 
group by E.managerId
having count(E.managerId)>=5);