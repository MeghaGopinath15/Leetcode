# Write your MySQL query statement below

(select a.name as results
from Users a
join MovieRating b
on a.user_id = b.user_id     
group by a.name
order by count(b.movie_id) desc,a.name asc
limit 1)

Union all

(select title as results
from MovieRating 
join Movies 
on Movies.movie_id = MovieRating.movie_id    
where month(created_at)=2 and year(created_at)=2020
group by Movies.title
order by avg(MovieRating.rating) desc, Movies.title asc
limit 1);