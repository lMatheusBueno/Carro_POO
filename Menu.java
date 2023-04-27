package trabalhoCarro;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<Carro> listaCarro = new ArrayList<Carro>(10);
    private String teste;
    private String validaModelo;
    private String validaCor;
    private String validaCombustivel;
    private String validaPotencia;
    private String adicionarCarro;


    public void imprimirMenu() {
        while(true) {
            Cor cor = new Cor();
            tipoCombustivel tc = new tipoCombustivel();
            Scanner scanner = new Scanner(System.in);



            System.out.println("=========Menu==========");
            System.out.println("Cadastrar Novo Carro-> (1);");
            System.out.println("Carros Cadastrados-> (2);");
            System.out.println("Encerrar -> (0);");
            System.out.println("Digite uma opção: ");
            System.out.println("=======================");
            int opcao = scanner.nextInt();



            if (opcao == 0) {
                System.out.println("Encerrando Sistema...");
                scanner.close();
                break;

            }

            if (opcao == 1) {
                Carro carro = new Carro();

                System.out.println("..............Cadastrando Novo Carro..............\n");
                while (true) {
                    System.out.println("Digite o modelo do carro: ");
                    validaModelo = scanner.next();
                    if (!validaModelo.matches("\\d+$")) {
                        carro.setModelo(validaModelo);
                        break;
                    } else {
                        System.out.println("O Modelo do carro não pode ser um numero! ");
                        System.out.println("Digite novamente...");
                    }
                }
                while (true) {
                    System.out.println("Digite a Potencia do carro: ");
                    validaPotencia = scanner.next();
                    if (validaPotencia.matches("\\d+$")) {
                        int convert_validaPotencia = Integer.parseInt(validaPotencia);
                        carro.setPotencia(convert_validaPotencia);
                        break;
                    } else {
                        System.out.println("informe a potencia: ");
                        System.out.println("Digite novamente...");
                    }
                }
                while (true) {
                    System.out.println("Digite o codigo da cor: ");
                    cor.listacores();
                    validaCor = scanner.next();

//                   *********** d+$ vaida se é uma string**********
                    if (validaCor.matches("\\d+$")) {
                        int convert_validaCor = Integer.parseInt(validaCor);
                        if (convert_validaCor >= 0 && convert_validaCor <= 6) {
                            carro.setCor(cor.getCor(convert_validaCor));
                            break;
                        } else {
                            System.out.println("Não existem cores associadas a este codigo...");
                            System.out.println("Informe novamente...");

                        }
                    } else {
                        System.out.println("informe o codigo da cor!ex: '1'=Amarelo. ");
                        System.out.println("Digite novamente...");
                    }
                }
                while (true) {
                    System.out.println("Digite o tipo de Combustível: ");
                    tc.listaTipo();
                    validaCombustivel = scanner.next();

                    if (validaCombustivel.matches("\\d+$")) {
                        int convert_validaCombustivel = Integer.parseInt(validaCombustivel);
                        if (convert_validaCombustivel >= 0 && convert_validaCombustivel <= 3) {
                            carro.settCombustivel(tc.getTCombustivel(convert_validaCombustivel));

                            break;
                        } else {
                            System.out.println("Não existem combustivies com esse codigo...");
                            System.out.println("Informe novamente...");

                        }
                    } else {
                        System.out.println("Digite o codigo do combustivel!ex: '0'=Gasolina. ");
                        System.out.println("Digite novamente...");
                    }
                }
                while (true) {
                    System.out.println("Deseja Gravar as informações do carro?");
                    System.out.println("'1' pra sim;");
                    System.out.println("'2' pra não;");
                    adicionarCarro = scanner.next();

                    if (adicionarCarro.matches("\\d+$")) {
                        int convert_adicionarCarro = Integer.parseInt(adicionarCarro);
                        if (convert_adicionarCarro == 1) {
                            System.out.println("Adicionando Carro...");
                            listaCarro.add(carro);
                            break;
                        } else if (convert_adicionarCarro == 2){
                            System.out.println("Carro não adicionado...");
                            break;
                        }
                    }else {
                        System.out.println("Para Adicionar Carro tecle '1'.");
                        System.out.println("Para não Adicionar e voltar ao menu tecle '2'.");
                    }

                }
            }

            if (opcao == 2 ) {
                System.out.println(" -------------Lista carros -------------");

                Iterator var9 = this.listaCarro.iterator();

                while(var9.hasNext()) {
                    Carro carrinho = (Carro)var9.next();
                    System.out.println("Modelo............: " + carrinho.getModelo());
                    System.out.println("Tipo de Combustível.........: " + carrinho.gettCombustivel());
                    System.out.println("Cor............: " + carrinho.getCor());
                    System.out.println("Potencia................: " + carrinho.getPotencia());
                    System.out.println("-----------------------------------------");
                }

            }
            if(opcao >=4 || opcao<=0){
                System.out.println("Erro! Opção invalida Tiberio kkk");
            }

        }

    }

}