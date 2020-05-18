package com.hy.travel.service;

import com.hy.travel.model.Service;

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
 * @created 2020/4/12 16:47
 */
public interface ServiceService {
    /**
     * 找出全部问题
     * @return
     */
     List<Service> findAll();

    /**
     * 依据id查出答案
     * @param serid
     * @return
     */
     Service findAnswerBySerid(int serid);
}
