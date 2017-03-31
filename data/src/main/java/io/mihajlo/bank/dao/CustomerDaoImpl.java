package io.mihajlo.bank.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by mihajlo on 11/19/16.
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public String getCustomer(int id) {
        return "Mihajlo Jovanovic";
    }
}
