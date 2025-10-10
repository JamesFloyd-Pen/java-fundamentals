/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pathfinderTTRPG;

import java.util.Scanner;

/**
 *
 * @author Legop
 */
public class ACChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to ACchecker: Please enter ATTACK ROLL and enemy Armor Class");

        int attack_roll = scan.nextInt();
        int armor_class = scan.nextInt();

        boolean result = armorClassChecker(attack_roll, armor_class);
        if(result){
            System.out.println("Your attack lands a hit!");
        } else {
            System.out.println("MISS!");
        }



    }

    static boolean armorClassChecker(int attack_roll, int armor_class){
        return attack_roll >= armor_class;
    }

    



}
