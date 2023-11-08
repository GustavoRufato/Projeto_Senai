package backend.biblioteca.mvc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import backend.biblioteca.mvc.Model.M_Biblioteca;

@Repository
public interface R_Biblioteca extends JpaRepository<M_Biblioteca,Long>{
    @Query(value = "SELECT * FROM livro", nativeQuery = true)
    M_Biblioteca findLivro(@Param("titulo") String titulo, @Param("ano") int ano);
}

