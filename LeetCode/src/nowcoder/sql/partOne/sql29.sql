SELECT COUNT(q2.device_id) / COUNT(q1.device_id) AS avg_ret
FROM (SELECT DISTINCT device_id, date FROM question_practice_detail) as q1
         LEFT JOIN
         (SELECT DISTINCT device_id, date FROM question_practice_detail) AS q2
         ON q1.device_id = q2.device_id AND q2.date = DATE_ADD(q1.date, interval 1 day)