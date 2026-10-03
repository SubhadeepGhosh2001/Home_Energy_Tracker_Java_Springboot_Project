package com.Subhadeep.alert_service.repository;

import com.Subhadeep.alert_service.entity.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository  extends JpaRepository<Alert, Long> {
}
