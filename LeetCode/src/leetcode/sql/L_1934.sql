select a.user_id, round(sum(if(b.action = 'confirmed', 1, 0)) / count(1), 2) as 'confirmation_rate'
from Signups as a
         left join Confirmations as b on a.user_id = b.user_id
group by a.user_id