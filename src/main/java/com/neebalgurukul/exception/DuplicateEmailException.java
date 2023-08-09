package com.neebalgurukul.exception;

public class DuplicateEmailException extends Exception {
    public DuplicateEmailException(String msg) {
	super(msg);
    }
}
