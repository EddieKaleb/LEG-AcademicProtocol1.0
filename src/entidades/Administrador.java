package entidades;

public class Administrador extends Usuario{
	private String login;
	private String senha;
	public static Usuario usuario;
	public Administrador(){
		
	}
	public Administrador(Usuario u){
	Administrador.usuario = u;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
