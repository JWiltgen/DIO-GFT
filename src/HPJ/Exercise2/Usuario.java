package HPJ.Exercise2;

abstract class Usuario 
{
    protected String nome;
    protected String email;
    protected String senha;

    protected boolean administrador;
    
    public Usuario (String nome, String email, String senha, boolean administrador)
    {

        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;

    }

    // Getters and setters for user fields
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    // Allows the user to change their password
    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
    }

    // Allows the user to update their personal data
    public void alterarDados(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
    }

    // Simulates user login and logoff
    public void realizarLogin() {
        System.out.println(nome + " fez login.");
    }

    public void realizarLogoff() {
        System.out.println(nome + " fez logoff.");
    }



}   
