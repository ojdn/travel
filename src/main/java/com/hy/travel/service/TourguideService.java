package com.hy.travel.service;

import com.hy.travel.model.Tourguide;

import java.util.List;

/**
 * Title:com.hy.travel.service
 * Description: 描述【
 * <p>
 * 】
 * Copyright: Copyright (c) 2019
 * Company: 太原工业学院
 *
 * @author hanyang
 * @version 1.0
 * @created 2020/4/13 11:45
 */
public interface TourguideService {

     List<Tourguide> findAll();

     Tourguide findTourguideByid(int tid);
}
