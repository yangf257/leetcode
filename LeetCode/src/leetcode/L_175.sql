--组合两个表
select FirstName as 'firstName', LastName as 'lastName', City as 'city', State as 'state'
from Person
         left join Address
                   on Person.PersonId = Address.PersonId;
