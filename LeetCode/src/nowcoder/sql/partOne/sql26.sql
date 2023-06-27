SELECT CASE
           WHEN age < 25
               OR age IS NULL THEN '25岁以下'
           WHEN age >= 25 THEN '25岁及以上'
           END  age_cut,
       COUNT(*) number
FROM user_profile
GROUP BY age_cut
