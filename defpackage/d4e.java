package defpackage;

import java.io.Closeable;

/* renamed from: d4e  reason: default package */
public interface d4e extends Closeable {
    sz5 getReadableDatabase();

    sz5 getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
