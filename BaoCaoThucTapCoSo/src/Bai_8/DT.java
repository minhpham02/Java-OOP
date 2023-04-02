package Bai_8;

/**
 *
 * @author ADMIN
 */
public class DT implements Comparable<DT>{
    private String nameSV, idSV, numSV, mailSV, idDT, nameTeacher, nameDT;

    public DT(int n, String nameTeacher, String nameDT) {
        this.idDT = "DT" + String.format("%03d", n);
        this.nameTeacher = nameTeacher;
        this.nameDT = nameDT;
    }

    public void setNameSV(String nameSV) {
        this.nameSV = nameSV;
    }

    public void setIdSV(String idSV) {
        this.idSV = idSV;
    }

    public void setNumSV(String numSV) {
        this.numSV = numSV;
    }

    public void setMailSV(String mailSV) {
        this.mailSV = mailSV;
    }

    public String getIdDT() {
        return idDT;
        }
    @Override
    public String toString(){
        return idSV + " " + nameSV + " " + numSV + " " + mailSV + " " + nameTeacher + " " + nameDT;
    }
    @Override
    public int compareTo(DT d){
        return nameDT.compareTo(d.nameDT);
    }
}
