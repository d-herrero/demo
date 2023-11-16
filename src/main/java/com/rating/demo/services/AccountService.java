package com.rating.demo.services;

import com.rating.demo.beans.Account;

public interface AccountService
{
    public Account createAuthor(Account author);
    public Account updateAccount(Long id, Account account);
    public void deleteAccount(Long id);
}
