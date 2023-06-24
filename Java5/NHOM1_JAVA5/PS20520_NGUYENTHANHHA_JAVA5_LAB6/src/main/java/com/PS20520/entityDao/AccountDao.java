package com.PS20520.entityDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PS20520.entity.Account;

public interface AccountDao extends JpaRepository<Account, String> {

}
