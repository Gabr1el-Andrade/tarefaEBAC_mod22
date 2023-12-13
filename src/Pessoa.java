public class Pessoa {

    public String Nome;
    public String Sexo;

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
public Pessoa(String Nome, String Sexo){
        this.Nome = Nome;
        this.Sexo = Sexo;


}
}
