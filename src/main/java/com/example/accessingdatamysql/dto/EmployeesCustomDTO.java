//package com.example.accessingdatamysql.dto;
//
//import com.example.accessingdatamysql.model.Contracts;
//import com.example.accessingdatamysql.model.Credentials;
//import com.example.accessingdatamysql.model.Employees;
//
//import javax.persistence.ColumnResult;
//import javax.persistence.ConstructorResult;
//import javax.persistence.NamedNativeQuery;
//import javax.persistence.SqlResultSetMapping;
//
//@NamedNativeQuery(name="findAllCustomEmployees",
//        query="SELECT employees.eid,employees.first_name,employees.last_name,employees.jid,contracts.hours,contracts.type,credentials.is_admin " +
//                "FROM employees,credentials,contracts " +
//                "WHERE employees.eid = credentials.eid AND contracts.eid = employees.eid",
//        resultSetMapping = "employee-details")
//@SqlResultSetMapping(name="employee-details",
//classes = {
//        @ConstructorResult(targetClass = Employees.class,columns = {
//                @ColumnResult(name="eid",type=Integer.class),
//                @ColumnResult(name="first_name",type=String.class),
//                @ColumnResult(name="last_name",type=String.class),
//                @ColumnResult(name="jid",type=String.class)
//        }),@ConstructorResult(targetClass = Contracts.class,columns = {
//                @ColumnResult(name="hours",type=Integer.class),
//                @ColumnResult(name="type",type=String.class),
//        }),@ConstructorResult(targetClass = Credentials.class,columns = {
//                @ColumnResult(name = "is_admin",type=Byte.class)
//})
//})
//public class EmployeesCustomDTO {
//    private int eid;
//    private String first_name;
//    private String last_name;
//    private String jid;
//    private int hours;
//    private String type;
//    private byte is_admin;
//
//    public EmployeesCustomDTO() {
//    }
//
//    public EmployeesCustomDTO(int eid, String first_name, String last_name, String jid, int hours, String type, byte is_admin) {
//        this.eid = eid;
//        this.first_name = first_name;
//        this.last_name = last_name;
//        this.jid = jid;
//        this.hours = hours;
//        this.type = type;
//        this.is_admin = is_admin;
//    }
//
//
//    public int getEid() {
//        return eid;
//    }
//
//    public void setEid(int eid) {
//        this.eid = eid;
//    }
//
//    public String getFirst_name() {
//        return first_name;
//    }
//
//    public void setFirst_name(String first_name) {
//        this.first_name = first_name;
//    }
//
//    public String getLast_name() {
//        return last_name;
//    }
//
//    public void setLast_name(String last_name) {
//        this.last_name = last_name;
//    }
//
//    public String getJob_name() {
//        return jid;
//    }
//
//    public void setJob_name(String job_name) {
//        this.jid = job_name;
//    }
//
//    public int getHours() {
//        return hours;
//    }
//
//    public void setHours(int hours) {
//        this.hours = hours;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public byte getIs_admin() {
//        return is_admin;
//    }
//
//    public void setIs_admin(byte is_admin) {
//        this.is_admin = is_admin;
//    }
//
//    public EmployeesCustomDTO convertToDTO(Employees employees, Credentials credentials, Contracts contracts){
//        EmployeesCustomDTO employeesCustomDTO = new EmployeesCustomDTO();
//        employeesCustomDTO.setEid(employees.getEid());
//        employeesCustomDTO.setFirst_name(employees.getFirst_name());
//        employeesCustomDTO.setLast_name(employees.getLast_name());
//        employeesCustomDTO.setJob_name(String.valueOf(employees.getJid())); // TODO: 19/12/2020 check if correct
//        employeesCustomDTO.setType(contracts.getType());
//        employeesCustomDTO.setHours(contracts.getHours());
//        employeesCustomDTO.setIs_admin(credentials.getIs_admin());
//
//        return employeesCustomDTO;
//    }
//}
