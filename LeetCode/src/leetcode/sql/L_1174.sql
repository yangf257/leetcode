select round(count(order_date) * 100 / (select count(1)
                                        from (select min(order_date) as 'order_date'
                                              from Delivery
                                              group by customer_id) as b), 2) as 'immediate_percentage'
from (select delivery_id, customer_id, min(order_date) as 'order_date', customer_pref_delivery_date
      from Delivery
      group by customer_id) as a
where order_date = customer_pref_delivery_date