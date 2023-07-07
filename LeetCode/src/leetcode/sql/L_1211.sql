select query_name,
       round(sum(rating / position) / count(result), 2) as 'quality', round(sum(if(rating < 3, 1, 0)) / count(result) * 100,2) as 'poor_query_percentage'
from Queries
group by query_name