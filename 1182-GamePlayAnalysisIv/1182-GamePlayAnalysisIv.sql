-- Last updated: 7/9/2026, 3:07:49 PM
select round(count(distinct a1.player_id)/(select count(distinct player_id) from Activity),2)
as fraction
from Activity a1
where a1.event_date=
    date_add((select min(a2.event_date) from activity a2
    where a2.player_id=a1.player_id),interval 1 day);