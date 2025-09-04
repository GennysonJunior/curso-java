public class Livro {
    private String codigo;
    private String titulo;
    private String autor;
    private boolean disponivel;

    Livro(String codigo, String titulo, String autor) {
        setCodigo(codigo);
        setTitulo(titulo);
        setAutor(autor);
        this.disponivel = true;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void emprestar() {
        if (this.disponivel){
            this.disponivel = false;
        } else {
            System.out.println("Livro já emprestado!");
        }
    }

    public void devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
        } else {
            System.out.println("Livro Já devolvido!");
        }
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

}