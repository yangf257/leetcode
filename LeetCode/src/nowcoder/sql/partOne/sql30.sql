select substring(profile, 15) as 'gender', count(profile)
from user_submit
group by substring(profile, 15);