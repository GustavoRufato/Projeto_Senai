package backend.biblioteca.mvc.Service;

import org.springframework.stereotype.Service;

import backend.biblioteca.mvc.Model.M_Biblioteca;
import backend.biblioteca.mvc.Repository.R_Biblioteca;

@Service
public class S_Biblioteca {
    R_Biblioteca r_biblioteca;
   
   public S_Biblioteca(R_Biblioteca r_Biblioteca){
        this.r_biblioteca=r_Biblioteca;
   }

   public static M_Biblioteca cadastrarLivro(String titulo, int ano){
    M_Biblioteca m_biblioteca= new M_Biblioteca();
    m_biblioteca.setTitulo(titulo);
    m_biblioteca.setAnoPublicacao(ano);
    return m_biblioteca;

   }
}
