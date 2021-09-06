package org.ron.c128.intro;

public class InnerClasses {

    private String schoolName = "Hogwarts";

    public static void main(String[] args) {
        System.out.println("hi");
        InnerClasses innerClasses = new InnerClasses();
        innerClasses.doSomething();

//        Course c128 = new Course("m3-c128", "Severus Snape"); // compile error
//        Course c1 = innerClasses.new Course("", ""); // very, very rare
    }

    public Course doSomething() {

        // very rare
        class Class {
            public final String id;
            public final String instructor;
            public Class(String id, String instructor) {
                this.id = id;
                this.instructor = instructor;
            }
        }

        Course c128 = new Course("m3-c128", "Severus Snape");
        c128.enroll("Harry");
        c128.enroll("Hermione");
        System.out.println("instructor for course " + c128.id + " is: " + c128.instructor);

        Enrollable c129 = new Enrollable() {
            public boolean enroll(String studentId) {
                return true;
            }
        };
        c129.enroll("Luna");

        return c128;
    }

    private interface Enrollable {
        boolean enroll(String studentId);
    }

    private class Course implements Enrollable {
        public final String id;
        public final String instructor;

        public Course(String id, String instructor) {
            this.id = id;
            this.instructor = instructor;
        }

        public boolean enroll(String studentId) {
            return false;
        }
    }

    public static class Lecturer {
        private String name;

        public Lecturer(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
