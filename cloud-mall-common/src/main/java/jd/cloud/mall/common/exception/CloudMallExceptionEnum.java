package jd.cloud.mall.common.exception;

public enum CloudMallExceptionEnum {
    NEED_USER_NAME(10001,"USER CANNOT BE EMPTY"),
    NEED_PASSWORD(10002, "PASSWORD CANNOT BE EMPTY"),
    PASSWORD_TOO_SHORT(10003,"PASSWORD SHALL AT LEAST HAVE 8 DIGITS"),
    NAME_EXISTED(10004,"DUPLICATED NAMES"),
    INSERT_FAILED(10005, "FAILED TO INSERT"),
    WRONG_PASSWORD(10006,"PASSWORD ERROR"),
    NEED_LOGIN(10007,"NEDD TO LOGIN"),
    UPDATE_FAILED(10008, "UPDATE ERROR "),
    NEED_ADMIN(10009,"NOT ADMIN"),
    PARA_NOT_NULL(10010, "PARAMETER ANNOT BE EMPTY"),
    CREATE_FAILED(10011,"ERROR CREATE"),
    REQUEST_PARAM_ERROR(10012,"ERROR PARAMETERS"),
    DELETE_FAILED(10013,"ERROR DELETE"),
    MKDIR_FAILED(10014,"DIRECTORY CREATE FAILED"),
    IMAGE_UPLOAD_FAILED(10015,"IMAGE UPLOAD FAILED"),
    BATCH_SHELF_FAILED(10016,"BATCH SHELF UPDATE FAILED"),
    NOT_SALE(10017,"GOOD NOT AVAILABLE"),
    NOT_ENOUGH(10018,"PURCHASE NUMBER EXCEED STOCK"),
    CART_SELECT_EMPTY(10019,"NOT SELECT ANYTHING IN THE CARD"),
    NO_ENUM(10020, "NOT FOUND IN ENUM"),
    ORDER_NOT_EXIST(10021,"The order doesn't exist"),
    WRONG_ORDER_STATUS(10022,"the order status is not correct for the operation"),
    INVALID_EMAIL_ADDRESS(10023,"email address is invalid"),
    INVALID_VERIFICATION_CODE(10024,"Invalid verfification code"),
    TOKEN_EXPIRED(10025,"token expired"),
    TOKEN_ERROR(10026,"token error"),
    CANCEL_WRONG_ORDER_STATUS(10027,"order can't be cancelled due to the status of order"),
    PAY_WRONG_ORDER_STATUS(10028,"order can't be paid due to the status of order"),
    DELIVER_WRONG_ORDER_STATUS(10029,"order can't be Delivered due to the status of order"),
    FINISH_WRONG_ORDER_STATUS(10030,"order can't be finished due to the status of order"),
    EMAIL_ALREADY_BEEN_SENT(10031,"email is already sent"),
    SYSTEM_ERROR(20000,"SYSTEM ERROR"),

    ;
    Integer code;
    String msg;

    CloudMallExceptionEnum(Integer code, String message){
        this.code=code;
        this.msg=message;
    }



    // get and setter
}
