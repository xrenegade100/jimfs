package com.google.common.jimfs;

public class FSCacheRemoveException extends RuntimeException {
    public FSCacheRemoveException(Throwable cause) {
        super("Unable to get Runnable for removing the FileSystem from the cache when it is closed", cause);
    }
}
