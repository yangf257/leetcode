select round(count(event_date) / (select count(distinct player_id) from Activity), 2) as 'fraction'
from Activity
where (player_id, event_date) in (select player_id, date_add(min(event_date), interval 1 day) as 'event_date'
                                  from Activity
                                  group by player_id)