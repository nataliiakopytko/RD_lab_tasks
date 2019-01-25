package lesson_6_enums;

public enum Groups {
    PI("Program Engineering", Faculties.FITKI),
    ZI("Information Security", Faculties.FITKI),
    KN("Computer Science", Faculties.FITKI),
    OT("Laser Optotechnics", Faculties.FAKSU),
    PA("Industrial Automatics", Faculties.FAKSU),
    VM("High Mathematics", Faculties.FITKI),
    RT("Radiotechnics", Faculties.FIRN),
    BI("Biomedical Engineering", Faculties.FBTG),
    NN("Electronics and Nanosystems", Faculties.FIE),
    PM("Applied Mechanics", Faculties.FMIB),
    KSA("Computer Control Systems", Faculties.FMT);


    private final String name;
    private final Faculties faculty;

    Groups(String name, Faculties faculty) {
        this.name = name;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return name;
    }
}

