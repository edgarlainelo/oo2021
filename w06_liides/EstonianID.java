public class EstonianID implements PersonalCodeBehaviour {
  private String code;

  public EstonianID(String code){
    this.code = code;
  }

  @Override
  public String getGender() {
    int gender = Integer.parseInt(code.substring(0, 1));

    /* if (gender % 2 == 0){
      return "Female";
    } else {
      return "Male";
    } */

    return gender % 2 == 0 ? "Female" : "Male";
  }

  @Override
  public int getFullYear() {
    int gender = Integer.parseInt(code.substring(0, 1));
    String year = code.substring(1, 3);

    if (gender == 1 || gender == 2){
      year = "18" + year;
    } else if (gender == 3 || gender == 4){
      year = "19" + year;
    } else if (gender == 5 || gender == 6){
      year = "20" + year;
    }

    return Integer.parseInt(year);

    // From Harry Loog to Everyone:  01:13 PM
    /* int fullYear = 1800 + Math.round(Integer.parseInt(code.substring(0,1))/2)*100 + Integer.parseInt(code.substring(1,3)) ; */
  }

  @Override
  public String getDOB() {
    String day = code.substring(5, 7);
    String month = code.substring(3, 5);
    return day + "/" + month + "/" + getFullYear();
  }

  @Override
  public int getAge() {

    // kodus lõpetada

    return 0;
  }
  
}
