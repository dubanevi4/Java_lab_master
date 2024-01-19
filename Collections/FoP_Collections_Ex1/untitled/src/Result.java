import java.util.*;

class Result {
    private int grade1;
    private int grade2;

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

class TestPack implements Comparable<TestPack> {
    private int id;
    private Result result;

    public TestPack(int id, Result result) {
        this.id = id;
        this.result = result;
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
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TestPack other = (TestPack) obj;
        return id == other.id;
    }

    @Override
    public int compareTo(TestPack testPack) {
        return id - testPack.id;
    }

}

class Solution {

    private Solution() { }

    public static List<TestPack> createList(String str) {
        //put your code here
        List<TestPack> testPacks = new ArrayList<>();
        String[] parts = str.split(" ");
        for (String part : parts){
            TestPack testPack = new TestPack(part);
            testPacks.add(testPack);
        }
        return testPacks;
    }

    public static Set<TestPack> createSet(String str) {
        //put your code here
        Set<TestPack> testPacks = new HashSet<>();
        String[] parts = str.split(" ");
        for (String part : parts){
            TestPack testPack = new TestPack(part);
            testPacks.add(testPack);
        }
        return testPacks;
    }

    public static SortedSet<TestPack> createSortedSet(String str) {
        //put your code here
        SortedSet<TestPack> testPacks = new TreeSet<>();
        String[] parts = str.split(" ");
        for (String part : parts){
            TestPack testPack = new TestPack(part);
            testPacks.add(testPack);
        }
        return testPacks;
    }

    public static Queue<TestPack> createQueue(String str) {
        //put your code here
        Queue<TestPack> testPacks = new LinkedList<>();
        String[] parts = str.split(" ");
        for (String part : parts){
            TestPack testPack = new TestPack(part);
            testPacks.add(testPack);
        }
        return testPacks;
    }

    public static Queue<TestPack> createStack(String str) {
        //put your code here
        Queue<TestPack> testPacks  = Collections.asLifoQueue(new LinkedList<>());
        String[] parts = str.split(" ");
        for (String part : parts){
            TestPack testPack = new TestPack(part);
            testPacks.add(testPack);
        }
        return testPacks;
    }

    public static Map<Integer, Result> createMap(String str) {
        //put your code here
        HashMap<Integer, Result> testPacks = new HashMap<>();
        String[] parts = str.split(" ");
        for (String part : parts){
            TestPack testPack = new TestPack(part);
            testPacks.put(testPack.getId(),testPack.getResult());
        }
        return testPacks;
    }

    public static SortedMap<Integer, Result> createSortedMap(String str) {
        //put your code here
        SortedMap<Integer, Result> testPacks = new TreeMap<>();
        String[] parts = str.split(" ");
        for (String part : parts){
            TestPack testPack = new TestPack(part);
            testPacks.put(testPack.getId(),testPack.getResult());
        }
        return testPacks;
    }

}

class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String line = sc.nextLine();
            TestPack fake = new TestPack("-1;0;0");

            List < TestPack > list = Solution.createList(line);
            Random rand = new Random();
            int k = rand.nextInt(list.size());
            TestPack tp = list.get(k);
            int index = list.indexOf(tp);
            boolean isListOk = tp.getId() == list.get(index).getId() &&
                    list.indexOf(fake) == -1;

            Set < TestPack > set = Solution.createSet(line);
            boolean isSetOk = set.contains(tp) &&
                    !set.contains(fake);

            SortedSet < TestPack > sortedSet = Solution.createSortedSet(line);
            boolean isSortedSetOk = sortedSet.size() > 1 ?
                    sortedSet.first().getId() < sortedSet.last().getId() : true;

            Queue < TestPack > queue = Solution.createQueue(line);
            boolean isQueueOk = list.get(0).equals(queue.peek());

            Queue < TestPack > stack = Solution.createStack(line);
            boolean isStackOk = list.get(list.size() - 1).equals(stack.peek());

            Map < Integer, Result > map = Solution.createMap(line);
            boolean isMapOk = map.containsKey(tp.getId()) &&
                    !map.containsKey(fake.getId());

            System.out.printf("%d %b %d %b %d %b %d %b %d %b  %d %b",
                    list.size(), isListOk, set.size(), isSetOk, sortedSet.size(), isSortedSetOk, queue.size(),
                    isQueueOk, stack.size(), isStackOk, map.size(), isMapOk);

//            for(TestPack testPack: map)
//                System.out.printf("%n%d:%d/%d", testPack.getId(), testPack.getResult().getGrade1(),
//                        testPack.getResult().getGrade2(), map.size(), isMapOk);
        }
    }
}

