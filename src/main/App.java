package main;

import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ
        System.out.println("--EJERCICIO 1 (INSERTAR EN UN ARBOL)--");
        InsertBST ejercicio1 = new InsertBST();
        ejercicio1.insertEnv(5);
        ejercicio1.insertEnv(3);
        ejercicio1.insertEnv(7);
        ejercicio1.insertEnv(2);
        ejercicio1.insertEnv(4);
        ejercicio1.insertEnv(6);
        ejercicio1.insertEnv(8);
        ejercicio1.printTree();
        System.out.println();
        System.out.println("--EJERCICIO 2 (INVERTIR EN UN ARBOL)--");
        InvertBinaryTree invertirArbol = new InvertBinaryTree();
        invertirArbol.insertEnv(4);
        invertirArbol.insertEnv(2);
        invertirArbol.insertEnv(7);
        invertirArbol.insertEnv(1);
        invertirArbol.insertEnv(3);
        invertirArbol.insertEnv(6);
        invertirArbol.insertEnv(9);
        System.out.println("ARBOL ORIGINAL");
        invertirArbol.printTree();
        System.out.println("ARBOL ESPEJO");
        invertirArbol.invertTreeEnv();
        invertirArbol.printTree();
        System.out.println();
        System.out.println("--EJERCICIO 3 (MOSTRAR UN ARBOL POR NIVELES)--");
        ListLevels listL = new ListLevels();
        listL.insertEnv(4);
        listL.insertEnv(2);
        listL.insertEnv(7);
        listL.insertEnv(1);
        listL.insertEnv(3);
        listL.insertEnv(6);
        listL.insertEnv(9);
        System.out.println("ARBOL ORIGINAL");
        listL.printTree();
        System.out.println("ARBOL POR NIVELES");
        listL.listLevelsEnv();
        System.out.println();
        System.out.println();
        System.out.println("--EJERCICIO 4 (MOSTAR LA LONGUITUD MAS LARGA DE UN ARBOL)--");
        Depth depth = new Depth();
        depth.insertEnv(4);
        depth.insertEnv(2);
        depth.insertEnv(7);
        depth.insertEnv(1);
        depth.insertEnv(3);
        depth.insertEnv(8);
        System.out.println("ARBOL ORIGINAL");
        depth.printTree();
        System.out.println("LA PROFUNDIDAD MAXIMA DEL ARBOL ES: "+depth.maxDepthEnv());
        System.out.println();
        
    }

}
