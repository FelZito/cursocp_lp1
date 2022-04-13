import entidades.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Disciplinas> disciplina = new ArrayList<>();
        ArrayList<Disciplinas> matriculada = new ArrayList<>();
        ArrayList<Disciplinas> aprovadas = new ArrayList<>();
        Aluno aluno = new Aluno();
        String curso;
        String faculdade;
        boolean deferido;
        int resposta;
        float nota;
        int soma = 0;

        //Criando disciplinas
        //Primeiro período
        Disciplinas d1 = new Disciplinas("INTRODUÇÃO A COMPUTAÇÃO", "Segunda", "15h50", "DEIN0075", 90, "Vespertino", "Obrigatória");
        Disciplinas d2 = new Disciplinas("ALGORÍTMOS I", "Segunda", "14h00", "DEIN0076", 90, "Vespertino", "Obrigatória");
        Disciplinas d3 = new Disciplinas("CÁLCULO I", "Terça", "14h00", "DEMA0339", 90, "Vespertino", "Obrigatória");
        Disciplinas d4 = new Disciplinas("CÁLCULO VETORIAL", "Terça", "15h50", "DEMA0340", 60, "Vespertino", "Obrigatória");
        Disciplinas d5 = new Disciplinas("ÉTICA E CIDADANIA", "Quarta", "15h50", "DFIL0315", 60, "Vespertino", "Obrigatória");
        disciplina.add(d1);
        disciplina.add(d2);
        disciplina.add(d3);
        disciplina.add(d4);
        disciplina.add(d5);

        //Segundo periodo
        Disciplinas d6 = new Disciplinas("FÍSICA I", "Segunda", "14h00", "DEFI0254", 60, "DEMA0339", "Vespertino", "Obrigatória");
        Disciplinas d7 = new Disciplinas("LINGUAGEM DE PROGRAMAÇÃO I", "Segunda", "15h50", "DEIN0030", 60, "DEIN0076", "Vespertino", "Obrigatória");
        Disciplinas d8 = new Disciplinas("MATEMÁTICA DISCRETA E LÓGICA", "Terça", "14h00", "DEIN0078", 60, "Vespertino", "Obrigatória");
        Disciplinas d9 = new Disciplinas("CÁLCULO II", "Terça", "15h50",  	"DEMA0341", 90, "DEMA0339", "Vespertino", "Obrigatória");
        Disciplinas d10 = new Disciplinas("ÁLGEBRA LINEAR I", "Quinta", "15h50",  	"DEMA0342", 60, "DEMA0340", "Vespertino", "Obrigatória");
        disciplina.add(d6);
        disciplina.add(d7);
        disciplina.add(d8);
        disciplina.add(d9);
        disciplina.add(d10);

        //Terceiro periodo
        Disciplinas d11 = new Disciplinas("ANTROPOLOGIA", "Sexta", "14h00", "DSOC0055", 60, "Vespertino", "Opcional");
        Disciplinas d12 = new Disciplinas("SOCIOLOGIA", "Sexta", "15h50", "DSOC0313", 60, "Vespertino", "Opcional");
        Disciplinas d13 = new Disciplinas("FÍSICA III", "Segunda", "14h00", "DEFI0255", 60, "DEFI0254", "Vespertino", "Obrigatória");
        Disciplinas d14 = new Disciplinas("ARQUITETURA DE COMPUTADORES", "Segunda", "15h50",  	"DEIN0079", 60, "DEIN0078", "Vespertino", "Obrigatória");
        Disciplinas d15 = new Disciplinas("ESTRUTURA DE DADOS I", "Terça", "14h00","DEIN0080", 60, "DEIN0030", "Vespertino", "Obrigatória");
        Disciplinas d16 = new Disciplinas("LINGUAGEM DE PROGRAMAÇÃO II", "Terça", "15h50","DEIN0225", 60, "DEIN0076", "Vespertino", "Obrigatória");
        Disciplinas d17 = new Disciplinas("CÁLCULO III", "Quarta", "15h50","DEMA0338", 60, "DEMA0341", "Vespertino", "Obrigatória");
        disciplina.add(d11);
        disciplina.add(d12);
        disciplina.add(d13);
        disciplina.add(d14);
        disciplina.add(d15);
        disciplina.add(d16);
        disciplina.add(d17);

        //Cadastro de usuário
        System.out.println("===== Cadastro do aluno ===== ");
        System.out.println("Informe seu nome:");
        while (true)
            try {
                aluno.setNome(leitor.nextLine());
                // Verifica se o usuário informou um número neste campo
                if (!aluno.validaNome(aluno.getNome())){
                    System.out.println("Erro! Não é permitido números neste campo.");
                    System.out.println("Informe seu nome corretamente: ");
                }
                else {
                    break;
                }
            }catch (NumberFormatException e){
                System.out.println("Informe um valor válido: ");
                leitor.nextLine();
            }


        System.out.println("Informe seu curso: ");
        curso = leitor.nextLine();

        System.out.println("Informe sua instituição: ");
        faculdade = leitor.nextLine();

        Curso cursos = new Curso(curso, faculdade);

        System.out.println("Informe sua área de interesse: ");
        while (true)
            try {
                aluno.setArea(leitor.nextLine());
                // Verifica se o usuário informou um número neste campo
                if (!aluno.validaNome(aluno.getArea())){
                    System.out.println("Erro! Não é permitido números neste campo.");
                    System.out.println("Informe sua área corretamente: ");
                }
                else {
                    break;
                }
            }catch (NumberFormatException e){
                System.out.println("Informe um valor válido: ");
                leitor.nextLine();
            }

        soma += 1;
        System.out.println(aluno + String.valueOf(soma) + " ||" + "Curso:" + " " + cursos.getNome());
        int op = -1;
        while (true){
            System.out.println("===== Menu acadêmico - Computação"  + " " + cursos.getCursos() + " ===== \n" +
                    "1 - Realizar matricula \n" +
                    "2 - Listar matrículas realizadas \n" +
                    "3 - Inserir notas \n" +
                    "4 - Listar sequência aconselhada de disciplinas \n" +
                    "5 - Cadastrar disciplina \n" +
                    "6 - Finalizar período atual");
            System.out.print("Informe a opção desejada: ");
            //Checa se o usuário  informou um valor correto
            while (true) {
                try {
                    op = leitor.nextInt();
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Erro! Valor inválido!");
                    System.out.println("Informe uma opção válida: ");
                    leitor.nextLine();
                }
            }
            switch (op){
                case 1:
                    while (true){
                        //Lista todas as disciplinas disponíveis para realizar matrícula
                        for (Disciplinas d: disciplina){
                            System.out.println(String.valueOf(disciplina.indexOf(d) + 1) + " - " + d);
                        }
                        System.out.println("\n 0 - Sair");
                        System.out.println("Informe a disciplina que deseja matricular-se: ");

                        resposta = leitor.nextInt();

                        if (resposta > 0 && resposta <= disciplina.size()){
                            deferido = true;
                            for (Disciplinas d: disciplina){
                                if (disciplina.get(resposta - 1).getPrerequesitos().equals(d.getCodigo())){
                                    deferido = false;
                                }
                            }
                            for (Disciplinas d: matriculada){
                                if (disciplina.get(resposta -1).getPrerequesitos().equals(d.getCodigo())){
                                    deferido = false;
                                }
                            }
                            if (deferido){
                                matriculada.add(disciplina.get(resposta - 1));
                                disciplina.remove(resposta - 1);
                            }
                            else {
                                System.out.println("Erro! O pré-requesito desta disciplina não foi concluido!");
                            }
                            //if (disciplina.get(resposta - 1).getPrerequesitos(""))
                        }
                        else if (resposta == 0){
                            break;
                        }
                    }
                    break;

                case 2:
                    if (matriculada.size() == 0){
                        System.out.println("Você não está matriculado(a) em nenhuma disciplina");
                        break;
                    }
                    System.out.println("===== entidades.Disciplinas deferidas =====");
                    for (Disciplinas d: matriculada){
                        System.out.println(d);
                    }
                    break;

                case 3:
                    if (matriculada.size() == 0){
                        System.out.println("Você não está matriculado(a) em nenhuma disciplina!");
                        break;
                    }
                    while (true){
                        for (Disciplinas d: matriculada){
                            System.out.println(String.valueOf(matriculada.indexOf(d) + 1) + " - " + d +
                                               "\t[MÉDIA FINAL: " + d.getNota() + "]");
                        }
                        System.out.println("\n 0 - Sair");
                        System.out.println("Escolha uma disciplina para inserir notas: ");
                        //Checa se o usuário informou um valor válido

                        while (true) {
                            try {
                                resposta = leitor.nextInt();
                                if (resposta < 0 || resposta > matriculada.size()) {
                                    System.out.println("Erro! Valor inválido");
                                    System.out.println("Informe uma opção válida: ");
                                } else {
                                    break;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Erro! Valor inválido!");
                                System.out.println("Informe uma opção válida ");
                                leitor.nextLine();
                            }
                        }
                        if (resposta == 0){
                            break;
                        }
                        System.out.println("Insira a média para a disciplina " + matriculada.get(resposta - 1) + ":");
                        while (true) {
                            try {
                                nota = leitor.nextFloat();
                                if (nota < 0 || nota > 10) {
                                    System.out.println("Erro! Valor inválido");
                                    System.out.println("Informe uma média maior que 0 ou menor ou igual a 10: ");
                                } else {
                                    break;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Erro! Valor inválido!");
                                System.out.println("Informe uma nota maior que 0 ou menor ou igual a 10: ");
                                leitor.nextLine();
                            }
                        }

                        matriculada.get(resposta - 1).setNota(nota);
                    }
                    break;
                case 4:
                    System.out.println("===== Sequência aconselhada de disciplinas =====");
                    for (Disciplinas d: disciplina) {
                        deferido = true;
                        for (Disciplinas e : disciplina) {
                            if (d.getPrerequesitos().equals(e.getCodigo())) {
                                deferido = false;
                            }
                        }
                        for (Disciplinas e : matriculada) {
                            if (d.getPrerequesitos().equals(e.getCodigo())) {
                                deferido = false;
                            }
                        }
                        if (deferido){
                            System.out.println(d);
                        }
                    }

                    break;

                case 5:
                    Disciplinas nova = new Disciplinas();
                    System.out.println("===== Cadastro de disciplinas =====");
                    //Nome
                    System.out.println("Informe o nome da disciplina: ");
                    leitor.nextLine();
                    nova.setNome(leitor.nextLine());
                    //Dia na semana
                    while (true) {
                        System.out.println("Informe o dia dessa disciplina: \n" +
                                           "1 - Segunda || 2 - Terça || 3 - Quarta \n" +
                                           "4 - Quinta || 5 - Sexta");
                        System.out.println("Informe uma opção desejada: ");
                        op = leitor.nextInt();
                        if (op == 1){
                            nova.setDia("Segunda");
                            break;
                        }
                        else if (op == 2){
                            nova.setDia("Terça");
                            break;
                        }
                        else if (op == 3){
                            nova.setDia("Quarta");
                             break;
                        }
                        else if (op == 4){
                            nova.setDia("Quinta");
                            break;
                        }
                        else if (op == 5){
                            nova.setDia("Sexta");
                            break;
                        }
                        else {
                            System.out.println("Informe uma opção correta!");
                        }
                    }

                    //Código
                    System.out.println("Informe o código da disciplina: ");
                    leitor.nextLine();
                    nova.setCodigo(leitor.nextLine());

                    //Turno e horário
                    while (true){
                        System.out.println("Informe o turno da disciplina: \n" +
                                          "1 - Vespertino || 2 - Noturno");
                        op = leitor.nextInt();
                        if (op == 1){
                            nova.setTurno("Vespertino");
                            while (true) {
                                System.out.println("Informe o horário: \n" +
                                        "1 - 14h00 || 2 - 15h50 || 3 - 17h40");
                                System.out.println("Informe a opção desejada: ");
                                op = leitor.nextInt();
                                if (op == 1) {
                                    nova.setHorario("14h00");
                                    break;
                                } else if (op == 2) {
                                    nova.setHorario("15h50");
                                    break;
                                } else if (op == 3) {
                                    nova.setHorario("17h40");
                                    break;
                                } else {
                                    System.out.println("Informe uma opção válida!");
                                }
                            }
                            break;
                        }
                        else if (op == 2){
                            nova.setTurno("Noturno");
                            nova.setHorario("19h20");
                            System.out.println("Horário cadastrado: 19h20");
                            break;
                        }
                        else {
                            System.out.println("Informe uma opção válida!");
                        }
                    }

                    //Tipo
                    while (true){
                        System.out.println("Informe o tipo dessa disciplina: \n" +
                                           "1 - Obrigatória || 2 - Opcional");
                        System.out.println("Informe a opção desejada: ");
                        op = leitor.nextInt();
                        if (op == 1){
                            nova.setTipo("Obrigatória");
                            break;
                        }
                        else if (op == 2){
                            nova.setTipo("Opcional");
                            break;
                        }
                        else {
                            System.out.println("Informe uma opção válida!");
                        }
                    }

                    //Pré-requesito
                    while (true){
                        System.out.println("Essa disciplina possui um pré-requesito? \n" +
                                           "1 - Sim || 2 - Não");
                        System.out.println("Informe a opção desejada: ");
                        op = leitor.nextInt();
                        if (op == 1){
                            System.out.println("Informe o seu pré-requesito: ");
                            leitor.nextLine();
                            nova.setPrerequesitos(leitor.nextLine());
                            break;
                        }
                        else if (op == 2){
                            System.out.println("Ok! Não possui pré-requesitos");
                            break;
                        }
                        else {
                            System.out.println("Informe uma opção válida!");

                        }
                    }
                    disciplina.add(nova);
                    break;
                case 6:
                    //Checa se o usuário está cadastrado em alguma disciplina
                    if (matriculada.size() == 0){
                        System.out.println("Você não está matriculado(a) em nenhuma disciplina!");
                        break;
                    }
                    for (Disciplinas d: matriculada){
                        System.out.println(String.valueOf(matriculada.indexOf(d) + 1) + " - " + d +
                                "\t[MÉDIA FINAL: " + d.getNota() + "]");
                    }
                    while (true) {
                        System.out.println("Deseja finalizar perído? \n" +
                                "1 - Sim || 2 - Não");
                        op = leitor.nextInt();
                        if (op == 1) {
                            for (Disciplinas d : matriculada) {
                                if (d.getNota() >= 7) {
                                    aprovadas.add(d);
                                } else {
                                    disciplina.add(d);
                                }
                            }
                            matriculada.clear();
                            break;
                        } else if (op == 2) {
                            break;
                        } else {
                            System.out.println("Informe uma opção válida: ");
                        }
                    }
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
            }
        }
    }
}
