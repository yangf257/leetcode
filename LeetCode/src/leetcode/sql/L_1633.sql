select distinct a.contest_id, round(count(a.user_id) / count(distinct b.user_id) * 100, 2) as 'percentage'
from Register a
         left join Users b on a.user_id = b.user_id
group by a.contest_id
order by percentage desc;