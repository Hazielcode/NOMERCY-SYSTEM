package com.tecsup.hospital.aspect;

import com.tecsup.hospital.model.Auditoria;
import com.tecsup.hospital.repository.AuditoriaRepository;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Autowired
    private AuditoriaRepository repo;

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    // Intercepta crear, actualizar, eliminar (CRUD)
    @After("execution(* com.tecsup.hospital.controller.*Controller.crear*(..)) || " +
            "execution(* com.tecsup.hospital.controller.*Controller.actualizar*(..)) || " +
            "execution(* com.tecsup.hospital.controller.*Controller.eliminar*(..))")
    public void auditar(JoinPoint joinPoint) {
        String clase = joinPoint.getTarget().getClass().getSimpleName();
        String metodo = joinPoint.getSignature().getName();

        // Log en consola
        logger.info("📋 [AOP] Acción ejecutada → {} en {}", metodo, clase);

        // Guardar en MongoDB
        repo.save(new Auditoria(clase, metodo));
    }
}
