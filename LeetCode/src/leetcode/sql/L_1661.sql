select distinct a.machine_id,
                round((sum(if(b.activity_type = 'end', b.timestamp, 0)) -
                       sum(if(a.activity_type = 'start', a.timestamp, 0))) / count(distinct a.process_id),
                      3) as 'processing_time'
from Activity a
         left join Activity b on a.machine_id = b.machine_id
    and a.process_id = b.process_id
    and a.activity_type = 'start'
    and b.activity_type = 'end'
group by machine_id;