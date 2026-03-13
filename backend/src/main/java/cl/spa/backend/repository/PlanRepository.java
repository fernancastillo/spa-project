package cl.spa.backend.repository;

import cl.spa.backend.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Fernando
 */
public interface PlanRepository extends JpaRepository<Plan, Long>{
    
}
