package com.springboot.watertank.controller;

import org.springframework.data.repository.CrudRepository;



public interface WaterRepository extends CrudRepository <UseWater,Integer> {

}
