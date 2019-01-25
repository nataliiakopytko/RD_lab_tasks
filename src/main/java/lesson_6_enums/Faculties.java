package lesson_6_enums;

public enum Faculties {
    FITKI("Faculty of Information Technologies and Computer Engineering"),
    FAKSU("Faculty of  Computer Systems and Automation"),
    FIE("Faculty of Power Engineering, Ecology and Electrical Mechanics"),
    FMT("Faculty of Management and information security"),
    FBTG("Faculty of Civil Engineering, Thermal Power Engineering and Gas Supply"),
    FIRN("Faculty of Radio Engineering, Telecommunication and Electronic Instrument Engineering"),
    FMIB("Faculty of Machine Building and Transport");

    private final String faculty;

    Faculties(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    @Override
    public String toString() {
        return  faculty;
    }
}
