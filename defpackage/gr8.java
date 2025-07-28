package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* renamed from: gr8  reason: default package */
public abstract class gr8 {
    protected volatile int cachedSize = -1;

    public static final <T extends gr8> T mergeFrom(T t, byte[] bArr, int i, int i2) throws InvalidProtocolBufferNanoException {
        try {
            n13 n13 = new n13(bArr, i, i2);
            t.mergeFrom(n13);
            n13.a(0);
            return t;
        } catch (InvalidProtocolBufferNanoException e) {
            throw e;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public static final boolean messageNanoEquals(gr8 gr8, gr8 gr82) {
        int serializedSize;
        if (gr8 == gr82) {
            return true;
        }
        if (gr8 == null || gr82 == null || gr8.getClass() != gr82.getClass() || gr82.getSerializedSize() != (serializedSize = gr8.getSerializedSize())) {
            return false;
        }
        byte[] bArr = new byte[serializedSize];
        byte[] bArr2 = new byte[serializedSize];
        toByteArray(gr8, bArr, 0, serializedSize);
        toByteArray(gr82, bArr2, 0, serializedSize);
        return Arrays.equals(bArr, bArr2);
    }

    public static final void toByteArray(gr8 gr8, byte[] bArr, int i, int i2) {
        try {
            o13 o13 = new o13(bArr, i, i2);
            gr8.writeTo(o13);
            if (o13.a.remaining() != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public abstract int computeSerializedSize();

    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public int getSerializedSize() {
        int computeSerializedSize = computeSerializedSize();
        this.cachedSize = computeSerializedSize;
        return computeSerializedSize;
    }

    public abstract gr8 mergeFrom(n13 n13);

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            xie.D((String) null, this, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            return "Error printing proto: " + e.getMessage();
        } catch (InvocationTargetException e2) {
            return "Error printing proto: " + e2.getMessage();
        }
    }

    public abstract void writeTo(o13 o13);

    public gr8 clone() throws CloneNotSupportedException {
        return (gr8) super.clone();
    }

    public static final <T extends gr8> T mergeFrom(T t, byte[] bArr) throws InvalidProtocolBufferNanoException {
        return mergeFrom(t, bArr, 0, bArr.length);
    }

    public static final byte[] toByteArray(gr8 gr8) {
        int serializedSize = gr8.getSerializedSize();
        byte[] bArr = new byte[serializedSize];
        toByteArray(gr8, bArr, 0, serializedSize);
        return bArr;
    }
}
