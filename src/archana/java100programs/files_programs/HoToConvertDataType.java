package archana.java100programs.files_programs;

public class HoToConvertDataType {
    public void StringToInt() {
    String str = "200";
    int i = Integer.parseInt(str);
    System.out.println(i);
    }
    public void IntToString(){
        int i = 50;
        String s= String.valueOf(i);
        System.out.println(s);
    }
    public void StringToLong(){
        String str = "9284064433";
       Long  l = Long.parseLong(str);
        System.out.println(l);
    }
    public void StringToFloat(){
        String str = "23.4";
        Float f = Float.parseFloat(str);
        System.out.println(f);
    }
    public void StringToDouble(){
        String str = "23.4";
        Double f = Double.parseDouble(str);
        System.out.println(f);
    }
    public void FloatToString(){
        Float f = 40.4f;
       String str = String.valueOf(f);
        System.out.println(str);

    }
    public static void main(String[] args) {
        HoToConvertDataType changeToDataType = new HoToConvertDataType();
        changeToDataType.StringToInt();
        changeToDataType.IntToString();
        changeToDataType.StringToLong();
        changeToDataType.StringToFloat();
        changeToDataType.StringToDouble();
        changeToDataType.FloatToString();
    }

}
