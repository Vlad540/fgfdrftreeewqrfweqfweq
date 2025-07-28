package defpackage;

import java.io.OutputStream;

/* renamed from: nm6  reason: default package */
public interface nm6 {
    long getContentLength();

    String getContentType();

    void writeTo(OutputStream outputStream);
}
