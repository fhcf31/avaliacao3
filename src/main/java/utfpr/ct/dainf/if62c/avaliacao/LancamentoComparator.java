package utfpr.ct.dainf.if62c.avaliacao;
import java.util.Comparator;

/**
 * IF62C Fundamentos de Programação 2
 * Avaliação parcial.
 * @author 
 */
public class LancamentoComparator implements Comparator<Lancamento> {
    
    public int compare(Lancamento l1,Lancamento l2){
        return l1.getConta().compareTo(l2.getConta());
    }
}
