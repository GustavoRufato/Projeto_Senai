package backend.biblioteca.mvc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import backend.biblioteca.mvc.Model.M_Cadastro;

@Repository
public interface R_Cadastro extends JpaRepository<M_Cadastro,Long>{
@Query(value = "SELECT * FROM usuario", nativeQuery = true)
M_Cadastro findUser(@Param ("nomeCompleto") String nomeCompleto, 
                    @Param ("userName") String userName,
                    @Param ("cpf") String cpf,
                    @Param ("dataNascimento") String dataNascimento,
                    @Param ("email") String email,
                    @Param ("senha") String senha);
    
}