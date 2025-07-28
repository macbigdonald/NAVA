
// TODO :

// DRIVER

package game;

import game.engine.GameLoop;

/**
 * {@code Driver} class.
 */
public class Driver
{
    // ------------------ ABSTRACT ------------------
    // ------------------ DEFAULT -------------------
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------
    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------

    /**
     * Main method.
     */
    public static void main(String[] args)
    {
        GameLoop gameLoop = new GameLoop();
        gameLoop.run();
    }
}