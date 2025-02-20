package com.xyms.fiama.Controller;

import com.xyms.fiama.Model.EmprestimoModel;
import com.xyms.fiama.Service.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {

    @Autowired
    private EmprestimoService emprestimoService;

    @PostMapping
    public EmprestimoModel registrarEmprestimo(@RequestBody EmprestimoModel emprestimo) {
        return emprestimoService.registrarEmprestimo(emprestimo);
    }

    
}
