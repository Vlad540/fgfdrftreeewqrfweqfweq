package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import java.io.Closeable;

/* renamed from: b13  reason: default package */
public interface b13 extends Closeable, oq6, HasExtraData {
    void close();

    int getHeight();

    oq6 getImageInfo();

    tjb getQualityInfo();

    int getSizeInBytes();

    int getWidth();

    boolean isClosed();

    boolean isStateful();
}
