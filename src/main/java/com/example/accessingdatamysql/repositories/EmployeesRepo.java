package com.example.accessingdatamysql.repositories;

//import com.example.accessingdatamysql.dto.EmployeesCustomDTO;
import com.example.accessingdatamysql.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepo extends JpaRepository<Employees, Integer> {
//
//    @Query(value = "SELECT employees.eid,employees.first_name,employees.last_name,employees.jid,contracts.hours,contracts.type,credentials.is_admin " +
//            "FROM employees,credentials,contracts " +
//            "WHERE employees.eid = credentials.eid AND contracts.eid = employees.eid",nativeQuery = true)
//    List<EmployeesCustomDTO> getCustomErgazomenoi();

}