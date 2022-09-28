package mariaoliveira.repositories;

import org.springframework.data.repository.CrudRepository;

import mariaoliveira.models.Aluno;

public interface AlunosRepository extends CrudRepository<Aluno, Integer> {
    
}