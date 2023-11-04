# Write your MySQL query statement below
select s.student_id, s.student_name , u.subject_name , count(E.student_id) as attended_exams 
from Students s join Subjects u
left  join Examinations E
on s.student_id = E.student_id and u.subject_name = e.subject_name
group by s.student_id,u.subject_name
order by s.student_id, u.subject_name asc;