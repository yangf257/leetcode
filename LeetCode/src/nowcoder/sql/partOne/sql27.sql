select device_id,
       gender,
       case
           when age >= 25 then '25岁及以上'
           when age >= 20 and age <= 24 then '20-24岁'
           when age < 20 then '20岁以下'
           when age is null then '其他'
           end as age_cnt
from user_profile;