package com.amdocs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdocs.entity.Route;
public interface RouteRepositary extends JpaRepository<Route, Long>{

}
