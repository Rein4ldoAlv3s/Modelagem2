package com.reinaldo;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.reinaldo.domain.Funcionario;
import com.reinaldo.domain.Telefone;
import com.reinaldo.repositories.FuncionarioRepository;
import com.reinaldo.repositories.TelefoneRepository;

@SpringBootApplication
public class ProjetoFuncionarioTelefoneApplication implements CommandLineRunner{
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoFuncionarioTelefoneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
				
		Funcionario f1 = new Funcionario(null, "Reinaldo", "05948885712", "2020/12/12");
		Funcionario f2 = new Funcionario(null, "João", "04829958234", "2020/12/12");
		
		Telefone t1 = new Telefone(null, "995730262", "Claro");
		Telefone t2 = new Telefone(null, "32952891", "Oi");
		Telefone t3 = new Telefone(null, "998391044", "Tim");		
		
		f1.getTelefones().addAll(Arrays.asList(t1, t2));
		f2.getTelefones().addAll(Arrays.asList(t3));
		
		t1.getFuncionarios().addAll(Arrays.asList(f1));
		t2.getFuncionarios().addAll(Arrays.asList(f1));
		t3.getFuncionarios().addAll(Arrays.asList(f2));
		
		funcionarioRepository.saveAll(Arrays.asList(f1, f2));
		telefoneRepository.saveAll(Arrays.asList(t1, t2, t3));
		
				
	}

}
