
import java.util.*;


public class App {
  
    public static void main(String[] args) throws Exception {

      abstract class Empregado implements Comparable <Empregado> {
        private String nome; 
        private int salario; 
    
        public Empregado(String nome, int salario) {
          this.setNome(nome); 
          this.setSalario(salario); 
        }
    
        public int compareTo (Empregado e) { 
          if (this.salario < e.salario) 
            return- 1;
          else if (this.salario > e.salario) 
            return 1; 
          else 
            return 0; 
        }
      }
        Empregado emp1 = new Empregado("Jose", 130);
        Empregado emp2 = new Empregado("Ana", 110);
        Empregado emp3 = new Empregado("Jose", 130);

        Collection<Empregado> c = new TreeSet<Empregado>(); 

        Iterator<Empregado> i = c.iterator(); 

        while(i.hasNext()) { 
          Empregado e = i.next();
          System.out.println(e.getNome() + " " + e.getSalario());
        }
    }
}
