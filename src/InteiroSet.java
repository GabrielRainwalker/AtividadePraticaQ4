public class InteiroSet {
    private boolean[] conj;

    public InteiroSet() {
        conj = new boolean[101];
    }

    public InteiroSet union(InteiroSet auxConj) {
        InteiroSet uniao = new InteiroSet();
        for (int i = 0; i < conj.length; i++) {
            uniao.conj[i] = this.conj[i] || auxConj.conj[i];
        }
        return uniao;
    }

    public InteiroSet inter(InteiroSet auxConj) {
        InteiroSet inter = new InteiroSet();
        for (int i = 0; i < conj.length; i++) {
            inter.conj[i] = this.conj[i] && auxConj.conj[i];
        }
        return inter;
    }

    public void inserirElemento(int valor) {
        if (valor >= 0 && valor <= 101) {
            conj[valor] = true;
        }
    }

    public void removerElemento(int valor) {
        if (valor >= 0 && valor <= 101) {
            conj[valor] = false;
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        boolean vazio = true;
        for (int i = 0; i < conj.length; i++) {
            if (conj[i]) {
                str.append(" ");
                vazio = false;
            }
        }
        if (vazio) {
            return "-";
        }
        return str.toString().trim();
    }

    public boolean EhIgualTo(InteiroSet auxConj) {
        for (int i = 0; i < conj.length; i++) {
            if (conj[i] != auxConj.conj[i]) {
                return false;
            }
        }
        return true;
    }
}