# Write your MySQL query statement below
select p.firstName,p.lastName,a.city,a.State
from Person p
left join Address a
ON p.personId=a.personId;