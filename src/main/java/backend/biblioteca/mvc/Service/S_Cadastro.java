package backend.biblioteca.mvc.Service;

import org.springframework.stereotype.Service;
import backend.biblioteca.mvc.Model.M_Cadastro;
import backend.biblioteca.mvc.Repository.R_Cadastro;

@Service
public class S_Cadastro {
     R_Cadastro r_cadastro;

     public S_Cadastro(R_Cadastro r_cadastro){
        this.r_cadastro=r_cadastro;
     }

    public static M_Cadastro cadastrarUsuario(String nomeCompleto, String userName, String cpf,
                                            String dataNascimento, String email, String senha){

        M_Cadastro m_cadastro = new M_Cadastro();

        m_cadastro.setNomeCompleto(nomeCompleto);
        m_cadastro.setUserName(userName);
        m_cadastro.setCpf(cpf);
        m_cadastro.setDataNascimento(dataNascimento);
        m_cadastro.setEmail(email);
        m_cadastro.setSenha(senha);

        return m_cadastro;

}
}