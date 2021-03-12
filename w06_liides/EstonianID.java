public class EstonianID implements PersonalCodeBehaviour {
  private String code;

  public EstonianID(String code){
    this.code = code;
  }

  @Override
  public String getGender() {
    int gender = Integer.parseInt(code.substring(0, 1));

    if (gender % 2 == 0){
      return "Female";
    } else {
      return "Male";
    }
  }

  @Override
  public int getFullYear() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public String getDOB() {
    // TODO Auto-generated method stub
    return null;
  }
  
}
