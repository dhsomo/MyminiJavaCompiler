/*** line 8: qualification of reference that is not a class instance
 * COMP 520
 * Identification
 */
class fail68 { 	
    public static void main(String[] args) {
        int c = 4;
        c = c.foo;
    }

    int foo;
}

