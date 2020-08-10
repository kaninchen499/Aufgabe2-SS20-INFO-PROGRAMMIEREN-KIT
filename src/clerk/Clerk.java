package clerk;

import utils.Time;

public class Clerk {

//######################################### Attributes ###########################################
    protected String firstName;

    protected String lastName;

    protected Time birthday;

    protected Post post;

    protected int ID;

    protected Time[][] workingTime;

    private static int id = 1;

//########################################### Enum ##############################################

    public enum Post {
        normalWorker("A"),nightWorker("N"), PM("P"), nightPM("NP");
        private String type;

        Post(String type) {
            this.type = type;
        }

        public String getType() {
            return this.type;
        }

        public int getIndex() {
            switch (type) {
                case "A": return 0;
                case "N": return 1;
                case "P": return 2;
                case "NP": return 3;
                default: return -1;
            }
        }
    }

//####################################### Constructor ###########################################
    public Clerk(String firstName, String lastName, Time birthday, Post post) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.post = post;
        this.ID = id;
        id++;
    }

//################################## getter and setter #########################################
    public String getName() {
        return String.format("%s %s",firstName,lastName);
    }

    public int getID() {
        return this.ID;
    }

    public Time getBirthday() {
        return this.birthday;
    }
}
