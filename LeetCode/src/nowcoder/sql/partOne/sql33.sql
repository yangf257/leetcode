select device_id, university, gpa
from user_profile
where (university, gpa) in (select university, min(gpa) from user_profile group by university)
order by university