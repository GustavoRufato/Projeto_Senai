package backend.biblioteca.mvc.Model;

import jakarta.persistence.*;

@Entity
@Table(name="livro")
public class M_Biblioteca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private int anoPublicacao;
   

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
}