select customer_id, count(customer_id) as 'count_no_trans'
from Visits a
         left join Transactions b on a.visit_id = b.visit_id
where amount is null
group by customer_id