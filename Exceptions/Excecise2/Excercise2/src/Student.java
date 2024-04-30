class Student {
    private String name;

    public String getName() {
        if (this.name != null) {
            return name;
        } else {
            return "Invalid student name";
        }
    }

    public void setName(String newName) {
        // TODO: Delete line below and write your own solution.
        if (newName.matches("[A-Z][a-z]*$")) {
            this.name = newName;
        } else {
            throw new IllegalArgumentException();
        }
    }
}

class Demo {
    public static void main(String[] args) {
        for (String arg : args) {
            // TODO: Delete line below and write your own solution.
            Student student = new Student();
            try {
                student.setName(arg);
            } catch (IllegalArgumentException e){

            }
            finally {
                System.out.println(student.getName());
            }
        }
    }
}