public enum Color {
       CONSTANT1("Red"),
       CONSTANT2("Second constant"),
       CONSTANT3("Third constant"),
       CONSTANT4("Fourth constant"),
        ;
       private String Description;

    Color() {
    }

    Color(String description) {
        Description = description;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}

