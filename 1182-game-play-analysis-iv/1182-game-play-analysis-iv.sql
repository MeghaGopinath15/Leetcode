select round(count(distinct a.player_id)/(select count(distinct player_id) from Activity),2) fraction
from Activity a inner join Activity b
on date_add(a.event_date,interval 1 day) = b.event_date and a.player_id = b.player_id
where (a.player_id,a.event_date) IN
(select player_id,min(event_date) from Activity group by player_id); 