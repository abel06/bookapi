package it.sintegra.bookapi.enums;

public enum ValidationCode implements ErrorCodeConstant {
    MISSING_REQUIRED_FIELDS(MRF_404,"Missing required fields"),
    REQUIRED_FIELD_EMPTY(RFE_422 , "Required filed not found!"),
    ENTITY_NOT_FOUND(ENF_404,"The Required entity not found!"),
    EMPTY_REQUEST_BODY(ERB_400, "The request has no body!"),
    ENTITY_ALREADY_EXIST(EAE_422, "Entity already exist!");


    private final int id;

    public int getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }

    private final String msg;


    ValidationCode(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }

}
