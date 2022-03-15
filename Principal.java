public class Principal {
    public static void main(String[]args){
        Empregado empregado = new Empregado();
        empregado.setNome("Rosa Márcia");
        empregado.setEndereco("Pompeia");
        empregado.setTelefone(20222);
        empregado.setSalario(22.000);

        Empregado empregado2=new Empregado();
        empregado2.setNome("Emanuelle");
        empregado2.setEndereco("Pompeia");
        empregado2.setTelefone(2222);
        empregado2.setSalario(3000);

        //setar com os seus dados
        System.out.println(empregado.getNome());
        System.out.println(empregado.getEndereco());
        System.out.println(empregado.getTelefone());
        System.out.println(empregado.getSalario());

        System.out.println(empregado2.getNome());
        System.out.println(empregado2.getEndereco());
        System.out.println(empregado2.getTelefone());
        System.out.println(empregado2.getSalario());
    }
    
}
