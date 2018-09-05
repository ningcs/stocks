package demo.util;

/**
 * Created by blackyadong on 17/4/24.
 */
public class ResponseResult<T> {

    public static final Integer SUCCESS = 0;

    public static final Integer ERROR = 1;

    private Integer code;

    private String msg;

    private T response;

    public ResponseResult(){

    }

    public ResponseResult(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public ResponseResult(Integer code,String msg,T response){
        this.code = code;
        this.msg = msg;
        this.response = response;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    public static ResponseResult errorResult(String msg){
        return new ResponseResult(1,msg);
    }

    public static ResponseResult successResult(String msg){
        return new ResponseResult(0,msg);
    }
}
