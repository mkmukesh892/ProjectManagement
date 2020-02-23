package com.rwp.pma.services;

import com.rwp.pma.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    //field injector
//    @Autowired
//    EmployeeRepository employeeRepository;

//    @Autowired
//    @Qualifier("IStaffRepositoryImp1")
    IStaffRepository iStaffRepository;
    //constructor injector
//    public EmployeeService(@Qualifier("IStaffRepositoryImp1") IStaffRepository iStaffRepository) {
//        this.iStaffRepository = iStaffRepository;
//    }

    //setter injector
    @Autowired
    @Qualifier("IStaffRepositoryImp1")
    public void setEmployeeRepository1(IStaffRepository iStaffRepository) {
        this.iStaffRepository = iStaffRepository;
    }
}
