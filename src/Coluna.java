public class Coluna {
    String nome;
    String tipo;
    Boolean notNull = Boolean.FALSE;
    Boolean auto_increment = Boolean.FALSE;

    public Coluna(String nome, String tipo, Boolean notNull, Boolean auto_increment) {
        this.nome = nome;
        this.tipo = tipo;
        this.notNull = notNull;
        this.auto_increment = auto_increment;
    }

    public Coluna(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getNotNull() {
        return notNull;
    }

    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    public Boolean getAuto_increment() {
        return auto_increment;
    }

    public void setAuto_increment(Boolean auto_increment) {
        this.auto_increment = auto_increment;
    }
}
