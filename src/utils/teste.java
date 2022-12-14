package utils;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class teste {

    static Boolean grupoValido(List<String> grupo, List<List<String>> duplas){

        List<List<String>> ciclo1 = new ArrayList<>();
        List<List<String>> ciclo2 = new ArrayList<>();

        ciclo1 = (List<List<String>>) Arrays.asList(
                Arrays.asList("Laura", "Pedro", "João", "Vinicius"),
                Arrays.asList("Carlos", "Maria", "Leonardo", "Ana"),
                Arrays.asList("Daniela", "Marcos", "Wesley", "Luiza"),
                Arrays.asList("Daiane", "Felipe", "Teodoro", "Helena"),
                Arrays.asList("Natalia", "Beatriz", "Eduardo", "Caio")
        );
        ciclo2 = (List<List<String>>) Arrays.asList(
                Arrays.asList("Teodoro", "Daiane", "Luiza"),
                Arrays.asList("Carlos", "João", "Helena"),
                Arrays.asList("Daniela", "Pedro", "Caio"),
                Arrays.asList("Leonardo", "Maria", "Laura"),
                Arrays.asList("Beatriz", "Marcos", "Vinicius"),
                Arrays.asList("Natalia", "Felipe", "Eduardo"),
                Arrays.asList("Ana", "Wesley"));

        for(List<String> c1 : ciclo1){
            int contador = 0;
            for(String aluno : c1){
                if(grupo.contains(aluno)){
                    contador++;
                }
            }
            if(contador >= 2){
                return false;
            }
        }

        for(List<String> c2 : ciclo2){
            int contador = 0;
            for(String aluno : c2){
                if(grupo.contains(aluno)){
                    contador++;
                }
            }
            if(contador >= 2){
                return false;
            }
        }

        for(List<String> dupla : duplas){
            if(dupla.contains(grupo.get(0)) && dupla.contains(grupo.get(1))){
                return false;
            }
        }


        return true;
    }

    static List<List<List<String>>> formarEquipes(List<List<String>> duplas, List<List<List<String>>> equipes){

        List<List<List<String>>> novas_equipes = new ArrayList<>();

        for(List<List<String>> equipe : equipes){

            for(List<String> dupla : duplas){
                if(compararListas(equipe, dupla, novas_equipes)){
                    List<List<String>> novaEquipe = new ArrayList<>();
                    novaEquipe.addAll(equipe.stream().toList());
                    novaEquipe.add(dupla);
                    novas_equipes.add(novaEquipe);
                }
            }
        }
        return novas_equipes;
    }

    static Boolean compararListas(List<List<String>> equipe, List<String> dupla, List<List<List<String>>> v_equipes){

        for(List<String> e : equipe){
            for(String d: dupla){
                if(e.contains(d)){
                    return false;
                }
            }
        }

        int size_equipe = equipe.size();

        for(List<List<String>> v_equipe : v_equipes){

            int contador_duplas_iguais = 0;

            for(List<String> v_dupla : v_equipe){

                for(List<String> dupla_nova_equipe : equipe){
                    if(dupla_nova_equipe.contains(v_dupla.get(0)) && dupla_nova_equipe.contains(v_dupla.get(1))){
                        contador_duplas_iguais++;
                    }
                }
            }
            if(contador_duplas_iguais == size_equipe){
                return false;
            }
        }

        return true;
    }


    static String decodificar(String palavraCodificada, Integer numberOfRow){

        Integer size = (palavraCodificada.length()/numberOfRow) + 1;
        String palavra = "";
        for(int i = 0; i < palavraCodificada.length(); i++) {
            for (int j = 0; j < numberOfRow; j++) {
                if (i + (size * j) == palavraCodificada.length()) {
                    palavra += palavraCodificada.substring(i + (size * j), i + (size * j));
                    return palavra.replace("_", " ");
                } else {
                    palavra += palavraCodificada.substring(i + (size * j), i + (size * j) + 1);
                }
            }

        }
        return palavra;
    }

    public static void main(String[] args) {

//        List<String> alunos = new ArrayList<>();
//        alunos.addAll(Arrays.asList("Laura", "Pedro", "João", "Vinicius", "Carlos", "Maria", "Leonardo", "Ana",
//                "Daniela", "Marcos", "Wesley", "Luiza", "Daiane", "Felipe", "Teodoro", "Helena",
//                "Natalia", "Beatriz", "Eduardo", "Caio"));
//
//
//        List<List<String>> duplas = new ArrayList<>();
//        List<List<List<String>>> equipes = new ArrayList<>();
//
//        // Encontrando todas as duplas possíveis
//        for(String primeiro : alunos){
//            for(String segundo: alunos){
//
//                List<String> novaDupla = new ArrayList<>();
//                novaDupla.addAll(Arrays.asList(primeiro, segundo));
//
//                if(primeiro != segundo && grupoValido(novaDupla,duplas)){
//                    duplas.add(novaDupla);
//                }
//            }
//        }
//        //System.out.println(duplas);
//        for(List<String> dupla : duplas){
//            List<List<String>> novaEquipe = new ArrayList<>();
//            novaEquipe.add(dupla);
//            equipes.add(novaEquipe);
//        }
//
//        for(int i = 0; i < 2; i++){
//            equipes = formarEquipes(duplas, equipes);
//        }
//
//        for(List<List<String>> equipe : equipes){
//            System.out.println(equipe);
//        }
        Integer numberOfRow = 3;
        String palavra_codificada = "mnes__ya_____mi";

        numberOfRow = 2;
        palavra_codificada = "hlowrd_el_ol";

//        Integer size = (palavra_codificada.length()/numberOfRow) + 1;
//        String palavra = "";
//        for(int i = 0; i < palavra_codificada.length(); i++) {
//            for (int j = 0; j < numberOfRow; j++) {
//                if (i + (size * j) == palavra_codificada.length()) {
//                    palavra += palavra_codificada.substring(i + (size * j), i + (size * j));
//                    System.out.println(palavra.replace("_", " "));
//                    return;
//                } else {
//                    palavra += palavra_codificada.substring(i + (size * j), i + (size * j) + 1);
//                }
//            }
//
//        }

        System.out.println(decodificar(palavra_codificada, numberOfRow));

    }
}
