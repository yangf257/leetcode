select concat(year(trans_date),'-', if(month(trans_date)<10,'0', ''), month(trans_date)) as 'month', country,
       count(id) as 'trans_count', sum(if(state = 'approved', 1, 0)) as 'approved_count', sum(amount) as 'trans_total_amount', sum(if(state = 'approved', amount, 0)) as 'approved_total_amount'
from Transactions
group by country, month (trans_date)