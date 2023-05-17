package uz.ataboyev.learn_java.exception;

import org.springframework.http.HttpStatus;

import java.util.List;

public class RestException extends RuntimeException{

    private String userMsg;
    private HttpStatus status;

    public RestException(String userMsg) {
        super(userMsg);
        this.userMsg = userMsg;
    }

    public RestException(String userMsg, HttpStatus status) {
        super(userMsg);
        this.userMsg = userMsg;
        this.status = status;
    }
    public static RestException arrayIndexOutOfBoundsException(String message){
        return new RestException("arrayIndexOutOfBoundsException: "+message);
    }


}
