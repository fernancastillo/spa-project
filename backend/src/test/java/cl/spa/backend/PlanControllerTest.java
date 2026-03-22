/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.spa.backend;

import cl.spa.backend.controller.PlanController;
import cl.spa.backend.model.Plan;
import cl.spa.backend.repository.PlanRepository;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


/**
 *
 * @author Fernando
 */
public class PlanControllerTest {
    @Test
    void testGetPlanes(){
        PlanRepository repository = Mockito.mock(PlanRepository.class);
        
        Plan plan1 = new Plan ("Plan 1", "Descripción 1", 10000.0);
        Plan plan2 = new Plan ("Plan 2", "Descripción 2", 20000.0);
        
        Mockito.when(repository.findAll()).thenReturn(List.of(plan1,plan2));
        
        PlanController controller = new PlanController(repository);
        
        List<Plan> resultado = controller.getPlanes();
        
        Assertions.assertEquals(2, resultado.size());
        Assertions.assertEquals("Plan 1", resultado.get(0).getNombre());
    }
    
}
