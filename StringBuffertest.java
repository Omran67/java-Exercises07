package de.habelitz.uebung07;

/*
 * Programm StringBuffertest
 * Das Programm demonstriert die Verwendung von ver?nderlichen Strings mit StringBuffer.
 * @author Hans-Peter Habelitz
 * @date 2019-09-01
 */

public class StringBuffertest {
    public static void main(String[] args) {
        var puffer=new StringBuffer();
        System.out.println("Puffergr??e: " + puffer.capacity());
        System.out.println("L?nge des Pufferinhalts: " + puffer.length());
        System.out.println(puffer);
        puffer.append("Drei Chinesen");
        System.out.println("Puffergr??e: " + puffer.capacity());
        System.out.println("L?nge des Pufferinhalts: " + puffer.length());
        System.out.println(puffer);
        puffer.setCharAt(2, 'i');
        puffer.setCharAt(9, 'i');
        puffer.setCharAt(11, 'i');
        System.out.println(puffer);
        puffer.delete(0, puffer.length());
        System.out.println(puffer);
        System.out.println("Puffergr??e: " + puffer.capacity());
        System.out.println("L?nge des Pufferinhalts: " + puffer.length());
        puffer.append("Drei Chinesen");
        puffer.append(" mit dem Kontrabass");
        System.out.println(puffer);
        System.out.println("Puffergr??e: " + puffer.capacity());
        System.out.println("L?nge des Pufferinhalts: " + puffer.length());
    }
}
