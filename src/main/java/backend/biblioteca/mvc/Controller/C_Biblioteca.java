package backend.biblioteca.mvc.Controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import backend.biblioteca.mvc.Model.M_Biblioteca;
import backend.biblioteca.mvc.Service.S_Biblioteca;

@Controller
public class C_Biblioteca{

    @GetMapping("/")
    public String getBiblioteca(){
    return "Home/home";
    }

    @PostMapping("/")
    public String postBiblioteca(@RequestParam("Titulo") String titulo,
                                 @RequestParam("anoPublicacao") int anoPublicacao,
                                 Model model){
                                    
    M_Biblioteca livro= S_Biblioteca.cadastrarLivro(titulo,anoPublicacao);

    model.addAttribute("titulo", livro.getTitulo());
    model.addAttribute("anoPublicacao", livro.getAnoPublicacao());

    return "Home/home";
                           
    }

}