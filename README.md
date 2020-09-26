#without @DynamicUpdate
Hibernate: 
    update
        student 
    set
        creation_date_time=?, --Extra field also updated which not required to update without @DynamicUpdate
        name=?,
        update_date_time=? 
    where
        id=?
#with @DynamicUpdate it will generate update operation for entity class.   
Hibernate: 
    update
        student 
    set
        name=?,
        update_date_time=? 
    where
        id=?   
#  @CreationTimestamp and @UpdateTimestamp:-
  @UpdateTimestamp field execute every update operation whereas @CreationTimestamp execute only once.         