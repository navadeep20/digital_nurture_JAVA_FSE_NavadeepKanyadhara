package com.cognizant.di;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        if (id == 101) {
            return "Navadeep";
        }

        return "Customer Not Found";
    }

}