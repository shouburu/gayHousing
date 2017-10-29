package gay.housing.service;

import gay.housing.dao.GenericDao;
import gay.housing.dao.UsersDao;
import gay.housing.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl extends GenericServiceImpl<Users,Integer> implements UsersService {

    private UsersDao usersDao;
    public UsersServiceImpl(){

    }
    @Autowired
    public UsersServiceImpl(@Qualifier("usersDaoImpl") GenericDao<Users, Integer> genericDao) {
        super(genericDao);
        this.usersDao = (UsersDao) genericDao;
    }
}
