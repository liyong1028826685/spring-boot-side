package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CityDao;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 城市业务逻辑实现类
 * <p>
 * Created by mongoding on 02/05/2017.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Transactional
    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

}
