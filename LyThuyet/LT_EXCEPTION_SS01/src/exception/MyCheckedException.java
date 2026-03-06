package exception;

public class MyCheckedException extends Exception{
    private String code; //mã lỗi

    public MyCheckedException(String message, String code) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
