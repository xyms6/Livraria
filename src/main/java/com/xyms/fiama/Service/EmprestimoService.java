package com.xyms.fiama.Service;

import com.xyms.fiama.Model.EmprestimoModel;
import com.xyms.fiama.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    public EmprestimoModel registrarEmprestimo(EmprestimoModel emprestimo) {
        return emprestimoRepository.save(emprestimo);
    }

   
}
