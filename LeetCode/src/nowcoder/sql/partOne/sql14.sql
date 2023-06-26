select device_id, gender, age, university, gpa
from user_profile
where (university = '山东大学' and gpa > 3.5)
   or (university = '复旦大学' and gpa > 3.8);