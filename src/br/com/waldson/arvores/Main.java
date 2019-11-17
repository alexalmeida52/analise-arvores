package br.com.waldson.arvores;

import br.com.waldson.arvores.abb.BinarySearchTree;
import br.com.waldson.arvores.avl.*;
import br.com.waldson.arvores.misc.*;



public class Main {

    public static void main(String[] args) {
        // Análise empírica da AVL
        AVLTree<Pessoa> tree = new AVLTree<>();

        System.out.println("Parte 1");
        // Adicionando 500.000 elementos em ordem crescente na AVL
        long startAdd = System.currentTimeMillis();
        for(int i = 0; i < 500_000; i++)
            tree.insert(new Pessoa(i));

        long elapsedAdd = System.currentTimeMillis() - startAdd;
        System.out.printf("A inserção em ordem crescente na AVL demorou %.4f minutos\n", (double) elapsedAdd/60000);

        // Buscando 500.000 elementos em ordem decrescente
        long startSearch = System.currentTimeMillis();
        for(int i = 499_999; i >= 0; i--)
            tree.search(i);

        long elapsedSearch = System.currentTimeMillis() - startSearch;
        System.out.printf("A busca em ordem decrescente na AVL demorou %.4f minutos\n", (double) elapsedSearch/60000);

        // Removendo 500.000 elementos em ordem decrescente
        long startRemove = System.currentTimeMillis();
        for(int i = 499_999; i >= 0; i--)
            tree.remove(i);
        long elapsedRemove = System.currentTimeMillis() - startRemove;
        System.out.printf("A remoção em ordem decrescente na AVL demorou %.4f minutos\n", (double) elapsedRemove/60000);

        // 2ª parte
        System.out.println("\nParte 2");
        // Adicionando 500.000 elementos aleatoriamente na AVL
        long startAddRandom = System.currentTimeMillis();
        for(int i = 0; i < 500_000; i++)
            tree.insert(new Pessoa((int)(Math.random() * ((1000000 - 1) + 1)) + 1));
        long elapsedAddRandom = System.currentTimeMillis() - startAddRandom;
        System.out.printf("A inserção aleatória na AVL demorou %.4f minutos\n", (double) elapsedAddRandom/60000);

        // Buscando 1.000.000 elementos em ordem decrescente
        long startSearch2 = System.currentTimeMillis();
        for(int i = 999_999; i >= 0; i--)
            tree.search(i+1);
        long elapsedSearch2 = System.currentTimeMillis() - startSearch2;
        System.out.printf("A busca2 em ordem decrescente na AVL demorou %.4f minutos\n", (double) elapsedSearch2/60000);

        // Removendo 1.000.000 elementos em ordem decrescente
        long startRemove2 = System.currentTimeMillis();
        for(int i = 999_999; i >= 0; i--)
            tree.remove(i+1);
        long elapsedRemove2 = System.currentTimeMillis() - startRemove2;
        System.out.printf("A remoção2 em ordem decrescente na AVL demorou %.4f minutos\n", (double) elapsedRemove2/60000);

        //####################################### FIM DA ANÁLISE DA AVL #############################################################


        // Análise empírica da Árvore de Busca Binária
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        BinarySearchTree binarySearchTree2 = new BinarySearchTree();

        // 1ª parte
        // Adicionando 500.000 elementos em ordem crescente na ABB
        long startAddABB = System.currentTimeMillis();
        for(int i = 0; i < 500_000; i++)
            binarySearchTree.insert(i);
        long elapsedAddABB = System.currentTimeMillis() - startAddABB;
        System.out.printf("A inserção em ordem crescente na ABB demorou %.4f minutos\n", (double) elapsedAddABB/60000);

        // Buscando 500.000 elementos em ordem decrescente na ABB
        long startSearchABB = System.currentTimeMillis();
        for(int i = 499_999; i >= 0; i--)
            binarySearchTree.search(i);
        long elapsedSearchABB = System.currentTimeMillis() - startSearchABB;
        System.out.printf("A busca em ordem decrescente na ABB demorou %.4f minutos\n", (double) elapsedSearchABB/60000);

        // Removendo 500.000 elementos em ordem decrescente na ABB
        long startRemoveABB = System.currentTimeMillis();
        for(int i = 499_999; i >= 0; i--)
            binarySearchTree.remove(i);
        long elapsedRemoveABB = System.currentTimeMillis() - startRemoveABB;
        System.out.printf("A remoção em ordem decrescente na ABB demorou %.4f minutos\n", (double) elapsedRemoveABB/60000);

         // 2ª parte
         // Adicionando 500.000 elementos aleatoriamente na ABB
        long startRandomABB = System.currentTimeMillis();
        for(int i = 0; i < 500_000; i++)
            binarySearchTree2.insert((int)(Math.random() * ((1000000 - 1) + 1)) + 1);
        long elapsedRandomABB = System.currentTimeMillis() - startRandomABB;
        System.out.printf("A inserção aleatória na ABB demorou %.4f minutos\n", (double) elapsedRandomABB/60000);

        // Buscando 1_000.000 de elementos em ordem decrescente na ABB
        long startSearchABB2 = System.currentTimeMillis();
        for(int i = 999_999; i >= 0; i--)
            binarySearchTree2.search(i);
        long elapsedSearchABB2 = System.currentTimeMillis() - startSearchABB2;
        System.out.printf("A busca2 em ordem decrescente na ABB demorou %.4f minutos\n", (double) elapsedSearchABB2/60000);

        // Removendo 1.000.000 elementos em ordem decrescente na ABB
        long startRemoveABB2 = System.currentTimeMillis();
        for(int i = 999_999; i >= 0; i--)
            binarySearchTree2.remove(i);
        long elapsedRemoveABB2 = System.currentTimeMillis() - startRemoveABB2;
        System.out.printf("A remoção2 em ordem decrescente na ABB demorou %.4f minutos\n", (double) elapsedRemoveABB2/60000);

    }
}

