select substr(profile, 12, 2) as 'age',count(profile) as 'number'
from user_submit
group by substr(profile, 12, 2);