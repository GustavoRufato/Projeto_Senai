package backend.biblioteca.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import backend.biblioteca.mvc.Service.S_Cadastro;
import backend.biblioteca.mvc.Model.M_Cadastro;


@Controller
public class C_Cadastro{

    @GetMapping("/cadastro")
    public String getCadastro(){
        return "Cadastro/cadastro";
    }

    @PostMapping("/cadastro")
    public String postCadastro(@RequestParam String nomeCompleto,
                                        @RequestParam String userName,
                                        @RequestParam String dataNascimento,
                                        @RequestParam String cpf,
                                        @RequestParam String email,
                                        @RequestParam String senha,
                                        Model model) {
        
        M_Cadastro usuario = S_Cadastro.cadastrarUsuario(nomeCompleto,userName,cpf,dataNascimento,email,senha);
        
        return "Login/login";
    }
    
}