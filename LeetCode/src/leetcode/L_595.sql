-- 这张表的每一行提供：国家名称、所属大陆、面积、人口和 GDP 值。
--面积至少为 300 万平方公里（即，3000000 km2），或者
--人口至少为 2500 万（即 25000000）
select name, population, area
from World
where area >= 3000000
   or population >= 25000000;