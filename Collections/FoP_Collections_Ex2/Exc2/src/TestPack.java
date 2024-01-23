//

import java.util.*;
//import jdk.incubator.vector.VectorOperators;

class TestPack implements Comparable<TestPack>{
    private final int id;
    private final Result result;

    public TestPack(int id, Result result) {
        this.id = id;
        this.result = result;
    }

    public int compareTo(TestPack testpack)
    {
        int sumOfGradesOwn = this.getResult().getGrade1() + this.getResult().getGrade2();
        int sumOfGradesComparable =  testpack.getResult().getGrade1() + testpack.getResult().getGrade2();
        return sumOfGradesOwn - sumOfGradesComparable;
    }

    public TestPack(String csvLine) {
        String[] parts = csvLine.split(";", 2);
        this.id = Integer.parseInt(parts[0]);
        this.result = new Result(parts[1]);
    }

    public int getId() {
        return id;
    }

    public Result getResult() {
        return result;
    }

    @Override
    public String toString() {
        int sumOfGrades = this.result.getGrade1() + this.result.getGrade2();
        return id + ";" + this.result.getGrade1() + ";" + this.result.getGrade2() + ";" + sumOfGrades;
    }
}

class Result {
    private final int grade1;
    private final int grade2;

    public Result(int grade1, int grade2) {
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public Result(String csvLine) {
        String[] parts = csvLine.split(";");
        this.grade1 = Integer.parseInt(parts[0]);
        this.grade2 = Integer.parseInt(parts[1]);
    }

    public int getGrade1() {
        return grade1;
    }

    public int getGrade2() {
        return grade2;
    }
}

class Register {
    //define 2 fields
    private final List<TestPack> listOfTestPacks;
    private boolean isSorted;

    public Register(String line) {
        //put your code here
        this.listOfTestPacks = new ArrayList<>();
        String[] parts = line.split(" ");
        for (String part : parts){
            TestPack testPack = new TestPack(part);
            listOfTestPacks.add(testPack);
        }
        this.isSorted = false;
    }

    public int size() {
        //put your code here
        return listOfTestPacks.size();
    }

    public TestPack get(int index) {
        //put your code here
        if (index >=0 && index < listOfTestPacks.size()){
            return  listOfTestPacks.get(index);
        } else {
            return null;
        }
    }

    public void insert(int index, TestPack testPack) {
        //put your code here
        if (index >= 0 && index < listOfTestPacks.size()){
            listOfTestPacks.add(index,testPack);
        }
        if (index < 0){
            listOfTestPacks.add(0,testPack);
        }
        if (index >= listOfTestPacks.size()){
            listOfTestPacks.add(listOfTestPacks.size(),testPack);
        }
        this.isSorted = false;
    }

    public boolean removeRange(int from, int to) {
        //put your code here
        if (from >= 0 && to <= listOfTestPacks.size()) {
            if (from < to){
                listOfTestPacks.subList(from, to).clear();
                this.isSorted = false;
                return true;
            }
        }
        return false;
    }

    public void sort() {
        //put your code here
        listOfTestPacks.sort(TestPack::compareTo);
        this.isSorted = true;
    }

    public int binarySearch(TestPack testPack) {
        //put your code here
        this.sort();
        return Collections.binarySearch(listOfTestPacks,testPack);
    }

    @Override
    public String toString() {
        //put your code here
        return listOfTestPacks.toString();
    }
}

class Main {

    static {
        //some hidden verification code here

    }

    public static void main(String[] args) {
        //test Comparable<TestPack>
        TestPack somePack = new TestPack("100;35;54");
        TestPack somePackEqualled = new TestPack("50;30;59");
        assertTrue(somePack.compareTo(new TestPack("100;30;70")) < 0, "somePack is less than the argument");
        assertTrue(somePack.compareTo(somePackEqualled) == 0, "somePack is equal to the argument");
        assertTrue(somePack.compareTo(new TestPack("100;35;53")) > 0, "somePack is greater than the argument");

        Random rand = new Random();
        try (Scanner sc = new Scanner(System.in)) {
            String line = sc.nextLine();
            Register register = new Register(line);
            //test get, size
            assertTrue(register.get(-1) == null, "no instance with id=-1");
            assertTrue(register.get(register.size()) == null, "no instance with id=" + register.size());
            assertTrue(register.get(register.size() + 1) == null, "no instance with id=" + (register.size() + 1));
            //test insert, get, size
            int index = -10 + rand.nextInt(10);
            register.insert(index, somePack);
            assertTrue(register.get(0).getId() == 100, "an instance with id=100 had to be inserted at index=0");
            index = register.size() + rand.nextInt(10);
            register.insert(index, new TestPack("101;5;20"));
            assertTrue(register.get(register.size() - 1).getId() == 101,
                    "an instance with id=101 had to be inserted at index=" + (register.size() - 1));
            index = rand.nextInt(register.size());
            register.insert(index, new TestPack("102;75;30"));
            assertTrue(register.get(index).getId() == 102,
                    "an instance with id=102 had to be inserted at index=" + index);

            testKeepTrackOrdering();

            //test sort, binarySearch
            assertTrue(register.binarySearch(somePackEqualled) >= 0,
                    "there is an element in the register equalled to somePackEqualled");
            TestPack fakePack = new TestPack("100500;100500;100500");
            assertTrue(register.binarySearch(fakePack) == (-register.size() - 1),
                    "if fakePack were in the register, its index would be " + (-register.size() - 1));
            testBinarySearchAdditional();
            //test remove
            assertTrue(!register.removeRange(0, 0), String.format("no way to remove a sublist from %d to %d", 0, 0));
            assertTrue(!register.removeRange(1, 0), String.format("no way to remove a sublist from %d to %d", 1, 0));
            assertTrue(!register.removeRange(-1, 1), String.format("no way to remove a sublist from %d to %d", -1, 1));
            int curSize = register.size();
            assertTrue(!register.removeRange(1, curSize + 1),
                    String.format("no way to remove a sublist from %d to %d", 1, curSize + 1));
            //curSize is sure to be greater than 3
            assertTrue(register.removeRange(1, 3),
                    String.format("it's possible to remove a sublist from %d to %d", 1, 3));
            assertTrue(register.size() == curSize - 2,
                    String.format("register size after removing a sublist from %d to %d is %d", 1, 3, curSize - 2));
            assertTrue(register.removeRange(0, 1),
                    String.format("it's possible to remove a sublist from %d to %d", 0, 1));
            assertTrue(register.size() == curSize - 3,
                    String.format("register size after removing a sublist from %d to %d is %d", 0, 1, curSize - 3));
            curSize -= 3;
            if (curSize > 2) {
                assertTrue(register.removeRange(curSize - 2, curSize),
                        String.format("it's possible to remove a sublist from %d to %d", curSize - 2, curSize));
                assertTrue(register.size() == curSize - 2,
                        String.format("register size after removing a sublist from %d to %d is %d", curSize - 2, curSize, curSize - 2));
            }
            System.out.println(register);
        }
    }

    private static void assertTrue(boolean actual, String description) {
        if (!actual) {
            System.out.println("Actually, " + description);
            System.exit(-1);
        }
    }

    private static void testBinarySearchAdditional() {
        Register register2 = new Register("1;100;50 2;10;10");
        int index = register2.binarySearch(new TestPack("1;100;50"));
        assertTrue(index == 1,
                "you need to sort a collection in advance to do binary search");
    }

    private static void testKeepTrackOrdering() {
        Register register2 = new Register("1;90;90 2;15;15");
        assertTrue(register2.get(0).compareTo(register2.get(1)) > 0,
                "you need to have a collection unsorted just after creation");
        register2.sort();
        register2.insert(0, new TestPack("3;100;100"));
        assertTrue(register2.get(0).compareTo(register2.get(1)) > 0,
                "you need to have a collection unsorted after inserting an element");
    }
}