class Classes {
    // By convention, all class names start with a capital letter.

    public static void main(String[] args) {
        testCircle();
        testRectangle();
        testPoint2D();
        testTriangle();
        testSquare();
        testAccount();
        testAudio();
    }


    public static void doubleRadius(Circle c) {
        c.radius *= 2;
    }

    public static void testCircle() {
        // Creating an instance of a Circle...
        Circle c1 = new Circle();

        // Accessing its only field...
        c1.radius = 1;

        // Using methods...
        System.out.println(c1.area());
        System.out.println(c1.perimeter());


        // Instances of a class are objects,
        // so the corresponding variables are references.

        Circle c2 = c1; // c2 references the same Circle object as c1.
        c2.radius = 2;  // This assignment changes the only object in existence.

        System.out.println(c1.radius == 2); // c1 sees the change even though it was
                                            // c2 that was used to make the change.

        doubleRadius(c2); // During the function call the parameter of doubleRadius
                          // references the same Circle object as c1 and c2.

        System.out.println(c1.radius == 4); // c1 sees the change.


        // 'final' does *not* make the referenced object 'const'.
        final Circle c3 = c1;               // 'final' only prevents assignment to c3;
        c3.radius = 8;                      // it does *not* prevent assignment to c3.radius.

        System.out.println(c1.radius == 8); // c1 sees the change.


        // We can make arrays of Circles.
        Circle[] arrC = new Circle[] { new Circle(), null, new Circle() };
        System.out.print('\n');


        /*
          All Circle objects above were default constructed.
          Until we define a contructor of our own,
          JAVA provides a sensible default constructor.
          However, once we define our own constructor,
          JAVA no longer provides a default constructor, so
          uncommenting the constructor for the Circle class
          will create a compiler-time error for the code above.
        */
    }


    public static void testRectangle() {
        // We can overload constructors...
        Rectangle r1 = new Rectangle(2, 4);                       // (2 x 4) rectangle
        System.out.println("r1's area      is " + r1.area());
        System.out.println("r1's perimeter is " + r1.perimeter());

        Rectangle r2 = new Rectangle(6);                          // (6 x 6) rectangle
        System.out.println("r2's area      is " + r2.area());
        System.out.println("r2's perimeter is " + r2.perimeter());


        // and easily make more interesting arrays of Rectangles...
        Rectangle[] arrR = new Rectangle[] { new Rectangle(8), r1, null };


        // Remember, that arr[1] references the same object as r1...
        arrR[1].sideLength1 = 10;

        System.out.println("r1.sideLength1 is " + r1.sideLength1);
        System.out.println("r1's area      is " + r1.area());
        System.out.println("r1's perimeter is " + r1.perimeter());
        System.out.print('\n');
    }


    public static void testPoint2D() {
        // We cannot use the private constructor for Point2D
        // outside of the interface for Point2D.
        // Point2D p0 = new Point2D(0, 0); // compiler-time error


        // We have a default constructor
        // (which uses the 'this' keyword for
        // explicit constructor invocation).
        Point2D p1 = new Point2D();

        // Point2Ds are nicely printable
        // because of the toString method.
        System.out.println(p1);
        p1.x = 11;
        p1.y = 111;
        System.out.println(p1);


        // We have written a copy constructor.
        Point2D p2 = new Point2D(p1);

        // There are now two distinct Point2D objects.
        System.out.println(p1 + " " + p2);
        p2.x = 22;
        p2.y = 222;
        System.out.println(p1 + " " + p2);


        // We have useful factory methods...
        Point2D p3 = Point2D.fromXY(33, 333);
        System.out.println(p3);

        Point2D p4 = Point2D.fromPolar(Math.sqrt(32), Math.atan(1));
        System.out.println(p4);


        // ...which include another way of copying.
        Point2D p5 = Point2D.copy(p4);

        System.out.println(p4 + " " + p5);
        p5.x = 55;
        p5.y = 555;
        System.out.println(p4 + " " + p5);


        // We have a useful equals method.
        System.out.println(Point2D.fromXY(0, 0).equals(Point2D.fromXY(0, 0)));
        System.out.println(Point2D.fromXY(0, 0).equals(Point2D.fromXY(0, 1)));


        // We have a lengthTo method.
        System.out.println(Point2D.fromXY(0, 0).lengthTo(Point2D.fromXY(1, 1))); // sqrt(2)
        System.out.print('\n');
    }


    public static void testTriangle() {
        Point2D p1 = Point2D.fromXY(0, 1);
        Point2D p2 = Point2D.fromXY(1, 2);
        Point2D p3 = Point2D.fromXY(0, 3);

        Triangle t = new Triangle(p1, p2, p3);
        System.out.println(t.area());
        System.out.println(t.perimeter());    // 2 * (1 + sqrt(2))

        t.vertices[0].y = 0;
        System.out.println(p1);               // Hopefully, still (0.0, 1.0)
        System.out.print('\n');
    }


    public static void testSquare() {
        Square s = new Square(3);

        s.set(0, 0, 8); s.set(0, 1, 3); s.set(0, 2, 4);
        s.set(1, 0, 1); s.set(1, 1, 5); s.set(1, 2, 9);
        s.set(2, 0, 6); s.set(2, 1, 7); s.set(2, 2, 2);

        System.out.println(s);
        System.out.println(s.isMagic());      // incorrectly prints false
        System.out.print('\n');
    }


    public static void testAccount() {
        System.out.println("Account.bankMoney == " + Account.getBankMoney());

        // Michael creates an account with $88.
        Account michael = new Account(88);

        // The bank now has $88.
        System.out.println("Account.bankMoney == " + Account.getBankMoney());

        // Create a pause between the creation of the accounts.
        for (long i = 0; i < 10_000_000_000L; ++i) { i += 1;}

        // Lara creates an account with $31.
        Account lara = new Account(31);

        // The bank now has $(88 + 31).
        System.out.println("Account.bankMoney == " + Account.getBankMoney());

        // Instances can also use static methods,
        // although this is a little confusing and
        // Account.getBankMoney() is preferable.
        System.out.println("Account.bankMoney == " + michael.getBankMoney());
        System.out.println("Account.bankMoney == " +    lara.getBankMoney());
        System.out.print('\n');

        // We demonstrate the other member functions...
        System.out.println("  michael.balance == " + michael.getBalance());
        System.out.println("     lara.balance == " +    lara.getBalance());
        System.out.print('\n');


        // The bank makes $10 by investing its clients' money.
        Account.updateBankMoney(10);
        // michael.updateBankMoney(10); // would accomplish the same
        //    lara.updateBankMoney(10); // would accomplish the same

        System.out.println("Account.bankMoney == " + Account.getBankMoney());
        System.out.println("Account.bankMoney == " + michael.getBankMoney());
        System.out.println("Account.bankMoney == " +    lara.getBankMoney());
        System.out.print('\n');


        // Michael gifts $28 to Lara in cash.
        // First, Michael withdraws $28.
        michael.updateBalance(-28);
        System.out.println("Account.bankMoney == " + Account.getBankMoney());
        System.out.println("  michael.balance == " + michael.getBalance());
        System.out.println("     lara.balance == " +    lara.getBalance());
        System.out.print('\n');

        // When Lara receives the money, she deposits it.
        lara.updateBalance(28);
        System.out.println("Account.bankMoney == " + Account.getBankMoney());
        System.out.println("  michael.balance == " + michael.getBalance());
        System.out.println("     lara.balance == " +    lara.getBalance());
        System.out.print('\n');


        // We look at the times when the accounts were created.
        System.out.println(michael.getDateOfCreation());
        System.out.println(   lara.getDateOfCreation());
        System.out.print('\n');
    }


    public static void testAudio() {
        System.out.println(Audio.SAMPLE_RATE_CD);
        System.out.println(Audio.BIT_DEPTH_CD);

        double masterOfPuppetsBPM = 218;

        System.out.println(
            "By playing Master of Puppets on guitar through AxeFx, one generates "
            + Audio.samplesPerBeat(masterOfPuppetsBPM, Audio.SAMPLE_RATE_AXE_FX) +
            " samples per beat"
        );
    }
}
