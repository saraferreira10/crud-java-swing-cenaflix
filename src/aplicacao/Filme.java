
package aplicacao;

import java.time.LocalDate;

public class Filme {
    private String nome;
    private LocalDate data;
    private String categoria;

    public Filme(String nome, LocalDate data, String categoria) {
        this.nome = nome;
        this.data = data;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
