package com.blogs.dashboard.repository;

import com.blogs.dashboard.model.dashboardModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dashboardRepository extends JpaRepository<dashboardModel,Integer> {
}
