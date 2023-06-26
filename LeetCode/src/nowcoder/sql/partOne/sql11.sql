select device_id, gender, age, university, gpa
from user_profile
where gender = 'male'
  and gpa > 3.5;
