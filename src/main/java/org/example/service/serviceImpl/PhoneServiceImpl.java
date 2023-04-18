package org.example.service.serviceImpl;

import org.example.dao.PhoneDao;
import org.example.dao.daoImpl.PhoneDaoImpl;
import org.example.model.Phone;
import org.example.service.PhoneService;

import java.util.List;

public class PhoneServiceImpl implements PhoneService {

    PhoneDao phoneDao = new PhoneDaoImpl();

    @Override
    public void createPhoneTable() {
        phoneDao.createPhoneTable();
    }

    @Override
    public void savePhone(Phone phone) {

    }

    @Override
    public void updatePhone(Long id, Phone phone) {

    }

    @Override
    public List<Phone> getAllUserPhone(Long userId) {
        return null;
    }

    @Override
    public List<Phone> getAllUserSortedUserPhone(Long userId, String ascOrDesc) {
        return null;
    }

    @Override
    public Phone getYoungerUserPhone() {
        return null;
    }

    @Override
    public Phone getPhoneById(Long id) {
        return null;
    }

    @Override
    public void deletePhoneById(Long id) {

    }
}
