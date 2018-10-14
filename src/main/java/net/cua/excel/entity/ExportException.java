package net.cua.excel.entity;

/**
 * Created by guanquan.wang at 2017/10/19.
 */
public class ExportException extends RuntimeException {

    public ExportException() {
        super();
    }

    public ExportException(String s) {
        super(s);
    }

    public ExportException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExportException(Throwable cause) {
        super(cause);
    }
}
