package jd.cloud.mall.common.common;


import java.util.HashMap;
import java.util.Map;

/**
 *  return to Front End, use static to create the instance of APIRestResponse instance
 *  and overloading the constructor method to return different instance
 */
public class ApiRestResponse<T> implements CustomizedResponse{

    private int status;
    private String message;
    private T data;

    public static final int OK_code =10001;
    public static final String OK_message="SUCCESS";


    private ApiRestResponse(){
        // Note: static value can be obtained in instance
        this(OK_code,OK_message);
    }
    private ApiRestResponse(int code,String message){
        this.status=code;
        this.message=message;
    }

    private ApiRestResponse(int code,String message,T data){
        this.status=code;
        this.message=message;
        this.data=data;

    }

//    public static void main(String[] args) {
//       System.out.print(success().getStatus())  ;
//    }

    public static ApiRestResponse success(){
        ApiRestResponse<Object> restResponse = new ApiRestResponse<>();
        return restResponse;
    }

    public static <T> ApiRestResponse<T> success(T result){
        ApiRestResponse<T> apiRestResponse = new ApiRestResponse<>(OK_code,OK_message,result);
        return apiRestResponse;
    }

    public static ApiRestResponse error(int code,String message){
        return new ApiRestResponse<>(code,message);
    }



    // getter and setter


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

interface CustomizedResponse{
    int status = 10001;
    String message="SUCCESS";
    int p=2;


}