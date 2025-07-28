package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.buffer.ArrayBufferInput;

/* renamed from: lr8  reason: default package */
public abstract class lr8 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final jr8 b;
    public static final kr8 c;

    /* JADX WARNING: type inference failed for: r0v2, types: [jr8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [kr8, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.a = 512;
        obj.b = 8192;
        obj.c = 8192;
        obj.o = true;
        b = obj;
        ? obj2 = new Object();
        obj2.a = true;
        obj2.b = true;
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        obj2.c = codingErrorAction;
        obj2.o = codingErrorAction;
        obj2.X = Integer.MAX_VALUE;
        obj2.Y = 8192;
        obj2.Z = 8192;
        c = obj2;
    }

    public static ws8 a(byte[] bArr) {
        kr8 kr8 = c;
        kr8.getClass();
        return new ws8(new ArrayBufferInput(bArr), kr8);
    }
}
